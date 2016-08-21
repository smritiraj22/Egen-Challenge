package com.egen.challenge.service;

import spark.Request;

public interface IUserService {
    /**
     * The sparkjava calls this service to create a user
     * @param request
     * @return
     * @throws Exception
     */
    public String create(final Request request) throws Exception;

    /**
     * The sparkjava calls this service to list all users
     * @return
     * @throws Exception
     */
    public String listUsers() throws Exception;

    /**
     * sparkjava calls this service to update a user
     * @param request
     * @return
     * @throws Exception
     */
    public String updateUser(final Request request) throws Exception;
}
