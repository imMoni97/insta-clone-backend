package com.example.instaclone.Service;

import com.example.instaclone.Entity.Users;
import com.example.instaclone.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;
    public Users submitMetaDataOfUser(Users user) {
        return userRepo.save(user);
    }

    public Users displayUserMetaData(String userid) {
        return userRepo.findByUserId(userid);
    }
}
