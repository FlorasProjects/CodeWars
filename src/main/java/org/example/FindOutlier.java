package org.example;

public class FindOutlier {
    public static int find(int[] integers) {
        int standard = Math.abs(integers[0] % 2);
        if (standard != Math.abs(integers[1] % 2)) {
            if (standard == Math.abs(integers[2] % 2)) {
                return integers[1];
            } else {
                return integers[0];
            }
        } else {
            for (int i : integers) {
                if (Math.abs(i % 2) != standard) {
                    return i;
                }
            }
        }
        return 0;
    }
}
