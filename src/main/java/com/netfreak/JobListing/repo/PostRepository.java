package com.netfreak.JobListing.repo;

import com.netfreak.JobListing.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> { }
