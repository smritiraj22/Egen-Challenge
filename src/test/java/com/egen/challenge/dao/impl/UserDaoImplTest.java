package com.egen.challenge.dao.impl;

import com.egen.challenge.model.Address;
import com.egen.challenge.model.Company;
import com.egen.challenge.model.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class UserDaoImplTest {
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
    @Test(expected = Exception.class)
    public void createUser() throws Exception {
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        userDaoImpl.createUser(user);
    }

    @Test
    public void getAllUsers() throws Exception {
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        userDaoImpl.getAllUsers();
    }

    @Test
    public void updateUser() throws Exception {
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        user.setFirstName("Preet");
        userDaoImpl.updateUser(user);
    }

}