package com.lhw.blog.repository;

import com.lhw.blog.domain.Post;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Repository
public interface PostRepository extends ReactiveMongoRepository<Post, String>{}