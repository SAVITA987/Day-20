package com.bridgelab;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegistrationTest {

	  UserRegistration userRegistration = new UserRegistration();

	    @Test
	    void testValidFirstName() {
	        assertTrue(userRegistration.validateFirstName("Savita"));
	    }

	    @Test
	    void testInvalidFirstName() {
	        assertFalse(userRegistration.validateFirstName("Sa")); 
	        assertFalse(userRegistration.validateFirstName("Savita")); 
	    }

	    @Test
	    void testValidLastName() {
	        assertTrue(userRegistration.validateLastName("Tekale"));
	    }

	    @Test
	    void testInvalidLastName() {
	        assertFalse(userRegistration.validateLastName("Te")); 
	        assertFalse(userRegistration.validateLastName("Tekale"));
	    }

	    @Test
	    void testValidEmail() {
	        assertTrue(userRegistration.validateEmail("savitatekale1234@gmail.com"));
	    }

	    @Test
	    void testInvalidEmail() {
	        assertFalse(userRegistration.validateEmail("invalidemail")); 
	    }

	    @Test
	    void testValidMobile() {
	        assertTrue(userRegistration.validateMobile("91 9919819801"));
	    }

	    @Test
	    void testInvalidMobile() {
	        assertFalse(userRegistration.validateMobile("1234567890")); 
	    }

	    @Test
	    void testValidPassword(String password) {
	        assertTrue(userRegistration.validatePassword("Savita@123"));
	    }

	    @Test
	    void testInvalidPassword(String password) {
	        assertFalse(userRegistration.validatePassword(password));
	    }
	}
