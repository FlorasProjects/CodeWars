package org.example.fourKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void givenAnInt_whenConvertNumber_thenReturnRomanNumber() {
        //given
        int input = 10;
        String expected = "X";

        //when
        String result = RomanNumerals.convertNumber(input);

        //then
        assertEquals(expected, result);
    }
    @Test
    void givenAnInt_whenConvertNumber_thenReturnRomanNumberForTheLastDigit() {
        //given
        int input = 1666;
        String expected = "MDCLXVI";

        //when
        String result = RomanNumerals.convertNumber(input);

        //then
        assertEquals(expected, result);
    }
    @Test
    void givenARomanValue_whenConvertNumber_thenReturnIntValue() {
        //given
        String input = "MDCLXVI";
        int expected = 1666;

        //when
        int result = RomanNumerals.convertNumber(input);

        //then
        assertEquals(expected, result);
    }

}