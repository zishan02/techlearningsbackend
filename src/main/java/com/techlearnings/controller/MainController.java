package com.techlearnings.controller;

import com.techlearnings.model.Posts;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    @CrossOrigin
    @GetMapping("/fetchPost")
    public List<Posts> fetchAll() {
        List<Posts> ls = new ArrayList<>();
        Posts newPost=new Posts();
        newPost.setPostId("1");
        newPost.setPostPreview("This is the preview");
        newPost.setPostTitle("This is test Post");
        newPost.setPostTitle("My First Post");
        newPost.setPostTag("JAVA");
        newPost.setPostData("Finalize method is deprecated");
        ls.add(newPost);
        return ls;
    }

}
