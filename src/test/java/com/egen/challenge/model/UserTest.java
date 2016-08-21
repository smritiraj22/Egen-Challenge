package com.egen.challenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class UserTest {
    User user=new User();
    Address address=new Address();
    Company company=new Company();
    @Before
    public void setUp() throws Exception {
        user=new User();
        user.setId("1234abcd");
        user.setLastName("raj");
        user.setFirstName("smriti");
        user.setEmail("smriti.raj@gmail.com");
        user.setDateCreated("8/22/2020");
        user.setProfilePic("www.facebook.com/123");

        address=new Address();
        address.setStreet("Sing Street");
        address.setCity("Chicago");
        address.setZip(400);
        address.setState("IL");
        address.setCountry("USA");
        user.setAddress(address);

        company=new Company();
        company.setName("Egen");
        company.setWebsite("egen.io");
        user.setCompany(company);


    }

    @Test
    public void getId() throws Exception {
        assertTrue(user.getId().equals("1234abcd"));
    }

    @Test
    public void setId() throws Exception {
        user.setId("1234abcd");
    }

    @Test
    public void getFirstName() throws Exception {
        user.setFirstName("smriti");
        assertTrue(user.getFirstName().equals("smriti"));
    }

    @Test
    public void setFirstName() throws Exception {
        assertTrue(user.getFirstName().equals("smriti"));
    }

    @Test
    public void getLastName() throws Exception {
        assertTrue(user.getLastName().equals("raj"));
    }

    @Test
    public void setLastName() throws Exception {
        user.setLastName("raj");
        assertTrue(user.getLastName().equals("raj"));
    }



    @Test
    public void getDateCreated() throws Exception {
        assertTrue(user.getDateCreated().equals("8/22/2020"));
    }

    @Test
    public void setDateCreated() throws Exception {
        user.setDateCreated("8/22/2020");
        assertTrue(user.getDateCreated().equals("8/22/2020"));
    }

    @Test
    public void getProfilePic() throws Exception {
        assertTrue(user.getProfilePic().equals("www.facebook.com/123"));
    }

    @Test
    public void setProfilePic() throws Exception {
        user.setProfilePic("www.facebook.com/123");
        assertTrue(user.getProfilePic().equals("www.facebook.com/123"));
    }

    @Test
    public void getAddress() throws Exception {

        assertTrue(user.getAddress().getState().equals("IL"));
    }

    @Test
    public void setAddress() throws Exception {
        user.setAddress(address);
        assertTrue(user.getAddress().getState().equals("IL"));
    }

    @Test
    public void getCompany() throws Exception {
        Company com=new Company();
        com.setName("Egen");
        User user=new User();
        user.setCompany(com);
        assertTrue(user.getCompany().getName().equals("Egen"));
    }

    @Test
    public void setCompany() throws Exception {
        Company com=new Company();
        com.setName("Egen");
        User user=new User();
        user.setCompany(com);
        assertTrue(user.getCompany().getName().equals("Egen"));
    }

    @Test
    public void getEmail() throws Exception {
        User user1=new User();
        user1.setEmail("smriti.raj@gmail.com");
        assertTrue(user1.getEmail().equals("smriti.raj@gmail.com"));
    }

    @Test
    public void setEmail() throws Exception {
        User user1=new User();
        user1.setEmail("smriti.raj@gmail.com");
        assertTrue(user1.getEmail().equals("smriti.raj@gmail.com"));
    }

}