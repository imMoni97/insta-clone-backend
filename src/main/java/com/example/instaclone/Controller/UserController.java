package com.example.instaclone.Controller;

import com.example.instaclone.Entity.Users;
import com.example.instaclone.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("")
    private Users submitUser(@RequestBody Users users) {
        return userService.submitMetaDataOfUser(users);
    }

    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId) {
        return userService.displayUserMetaData(userId);
    }
}

