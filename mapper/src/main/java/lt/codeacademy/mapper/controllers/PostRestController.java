package lt.codeacademy.mapper.controllers;

import lt.codeacademy.mapper.entities.Post;
import lt.codeacademy.mapper.entities.PostDto;
import lt.codeacademy.mapper.interfaces.IPostService;
import lt.codeacademy.mapper.interfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class PostRestController {

        @Autowired
        private IPostService postService;

        @Autowired
        private IUserService userService;

        @Autowired
        private ModelMapper modelMapper;

        @GetMapping
        @ResponseBody
        public List<PostDto> getPosts() {
           int page = 1;
           int size = 10;
           String sortDir = "asc";
           String sort = "A";
            List<Post> posts = postService.getPostsList(page, size, sortDir, sort);
            return posts.stream()
                    .map(this::convertToDto)
                    .collect(Collectors.toList());
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        @ResponseBody
        public PostDto createPost(@RequestBody PostDto postDto) {
            Post post = convertToEntity(postDto);
            Post postCreated = postService.createPost(post);
            return convertToDto(postCreated);
        }

        @GetMapping(value = "/{id}")
        @ResponseBody
        public PostDto getPost(@PathVariable("id") Long id) {
            return convertToDto(postService.getPostById(id));
        }

        @PutMapping(value = "/{id}")
        @ResponseStatus(HttpStatus.OK)
        public void updatePost(@PathVariable("id") Long id, @RequestBody PostDto postDto) {
            if(!Objects.equals(id, postDto.getId())){
                throw new IllegalArgumentException("IDs don't match");
            }
            Post post = convertToEntity(postDto);
            postService.updatePost(post);
        }
    private PostDto convertToDto(Post post) {
        PostDto postDto = modelMapper.map(post, PostDto.class);
        postDto.setSubmissionDate(post.getSubmissionDate(),
                userService.getCurrentUser().getPreference().getTimezone());
        return postDto;
    }
}
