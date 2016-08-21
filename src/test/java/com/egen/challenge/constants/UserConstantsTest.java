package com.egen.challenge.constants;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Smriti on 8/20/2016.
 */
public class UserConstantsTest {

    @Test
    public void testConstants() throws Exception {

        assertTrue(UserConstants.USER_UPDATED.equals("User Updated Successfully"));
        assertTrue(UserConstants.USER_CREATED.equals("User Created Successfully"));
        assertTrue(UserConstants.USER_NOT_CREATED.equals("User Not Created"));
        assertTrue(UserConstants.HTTP_GOOD_REQUEST==200);
        assertTrue(UserConstants.HTTP_BAD_REQUEST==400);
        assertTrue(UserConstants.NO_ROWS.equals("No users exist"));
        assertTrue(UserConstants.USER_EXISTS.equals("User exists"));
        assertTrue(UserConstants.USER_NOT_UPPDATED.equals("User Not Updated"));

    }
}