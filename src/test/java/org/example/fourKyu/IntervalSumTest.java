package org.example.fourKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalSumTest {

    @Test
    void givenAnInterval_whenIntervalLength_thenResultShouldEqualExpectedLength() {
        //given
        int[] interval = {-1,3};
        int expectedLength = 4;

        //when
        int result = IntervalSum.intervalLength(interval);

        //then
        assertEquals(expectedLength, result);

    }
    @Test
    void givenAnArrayOfIntervals_whenSumIntervals_thenResultShouldEqualExpectedLength() {
        //given
        int[][] intervals = {{-3,-1}, {5,7}};
        int expectedLength = 4;

        //when
        int result = IntervalSum.sumIntervals(intervals);

        //then
        assertEquals(expectedLength, result);

    }
    @Test
    void givenAnArrayOfIntervals_whenSumIntervals_thenResultShouldEqualExpectedLengthMinusOverlap() {
        //given
        int[][] intervals = {{0,10}, {-1,7}};
        int expectedLength = 11;

        //when
        int result = IntervalSum.sumIntervals(intervals);

        //then
        assertEquals(expectedLength, result);

    }
    @Test
    void givenAnArrayOfSmallIntervals_whenSumIntervals_thenResultShouldEqualExpectedLengthMinusOverlap() {
        //given
        int[][] intervals = {{-123, -118}, {112, 127}, {91, 109}, {46, 60}, {481, 496},
                {-319, -301}, {13, 23}, {95, 105}, {296, 297}, {-458, -450},
                {-140, -134}, {-472, -469}, {-154, -144}, {-141, -133},
                {239, 256}, {-64, -50}, {340, 355}, {-99, -94},
                {187, 200}, {202, 210}};
        int expectedLength = 197;

        //when
        int result = IntervalSum.sumIntervals(intervals);

        //then
        assertEquals(expectedLength, result);

    }



}