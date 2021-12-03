package com.techlearnings.Repository;

import com.techlearnings.model.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechLearningsPostRepo extends MongoRepository<Posts,String> {
}
