package org.example.sixKyu;

public class FindOutlierBetter {

    public int findResult(int[] arr) {
        if (isOdd(arr[0]) && isOdd(arr[1])) {
            return getEvenOneOut(arr, false);
        } else if (!isOdd(arr[0]) && !isOdd(arr[1])) {
            return getEvenOneOut(arr, true);
        } else {
            if (isOdd(arr[2])) {
                return getEvenOneOut(arr, false);
            } else {
                return getEvenOneOut(arr, true);
            }
        }
    }

    public int getEvenOneOut(int[] arr, boolean b) {
        for (int n : arr) {
            if (isOdd(n) == b) {
                return n;
            }
        }
        throw new NeitherEvenNorOddException();
    }

    private boolean isOdd(int num) {
        return num % 2 != 0;
    }
}