package com.example.instaclone.Controller;

import com.example.instaclone.Entity.Status;
import com.example.instaclone.Service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("")
    private Status submitStatus(@RequestBody Status status) {
        return statusService.submitDataIntoDB(status);
    }

    @GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusService.retrieveStatus();
    }
}
