package org.example.fourKyu;

public class ChangeCounter {
    public static int countChange(final int money, final int[] coins) {
        int possibleChanges = 0;
        int m = money;

        if(m - coins[0] == 0){
            possibleChanges++;
            if(coins.length == 1) {
                return possibleChanges;
            }
            int[] c = new int[coins.length - 1];
            for(int i = 1; i < coins.length; i++){
                c[i - 1] = coins[i];
            }
            possibleChanges += countChange(money, c);
        } else if(m - coins[0] > 0) {
            if(coins.length > 1) {
                int[] c = new int[coins.length - 1];
                for(int i = 1; i < coins.length; i++){
                    c[i - 1] = coins[i];
                }
                possibleChanges += countChange(m, c);
            }
            m -= coins[0];
            possibleChanges += countChange(m, coins);
        } else {
            if(coins.length == 1) {
                return 0;
            }
            int[] c = new int[coins.length - 1];
            for(int i = 1; i < coins.length; i++){
                c[i - 1] = coins[i];
            }
            possibleChanges += countChange(money, c);
        }

        return possibleChanges;
    }
}
