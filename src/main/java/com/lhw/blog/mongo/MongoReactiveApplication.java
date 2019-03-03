package com.lhw.blog.mongo;

import org.springframework.context.annotation.Bean;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;


@EnableReactiveMongoRepositories
public class MongoReactiveApplication extends AbstractReactiveMongoConfiguration {
 
    @Override
    @Bean
    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }
 
    @Override
    protected String getDatabaseName() {
        return "blog";
    }
}