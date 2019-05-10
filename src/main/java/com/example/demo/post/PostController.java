package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;


@RestController
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET, path = "/api/posts")
    public List<Post> getAllPosts() {
        return  postService.getAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET, path = "/api/posts/{id}")
    public Post get(@PathVariable int  id) {
        return postService.get(id);
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/api/posts")
    public ResponseEntity<Void> createPost(@RequestBody Post post) {
        URI uri = postService.saveToDatabase(post);
        return ResponseEntity.created(uri).build();
    }



}
