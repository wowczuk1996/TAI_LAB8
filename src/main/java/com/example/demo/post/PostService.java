package com.example.demo.post;

import java.net.URI;
import java.util.List;

public interface PostService {
    List<Post> getAll();
    URI saveToDatabase(Post post);
    Post get(int id);
}
