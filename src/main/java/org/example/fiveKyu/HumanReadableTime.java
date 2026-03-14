package org.example.fiveKyu;

/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59

The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
 */
public class HumanReadableTime {

    public static String makeReadable(int input) {
        if (input > 359999 || input < 0) {
            return "-1";
        }
        String result = "";
        int hour = input / 3600;
        int minute = (input % 3600) / 60;
        int second = input % 60;

        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}