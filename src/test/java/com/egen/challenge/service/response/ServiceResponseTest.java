package com.egen.challenge.service.response;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class ServiceResponseTest {
    ServiceResponse response;
    @Before
    public void setUp() throws Exception {
        response=new ServiceResponse();
        response.setMessage("Hello World");
        response.setStatus(500);
    }
    @Test
    public void getMessage() throws Exception {
        assertTrue(response.getMessage().equals("Hello World"));
    }

    @Test
    public void setMessage() throws Exception {
        response.setMessage("Hello World");
        assertTrue(response.getMessage().equals("Hello World"));
    }

    @Test
    public void getStatus() throws Exception {
        assertTrue(response.getStatus()==500);
    }

    @Test
    public void setStatus() throws Exception {
        response.setStatus(500);
        assertTrue(response.getStatus()==500);
    }

}