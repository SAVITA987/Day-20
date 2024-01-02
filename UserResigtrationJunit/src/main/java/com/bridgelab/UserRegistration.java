package com.bridgelab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "[A-Z][a-zA-Z]{2,}";
    private static final String EMAIL_PATTERN = "[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2,4})?";
    private static final String MOBILE_PATTERN = "[0-9]{2}\\s[0-9]{10}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}";

    public boolean validateFirstName(String firstName) {
        return validateInput(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) {
        return validateInput(lastName, NAME_PATTERN);
    }

    public boolean validateEmail(String email) {
        return validateInput(email, EMAIL_PATTERN);
    }

    public boolean validateMobile(String mobile) {
        return validateInput(mobile, MOBILE_PATTERN);
    }

    public boolean validatePassword(String password) {
        return validateInput(password, PASSWORD_PATTERN);
    }

    private boolean validateInput(String input, String pattern) {
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(input);
        return matcher.matches();
    }
}
