package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrickyQuestionsTest {

    @Test
    void testForQuestion1(){
        int x = 5;
        int y = 2;
        int expected = 15;
        int result = x++ * ++y;
        assertEquals(expected, result);
    }
    @Test
    void testForQuestion2(){
        int a = 3;
        int b = 4;
        int c = a + b * (a = 5);
        int expected = 23;
        assertEquals(expected, c);
    }
    @Test
    void testForQuestion3(){
        int x = 1;
        int y = x++ + ++x + x;
        int expected =  4; // nie widzialam tego ostatniego xa ;-; ale nie zmieniam zeby było fair,
        assertEquals(expected, y);
    }
    @Test
    void testForQuestion4(){
        boolean flag = false;
        String expected = "YES";
        String result;
        if (flag = true) { result = "YES";} else {result = "NO";};
        assertEquals(expected, result);
    }
    @Test
    void testForQuestion5(){
            int x = 10;
            int result = ( x + x++ + --x + x--);
            int expected = 40;
            assertEquals(expected, result);
    }
    @Test
    void testForQuestion6(){
        boolean A = true;
        boolean B = false;
        boolean C = true;
        boolean expected = true;
        boolean result = A || B && !C;
        assertEquals(expected, result);
    }
    @Test
    void testForQuestion7(){
        boolean A = true;
        boolean B = false;
        boolean C = true;
        boolean expected = false;
        boolean result = (A || B) && !C;
        assertEquals(expected, result);
    }
    @Test
    void testForQuestion8(){
        int a = 5;
        int b = 3;
        int expected = 1;
        int result = a & b;
        assertEquals(expected, result);
    }
    @Test
    void testForQuestion9(){
            byte b = 10;
            //b = b + 5;
    }
    @Test
    void testForQuestion10(){
            byte b = 10;
            b += 5;
            byte expected = 15;
            assertEquals(expected, b);
    }
}