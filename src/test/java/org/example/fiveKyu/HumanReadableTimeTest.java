package org.example.fiveKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableTimeTest {
    @Test
    void givenNumberOutOfBounds_whenMakeReadable_thenReturnMinusOne() {
        //given
        int input = -659999;
        String expected = "-1";

        //when
        String output = HumanReadableTime.makeReadable(input);

        //then
        assertEquals(expected, output);

    }

    @Test
    void givenNumberOfSeconds_whenMakeReadable_thenTimeInProperFormat() {
        //given
        int input = 18084;
        String expected = "05:01:24";

        //when
        String output = HumanReadableTime.makeReadable(input);

        //then
        assertEquals(expected, output);

    }
}