package org.example.fourKyu;

public class RomanNumerals {
  /*
  Write two functions that convert a roman numeral to and from an integer value. Multiple roman numeral values will be tested for each function.

Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals:

    1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC
    2008 is written as 2000=MM, 8=VIII; or MMVIII
    1666 uses each Roman symbol in descending order: MDCLXVI.

Input range : 1 <= n < 4000

In this kata 4 should be represented as IV, NOT as IIII (the "watchmaker's four").
   */

    public static String convertNumber(int input) {
        if (input < 1 || input >= 4000) {
            return "";
        }
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int number = input;
        int i = 0;
        while (number > 0) {
            if (number >= values[i]) {
                result.append(numerals[i]);
                number -= values[i];
            } else {
                i++;
            }
        }
        return result.toString();
    }

    public static int convertNumber(String input) {
        String numerals = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        int result = 0;
        int prevValue = 0;
        int currentValue;
        for (int i = input.length() - 1; i >= 0; i--) {
            currentValue = values[numerals.indexOf(input.charAt(i))];
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }
        return result;
    }
}
