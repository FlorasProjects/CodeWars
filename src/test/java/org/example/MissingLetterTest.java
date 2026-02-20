package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingLetterTest {

    @Test
    void abcdfShouldEquale() {
        assertEquals('e', MissingLetter.findMissingLetter(new char[] {'d','f','g','h','i'}));
    }

    @Test
    void oqrsShouldEqualp() {
        assertEquals('P', MissingLetter.findMissingLetter(new char[] {'O','Q','R','S'}));
    }
}