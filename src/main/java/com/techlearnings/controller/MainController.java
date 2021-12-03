package com.techlearnings.controller;

import com.techlearnings.model.Posts;
import com.techlearnings.service.TechLearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @Autowired
    private TechLearningService techLearningService;

    @CrossOrigin
    @GetMapping("/fetchPost")
    public List<Posts> getRecentPosts() {
       return  techLearningService.getListPost();
    }

    @CrossOrigin
    @PostMapping("/findById")
    public Posts getRecentPosts(@RequestParam String id) {
        return  techLearningService.getPostById(id);
    }
    @CrossOrigin
    @PostMapping("/addPost")
    public void addNewPost(@RequestBody Posts post) {
        String str=post.getPostData();
        str=str.substring(0,50);
        post.setPostPreview(str);
        System.out.println(post.toString());
        techLearningService.addPost(post);
    }


}
