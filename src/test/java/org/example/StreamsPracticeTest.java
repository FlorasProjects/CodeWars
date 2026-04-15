package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StreamsPracticeTest {

    //Write a Java program to calculate the average of a list of integers using streams.
    @Test
    void givenAListOfIntegers_whenCalculateAverageStream_thenReturnAverageValue() {
        List<Integer> input = List.of(1, 2, 6, 5, 12, 100);
        double output = (double) input.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0); //we take the list, convert each int to a double, take the average or 0.0 if there are no values
        double expected = 21.0;
        assertEquals(expected, output);
    }

    //Write a Java program to convert a list of strings to uppercase or lowercase using streams
    @Test
    void givenAListOfStrings_whenCorrectStream_thenAllLowerCaseOrUpperCase() {
        List<String> input = List.of("Word", "Dog", "Mad", "that", "bajo", "Jajo");
        List<String> expected = List.of("word", "dog", "mad", "that", "bajo", "jajo");
        List<String> output = input.stream().map(String::toLowerCase).collect(Collectors.toList());
        assertEquals(expected, output);
    }

    //Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
    @Test
    void givenAListOfInts_whenCorrectStream_thenSumAllOdd() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        int expected = 49;
        int output = input.stream().filter(n -> n % 2 == 1).reduce(0, (a, b) -> a + b);
        assertEquals(expected, output);
    }

    //Write a Java program to remove all duplicate elements from a list using streams.
    @Test
    void givenAListOfElements_whenCorrectStream_thenRemoveDuplicates() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 13, 2, 6, 7, 4, 13);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        List<Integer> output = input.stream().distinct().collect(Collectors.toList());
        assertEquals(expected, output);
    }

    //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
    @Test
    void givenAListOfStrings_whenCorrectStream_thenReturnNumberOfStringsThatStartWithSpecificLetter() {
        List<String> input = List.of("Word", "Dog", "Mad", "that", "bajo", "Jajo", "ja", "ci", "dam", "bajojajo");
        long expected = 2;
        long output = input.stream().filter(s -> s.charAt(0) == 'j' || s.charAt(0) == 'J').count();
        assertEquals(expected, output);
    }

    //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
    @Test
    void givenAListOfStrings_whenCorrectStream_thenReturnSortedListAlphabeticalAndDescending() {
        List<String> input = List.of("Word", "Dog", "Mad", "that", "bajo", "Jajo", "ja", "ci", "dam", "bajojajo");
        List<String> expected = List.of("bajo", "bajojajo", "ci", "dam", "Dog", "ja", "Jajo", "Mad", "that", "Word");
        List<String> output = input.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        assertEquals(expected, output);
    }

    //Write a Java program to find the maximum and minimum values in a list of integers using streams.
    @Test
    void givenAListOfIntegers_whenCorrectStream_thenReturnMaxValue() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 13, 2, 6, 7, 4, 13);
        int expected = 13;
        int output = input.stream().max(Integer::compare).orElse(null);
        assertEquals(expected, output);
    }

    //Write a Java program to find the second smallest and largest elements in a list of integers using streams.
    @Test
    void givenAListOfIntegers_whenCorrectStream_thenReturnSecondSmallestElement() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 13, 2, 6, 7, 4, 13);
        int expected = 2;
        int output = input.stream().distinct().sorted().skip(1).findFirst().orElse(null);
        assertEquals(expected, output);
    }
}