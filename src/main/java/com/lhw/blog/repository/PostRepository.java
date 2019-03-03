package com.lhw.blog.repository;

import com.lhw.blog.domain.Post;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

interface PostRepository extends ReactiveMongoRepository<Post, String>{}