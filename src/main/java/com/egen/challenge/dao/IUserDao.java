package com.egen.challenge.dao;

import com.egen.challenge.model.User;
import java.util.List;

/**
 * @author Smriti
 */
public interface IUserDao {
    /**
     * The implementation of this creates a collection in Mongo DB
     *
     * @param user
     * @throws Exception
     */
    public void createUser(User user) throws Exception;

    /**
     * The implementation of this returns all the User collection in Mongo DB
     * @return
     */
    public List<User> getAllUsers();

    /**
     * The implementation of this updates a collection in Mongo DB
     * @param user
     */
    public void updateUser(User user);

}
