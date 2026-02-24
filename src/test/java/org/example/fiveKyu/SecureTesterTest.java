package org.example.fiveKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecureTesterTest {
    @Test
    void givenValidPassword_isSecureShouldReturnTrue() {
        //given
        String validPassword = "APassword1234";

        //then
        assertTrue(SecureTester.isSecure(validPassword));
    }

    @Test
    void givenInvalidPassword_isSecureShouldReturnFalse() {
        //given
        String invalidPassword = "_A Password_1234!#";

        //then
        assertFalse(SecureTester.isSecure(invalidPassword));
    }

    @Test
    void givenEmptyString_isSecureShouldReturnFalse() {
        //given
        String emptyString = "";

        //then
        assertFalse(SecureTester.isSecure(emptyString));
    }
}