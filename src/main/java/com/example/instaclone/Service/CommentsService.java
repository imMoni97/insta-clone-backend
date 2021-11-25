package com.example.instaclone.Service;

import com.example.instaclone.Entity.Comments;
import com.example.instaclone.Repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentsService {
    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserService userService;

    public Comments submitCommentToDB(Comments comment) {
        return commentRepo.save(comment);
    }

    public ArrayList<Comments> getAllCommentsForDB(String postId){

        ArrayList<Comments> commentList=commentRepo.findAllByPostId(postId);

        for(int i=0;i<commentList.size();i++) {
            Comments commentItem=commentList.get(i);
            commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId()).getUserName());
        }

        return commentList;

    }
}
