package org.example;

/*
Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.
 */
public class MissingLetter {
    public static char findMissingLetter(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != -1) {
                return (char) (arr[i] + 1);
            }
        }
        return ' ';
    }
}
