package com.egen.challenge.service.impl;

import com.egen.challenge.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import org.junit.Test;


import org.json.JSONObject;
import spark.Spark;

import java.io.IOException;
import java.io.StringWriter;


/**
 * Created by Smriti on 8/20/2016.
 */
public class UserServiceImplTest {

    JSONObject jObject=new JSONObject();
    public static String dataToJson(Object data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            StringWriter sw = new StringWriter();
            mapper.writeValue(sw, data);
            return sw.toString();
        } catch (IOException e) {
            throw new RuntimeException("IOException from a StringWriter?");
        }
    }




    @Test
    public void create() throws Exception {
        IUserService service = new UserServiceImpl();

        Spark.get("/users", (req, res) -> {

            return dataToJson(service.listUsers());
        });


    }

    @Test
    public void listUsers() throws Exception {
        IUserService service = new UserServiceImpl();
        Spark.post("/create", (req, res) -> {

            return service.create(req);
        });

    }

    @Test
    public void updateUser() throws Exception {
        IUserService service = new UserServiceImpl();
        Spark.put("/update", (req, res) -> {

            return service.updateUser(req);
        });
    }

}