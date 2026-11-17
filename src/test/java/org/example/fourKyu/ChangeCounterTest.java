package org.example.fourKyu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeCounterTest {
/*
Write a function that counts how many different ways you can make change
for an amount of money, given an array of coin denominations. For example,
there are 3 ways to give change for 4 if you have coins with denomination 1 and 2:
1+1+1+1, 1+1+2, 2+2.

1+1+2 == 2+1+1 == 1+2+1

Your function should take an amount to change and an array of unique denominations for the coins:

  new ChangeCounter().countChange(4, new int[] {1,2}) // => 3
  new ChangeCounter().countChange(10, new int[] {5,2,3}) // => 4
  new ChangeCounter().countChange(11, new int[] {5,7}) //  => 0
 */
    @Test
    void given4AndArray65WhenCountChangeThenReturn0(){
        //given
        int amount = 4;
        int[] coins = {6,5};
        int expected = 0;

        //when[
        int output = ChangeCounter.countChange(amount, coins);

        //then
        assertEquals(expected, output);
    }
    @Test
    void given5AndArray32WhenCountChangeThenReturn1(){
        //given
        int amount = 5;
        int[] coins = {3,2};
        int expected = 1;

        //when
        int output = ChangeCounter.countChange(amount, coins);

        //then
        assertEquals(expected, output);
    }
    @Test
    void given6AndArray32WhenCountChangeThenReturn2(){
        //given
        int amount = 6;
        int[] coins = {3,2};
        int expected = 2;

        //when
        int output = ChangeCounter.countChange(amount, coins);

        //then
        assertEquals(expected, output);
    }

    @Test
    void given4AndArray21WhenCountChangeThenReturn3(){
        //given
        int amount = 4;
        int[] coins = {2,1};
        int expected = 3;

        //when
        int output = ChangeCounter.countChange(amount, coins);

        //then
        assertEquals(expected, output);
    }
    @Test
    void given11AndArray731WhenCountChangeThenReturn5(){
        //given
        int amount = 11;
        int[] coins = {7, 3, 1};
        int expected = 6;

        //when
        int output = ChangeCounter.countChange(amount, coins);

        //then
        assertEquals(expected, output);
    }
}
