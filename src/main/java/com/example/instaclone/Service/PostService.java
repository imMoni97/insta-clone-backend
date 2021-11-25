package com.example.instaclone.Service;

import com.example.instaclone.Entity.Post;
import com.example.instaclone.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    @Autowired
    UserService userService;

    public Post submitPostToDataBase(Post post) {
        return postRepo.save(post);
    }

    public ArrayList<Post> retrivePostFromDB(){

        ArrayList<Post> postList=postRepo.findAll();

        for(int i=0;i<postList.size();i++) {
            Post postItem=postList.get(i);
            postItem.setUserName(userService.displayUserMetaData(postItem.getUserId()).getUserName());
        }
        Collections.sort(postList,(a, b)->b.getId()-a.getId());
       return postList;
    }

}
