package org.example.fiveKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nonRepeatingCharacterTest {
    @Test
    void given_when_then() {
        //given
        String input = "\uD83D\uDC10\uD83E\uDD8A\uD83D\uDC10";
        String expected = "\uD83E";

        //when
        String output = nonRepeatingCharacter.firstNonRepeatingEmoji(input);

        //then
        assertEquals(expected, output);

    }
    @Test
    void given_when() {
        //given
        String f = "Sttss";
        String l = "Sttss";
        boolean expected = true;

        //when
        boolean output = nonRepeatingCharacter.comparingElements(f, l);

        //then
        assertEquals(expected, output);

    }

}