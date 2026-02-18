package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class camelCaseConversionTest {
    @Test
    void stringShouldEqualCamelCase(){
        assertEquals("theTestWorks", camelCaseConversion.convertToCamelCase("the-test_works"));
    }
    @Test
    void capitalLetterShouldRemainCapital(){
        assertEquals("TheTestWorksHereToo", camelCaseConversion.convertToCamelCase("The_test-works-here_Too"));
    }
}