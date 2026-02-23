package org.example.sixKyu;

public class StringOrder {
    public static String orderString(String words) {

        if (words.isEmpty()) {
            return "";
        }

        String[] separateWords = words.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < separateWords.length; i++) {
            for (String word : separateWords) {
                if (word.contains(String.valueOf(i + 1))) {
                    result.append(word + " ");
                }
            }
        }

        return result.toString().trim();
    }
}
