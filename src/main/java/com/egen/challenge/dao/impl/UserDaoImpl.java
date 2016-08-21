package com.egen.challenge.dao.impl;

import com.egen.challenge.constants.UserConstants;
import com.egen.challenge.dao.IUserDao;
import com.egen.challenge.model.User;
import com.egen.challenge.config.SpringDataMongoConfig;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    private MongoOperations mongoOp = loadConfiguration();

    /**
     *  Loads the Mongo specific configuration
     * @return
     */
    private static MongoOperations loadConfiguration() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDataMongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        return mongoOperation;
    }

    /**
     * Creates the user though insert function in mongo db so that a duplicate collection is not created
     * only a new collection is created in a document. We can use save instead of insert to update the collection
     * @param user
     * @throws Exception
     */
    public void createUser(User user) throws Exception {
        boolean isExists = mongoOp.collectionExists(user.getId());
        if (!isExists){
            try {
                mongoOp.insert(user);
            }
            catch(Exception e){
                throw new Exception(UserConstants.USER_EXISTS);
        }
        }
        else
            throw new Exception(UserConstants.USER_EXISTS);
    }

    /**
     * Lists all the users in the collection
     * @return
     */
    public List<User> getAllUsers() {
        List<User> listUsers = (List<User>) mongoOp.findAll(User.class);
        return listUsers;
    }

    /**
     * Fetches a given user and updates only the respective fields
     * does not override the document
     * @param user
     */
    public void updateUser(User user) {
        DBObject userDBObject = (DBObject) mongoOp.getConverter().convertToMongoType(user);
        Update setUpdate = Update.fromDBObject(new BasicDBObject("$set", userDBObject));
        mongoOp.upsert(new Query(Criteria.where("id").is(user.getId())), setUpdate, User.class);

    }

}
