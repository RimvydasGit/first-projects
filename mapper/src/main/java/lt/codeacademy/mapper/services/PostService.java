package lt.codeacademy.mapper.services;

import lt.codeacademy.mapper.entities.Post;
import lt.codeacademy.mapper.interfaces.IPostService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {
    public List<Post> getPostsList(
            int page, int size, String sortDir, String sort) {

        PageRequest pageReq
                = PageRequest.of(page, size, Sort.Direction.fromString(sortDir), sort);

        Page<Post> posts = postRepository
                .findByUser(userService.getCurrentUser(), pageReq);
        return posts.getContent();
    }
}
