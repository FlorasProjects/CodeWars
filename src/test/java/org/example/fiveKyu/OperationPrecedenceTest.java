package org.example.fiveKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationPrecedenceTest {
    @Test
    void testKolejnosci(){
        int expected = 15;
        assertEquals(expected, OperationPrecedence.kolejnosci());
    }
}