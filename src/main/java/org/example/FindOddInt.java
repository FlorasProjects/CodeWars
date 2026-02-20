package org.example;

import java.util.Arrays;

public class FindOddInt {
    /*
    Given an array of integers, find the one that appears an odd number of times.
    There will always be only one integer that appears an odd number of times.
    */
    private static int findIndexOfInt(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static int findOddInt(int[] arr) {
        int[] numbers = new int[arr.length];
        boolean[] areOdd = new boolean[arr.length];
        Arrays.fill(areOdd, false);
        int count = 0;
        int temp = -1;
        for (int i : arr) {
            temp = findIndexOfInt(i, numbers);
            if (temp == -1) {
                numbers[count] = i;
                areOdd[count] = true;
                count++;
            } else {
                areOdd[temp] = !areOdd[temp];
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            if (areOdd[j]) {
                return numbers[j];
            }
        }
        return -1;
    }

}
