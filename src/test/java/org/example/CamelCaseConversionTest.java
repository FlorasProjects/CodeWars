package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseConversionTest {
    @Test
    void stringShouldEqualCamelCase(){
        assertEquals("theTestWorks", CamelCaseConversion.convertToCamelCase("the-test_works"));
    }
    @Test
    void capitalLetterShouldRemainCapital(){
        assertEquals("TheTestWorksHereToo", CamelCaseConversion.convertToCamelCase("The_test-works-here_Too"));
    }
}