package org.example.fiveKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rot13Test {
    @Test
    void givenAChar_WhenRot13_thenReturnOutput() {
        //given
        char input = 'b';
        char output = 'o';
        //when
        char result = Rot13.rot13(input);
        //then
        assertEquals(output, result);
    }

    @Test
    void givenAString_WhenRot13_thenReturnOutput() {
        //given
        String input = "bleble";
        String output = "oyroyr";
        //when
        String result = Rot13.rot13(input);
        //then
        assertEquals(output, result);
    }

    @Test
    void givenAStringWithCharZ_WhenRot13_thenReturnOutput() {
        //given
        String input = "xyzw";
        String output = "klmj";
        //when
        String result = Rot13.rot13(input);
        //then
        assertEquals(output, result);
    }

    @Test
    void givenAStringWithCapitalLetters_WhenRot13_thenReturnOutput() {
        //given
        String input = "XYZW";
        String output = "KLMJ";
        //when
        String result = Rot13.rot13(input);
        //then
        assertEquals(output, result);
    }

    @Test
    void givenAStringWithNonLetterCharacters_WhenRot13_thenReturnThemUnchanged() {
        //given
        String input = "XYZW12 !";
        String output = "KLMJ12 !";
        //when
        String result = Rot13.rot13(input);
        //then
        assertEquals(output, result);
    }
}