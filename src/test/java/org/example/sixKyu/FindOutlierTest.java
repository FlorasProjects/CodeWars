package org.example.sixKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOutlierTest {
    @Test
    void evenShouldEqualEleven(){
        assertEquals(11, FindOutlier.find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36}));
    }
    @Test
    void oddShouldEqualOneHundredSixty(){
        assertEquals(160, FindOutlier.find(new int[] {160, 3, 1719, 19, 11, 13, -21}));
    }
}