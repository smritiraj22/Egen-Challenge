package com.egen.challenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class AddressTest {
    Address address;
    @Before
    public void setUp() throws Exception {
        address=new Address();
        address.setStreet("Sing Street");
        address.setCity("Chicago");
        address.setZip(400);
        address.setState("IL");
        address.setCountry("USA");
    }

    @Test
    public void getStreet() throws Exception {
        assertTrue(address.getStreet().equals("Sing Street"));
    }

    @Test
    public void setStreet() throws Exception {
        address.setStreet("Sing Street");
        assertTrue(address.getStreet().equals("Sing Street"));
    }

    @Test
    public void getZip() throws Exception {
        assertTrue(address.getZip()==400);
    }

    @Test
    public void setZip() throws Exception {
        address.setZip(400);
        assertTrue(address.getZip()==400);
    }

    @Test
    public void getCity() throws Exception {
        assertTrue(address.getCity().equals("Chicago"));
    }

    @Test
    public void setCity() throws Exception {
        address.setCity("Chicago");
        assertTrue(address.getCity().equals("Chicago"));
    }

    @Test
    public void getState() throws Exception {
        assertTrue(address.getState().equals("IL"));
}

    @Test
    public void setState() throws Exception {
        address.setState("IL");
        assertTrue(address.getState().equals("IL"));
    }

    @Test
    public void getCountry() throws Exception {
        assertTrue(address.getCountry().equals("USA"));
    }

    @Test
    public void setCountry() throws Exception {
        address.setCountry("USA");
        assertTrue(address.getCountry().equals("USA"));
    }

}