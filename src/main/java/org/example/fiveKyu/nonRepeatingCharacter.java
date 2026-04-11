package org.example.fiveKyu;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
Write a function that takes a string input, and returns the first character that is not repeated anywhere in the string.

For example, if given the input "stress", the function should return 't', since the letter t only occurs once in the string, and occurs first in the string.

As an added challenge, upper- and lowercase characters are considered the same character, but the function should return the correct case for the initial character. For example, the input "sTreSS" should return "T".

If a string contains only repeating characters, return an empty string ("");

Note: despite its name in some languages, your function should handle any Unicode codepoint:
 */
public class nonRepeatingCharacter {

    public static String firstNonRepeatingLetter(String input) {
        String result = "";
        String lowerCaseInput = input.toLowerCase();
        for (char c : input.toCharArray()) {
            String emojiText = "U+" + Integer.toHexString(c);
            char lowerCaseChar = Character.toLowerCase(c);
            if (lowerCaseInput.lastIndexOf(lowerCaseChar) == lowerCaseInput.indexOf(lowerCaseChar)) {
                result = Character.toString(c);
                break;
            }
        }
        return result;
    }

    public static String firstNonRepeatingEmoji(String input) {
        String result = "";
        String lowerCaseInput = input.toLowerCase();
        for (char c : input.toCharArray()) {
            char lowerCaseChar = Character.toLowerCase(c);
            String firstElement = String.valueOf(lowerCaseInput.indexOf(lowerCaseChar));
            String lastElement = String.valueOf(lowerCaseInput.lastIndexOf(lowerCaseChar));
            if (comparingElements(firstElement, lastElement)) {
                result = input.substring(input.indexOf(c), input.indexOf(c) + 1);
                break;
            }
        }
        return result;
    }

    public static boolean comparingElements(String first, String last) {
        byte[] firstBytes = first.getBytes(StandardCharsets.UTF_16);
        byte[] lastBytes = last.getBytes(StandardCharsets.UTF_16);

        return Arrays.equals(firstBytes, lastBytes);
    }
}