package com.egen.challenge.service.impl;

import com.egen.challenge.constants.UserConstants;
import com.egen.challenge.dao.impl.UserDaoImpl;
import com.egen.challenge.model.User;
import com.egen.challenge.service.IUserService;
import com.egen.challenge.service.response.ServiceResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import spark.Request;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Smriti
 * This class is the concrete implementation of the IUserService
 */
public class UserServiceImpl implements IUserService {

    private UserDaoImpl userDaoImpl = new UserDaoImpl();

    /**
     * Concrete implemetation of create service
     * Takes the json
     * Converts the payload to User class
     * Calls the DaoImpl
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public String create(final Request request) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        User user;
        try {
            user = mapper.readValue(request.body(), User.class);
            userDaoImpl.createUser(user);
            ServiceResponse resonse = new ServiceResponse();
            resonse.setMessage(UserConstants.USER_CREATED);
            resonse.setStatus(UserConstants.HTTP_GOOD_REQUEST);
            return prettyPrint(resonse);
        } catch (IOException e) {
            throw new Exception(e.getMessage());
        }

    }

    /**
     * We get a list of all the users in the document
     * formats it using the prettyPrint utility and sends it back to the driver
     * @return
     * @throws Exception
     */
    @Override
    public String listUsers() throws Exception {

        List<User> allUsers = userDaoImpl.getAllUsers();
        if (allUsers.size() == 0) {
            throw new Exception(UserConstants.NO_ROWS);
        }
        final List<String> users = new ArrayList<String>();
        for (User user : allUsers) {
            try {
                users.add(prettyPrint(user));
            } catch (JsonProcessingException e) {
                throw new Exception(e.getMessage());
            }
        }

        return String.join("\n", users);
    }
    /** Concrete implemetation of update service
     * Takes the json
     * Converts the payload to User class
     * Calls the DaoImpl
     * @param request
     * @return
     * @throws Exception
     */
    @Override
    public String updateUser(final Request request) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        User user;
        try {
            user = mapper.readValue(request.body(), User.class);
            userDaoImpl.updateUser(user);
            ServiceResponse resonse = new ServiceResponse();
            resonse.setMessage(UserConstants.USER_UPDATED);
            resonse.setStatus(UserConstants.HTTP_GOOD_REQUEST);
            return prettyPrint(resonse);
        } catch (IOException e) {
            throw new Exception(UserConstants.USER_NOT_UPPDATED);
        }

    }

    /**
     * Utility method for object mapping
     * @param object
     * @return
     * @throws JsonProcessingException
     */
    private String prettyPrint(final Object object) throws JsonProcessingException {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }

}
