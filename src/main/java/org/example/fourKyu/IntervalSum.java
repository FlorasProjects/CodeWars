package org.example.fourKyu;

public class IntervalSum {
/*
Write a function called sumIntervals/sum_intervals that accepts an array of intervals, and returns the sum of all the interval lengths. Overlapping intervals should only be counted once.
Intervals

Intervals are represented by a pair of integers in the form of an array. The first value of the interval will always be less than the second value. Interval example: [1, 5] is an interval from 1 to 5. The length of this interval is 4.
 */

    public static int intervalLength(int[] interval) {
        return interval[1] - interval[0];
    }

    public static int sumIntervals(int[][] intervals) {
        int result = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] >= intervals[i][0] && intervals[j][0] <= intervals[i][1]) {
                    intervals[j][0] = Math.min(intervals[j][0], intervals[i][0]);
                    intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
                    intervals[i] = new int[]{0, 0};
                    break;
                }
                if (intervals[j][1] >= intervals[i][0] && intervals[j][1] <= intervals[i][1]) {
                    intervals[j][0] = Math.min(intervals[j][0], intervals[i][0]);
                    intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
                    intervals[i] = new int[]{0, 0};
                    break;
                }
                if (intervals[j][0] <= intervals[i][0] && intervals[j][1] >= intervals[i][1]) {

                    intervals[j][0] = Math.min(intervals[j][0], intervals[i][0]);
                    intervals[j][1] = Math.max(intervals[j][1], intervals[i][1]);
                    intervals[i] = new int[]{0, 0};
                    break;
                }
            }
        }
        for (int[] interval : intervals) {
            result += interval[1] - interval[0];
        }
        return result;
    }
}
