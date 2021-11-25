package com.example.instaclone.Repository;

import com.example.instaclone.Entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users,Integer> {
    Users save(Users user);
    Users findByUserId(String userId);
}
