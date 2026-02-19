package org.example;

public class stringOrder {
    public static String orderString(String words) {

        if (words.isEmpty()) {
            return "";
        }

        String[] separateWords = words.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < separateWords.length; i++) {
            for (String word : separateWords) {
                if (word.contains(Integer.toString(i + 1))) {
                    result.append(word);
                    result.append(" ");
                }
            }
        }

        return (result.toString()).substring(0, result.length() - 1);
    }
}
