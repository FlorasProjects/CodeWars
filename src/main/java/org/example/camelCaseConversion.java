package org.example;

public class camelCaseConversion {
    /*
    Complete the method/function so that it converts dash/underscore delimited words into camel casing.
    The first word within the output should be capitalized only if the original word was capitalized
    (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
    */

    public static String convertToCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        boolean isNextLetterCapital = false;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c) && isNextLetterCapital) {
                result.append(Character.toUpperCase(c));
                isNextLetterCapital = false;
            } else if (Character.isLetter(c) && !isNextLetterCapital) {
                result.append(c);
            } else {
                isNextLetterCapital = true;
            }
        }
        return String.valueOf(result);
    }
}
