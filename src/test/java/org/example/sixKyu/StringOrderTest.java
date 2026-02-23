package org.example.sixKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringOrderTest {

    @Test
    void TwoOneFourThreeShouldEqualOneTwoThreeFour(){
        assertEquals("Thi1s is2 3a T4est", StringOrder.orderString("is2 Thi1s T4est 3a"));
    }

    @Test
    void FourOneSixThreeFiveTwoShouldEqualOneTwoThreeFourFiveSix(){
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", StringOrder.orderString("4of Fo1r pe6ople g3ood th5e the2"));
    }

    @Test
    void NothingShouldEqualNothing(){
        assertEquals("", StringOrder.orderString(""));
    }
}