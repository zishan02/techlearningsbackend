package com.techlearnings.service;

import com.techlearnings.Repository.TechLearningsPostRepo;
import com.techlearnings.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TechLearningService {

    @Autowired
    private TechLearningsPostRepo techLearningsPostRepo;

    public List<Posts> getListPost(){
        List<Posts> posts=techLearningsPostRepo.findAll();
        return posts.subList(posts.size()-5,posts.size());
    }

    public Posts getPostById(String id){

        return techLearningsPostRepo.findById(id).get();
    }

    public boolean addPost(Posts post){

        return techLearningsPostRepo.save(post)!=null;
    }
}
