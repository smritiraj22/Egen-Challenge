package com.egen.challenge.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

/**
 * @author smraj
 */
@Configuration
public class SpringDataMongoConfig {

    @Bean
    /**
     * Returns the database name in which our documents and collections are
     * stored
     *
     */
    MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClient(), "egen");
    }

    @Bean
    /**
     * Returns the instance of the Mongo DB template
     */
    MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;

    }

}
