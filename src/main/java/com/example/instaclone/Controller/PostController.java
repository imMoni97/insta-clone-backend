package com.example.instaclone.Controller;

import com.example.instaclone.Entity.Post;
import com.example.instaclone.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/post")
public class PostController {

   @Autowired
    PostService postService;

    @PostMapping("")
    private Post submitUserPost(@RequestBody Post post) {
        return postService.submitPostToDataBase(post);
    }

    @GetMapping("")
    private ArrayList<Post> getAllPost(){
        return postService.retrivePostFromDB();
    }
}
