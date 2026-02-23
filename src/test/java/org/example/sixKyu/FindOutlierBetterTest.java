package org.example.sixKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindOutlierBetterTest {
FindOutlierBetter findOutlierBetter = new FindOutlierBetter();
    @Test
    void givenArrayWithOneOdd_whenFindResult_thenReturnDifferentNumber() {
        // given
        int[] arr = new int[] {2, 4, 0, 100, 4, 11, 2602, 36};
        int expected = 11;
        // when
        int result = findOutlierBetter.findResult(arr);
        // then
        assertEquals(expected, result);
    }
    @Test
    void givenArrayWithOneEven_whenFindResult_thenReturnDifferentNumber() {
        // given
        int[] arr = new int[] {160, 3, 1719, 19, 11, 13, -21};
        int expected = 160;
        // when
        int result = findOutlierBetter.findResult(arr);
        // then
        assertEquals(expected, result);
    }
}