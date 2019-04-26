package com.example.demo;

import java.util.List;

public interface PostService {
    List<Post> getAll();

    Post get(int id);
}
