package org.example.fourKyu;

/*
Your task in order to complete this Kata is to write a function which formats a duration, given as a number of seconds, in a human-friendly way.

The function must accept a non-negative integer. If it is zero, it just returns "now". Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.

It is much easier to understand with an example:

* For seconds = 62, your function should return
    "1 minute and 2 seconds"
* For seconds = 3662, your function should return
    "1 hour, 1 minute and 2 seconds"

 */
public class HumanReadableDurationFormat {

    public static String formatDuration(int input) {
        if (input < 0) {
            return "";
        }
        if (input == 0) {
            return "now";
        }

        String result = "";
        String[] timeMeasurements = {"second", "minute", "hour", "day", "year"};
        int[] timediv = {1, 60, 3600, 86400, 31536000};
        int[] timeValues = new int[5];
        int temp = input;

        for (int i = 4; i >= 0; i--) {
            timeValues[i] = temp / timediv[i];
            temp -= timeValues[i] * timediv[i];
            if (timeValues[i] == 0) {
                continue;
            }
            if (!result.isEmpty()) {
                result += ", ";
            }
            result += timeValues[i] + " " + timeMeasurements[i];
            if (timeValues[i] > 1) {
                result += "s";
            }
        }

        if (result.lastIndexOf(',') != -1) {
            result = result.substring(0, result.lastIndexOf(',')) + " and" + result.substring(result.lastIndexOf(',') + 1);
        }

        return result;
    }

}
