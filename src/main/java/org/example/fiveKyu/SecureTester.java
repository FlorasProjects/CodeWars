package org.example.fiveKyu;

public class SecureTester {
    /*
    In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

    The string has the following conditions to be alphanumeric:

        At least one character ("" is not valid)
        Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
        No whitespaces / underscore
     */
    public static boolean isSecure(String password) {

        if (password.isEmpty()) {
            return false;
        }

        for (char c : password.toLowerCase().toCharArray()) {
            if ( (c < 'a' || c > 'z') && (c < '0' || c > '9')) {
                return false;
            }
        }
        return true;
    }
}
