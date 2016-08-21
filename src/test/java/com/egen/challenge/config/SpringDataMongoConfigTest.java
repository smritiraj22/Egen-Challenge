package com.egen.challenge.config;

import org.junit.Test;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class SpringDataMongoConfigTest {
    @Test
    public void mongoDbFactoryTest() throws Exception {
        SpringDataMongoConfig config=new SpringDataMongoConfig();
        assertTrue( config.mongoDbFactory() instanceof  MongoDbFactory);

    }

    @Test
    public void mongoTemplateTest() throws Exception {
        SpringDataMongoConfig config=new SpringDataMongoConfig();
        assertTrue( config.mongoTemplate() instanceof MongoTemplate);
    }
}