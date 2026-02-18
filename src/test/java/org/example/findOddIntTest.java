package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findOddIntTest {
    @Test
    void sevenShouldEqualSeven(){
        assertEquals(7, findOddInt.findOddInt(new int[]{7, 1, 1}));
    }

    @Test
    void arrayShouldEqualZero(){
        assertEquals(0, findOddInt.findOddInt(new int[]{0,1,0,1,0}));
    }

    @Test
    void arrayShouldEqualFour(){
        assertEquals(4, findOddInt.findOddInt(new int[]{1,2,2,3,3,3,4,3,3,3,2,2,1}));
    }

}