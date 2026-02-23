package org.example.fiveKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RGBToHexTest {
    @Test
    void ZeroesShouldEqual000000(){
        assertEquals("000000", RGBToHex.rgbToHexConverter(0,0,0));
    }
    @Test
    void TwoHundredFiftyFivesShouldEqualFFFFFF(){
        assertEquals("FFFFFF", RGBToHex.rgbToHexConverter(255,255,255));
    }
    @Test
    void TooBigValuesShouldEqual255() {
        assertEquals("FFFFFF", RGBToHex.rgbToHexConverter(300, 255, 256));
    }
}