package com.egen.challenge.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class CompanyTest {
    Company company;
    @Before
    public void setUp() throws Exception {
        company = new Company();
        company.setName("Egen");
        company.setWebsite("egen.io");
    }

    @Test
    public void getName() throws Exception {
        assertTrue(company.getName().equals("Egen"));
    }

    @Test
    public void setName() throws Exception {
        company.setName("Egen");
        assertTrue(company.getName().equals("Egen"));
    }

    @Test
    public void getWebsite() throws Exception {
        assertTrue(company.getWebsite().equals("egen.io"));
    }

    @Test
    public void setWebsite() throws Exception {
        company.setWebsite("egen.io");
        assertTrue(company.getWebsite().equals("egen.io"));
    }

}