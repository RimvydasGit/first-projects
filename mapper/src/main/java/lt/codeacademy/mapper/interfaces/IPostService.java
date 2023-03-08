package lt.codeacademy.mapper.interfaces;

import lt.codeacademy.mapper.entities.Post;

import java.util.List;

public interface IPostService {
    List<Post> getPostsList(
            int page, int size, String sortDir, String sort);
}
