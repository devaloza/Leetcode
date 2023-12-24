class Solution {
    public int coinChange(int[] coins, int amount) {
        int cLen = coins.length;
        int[][] opt = new int[amount+1][cLen+1];

        for (int i=0; i<amount+1; i++) {
            opt[i][0] = Integer.MAX_VALUE;
            for (int j=1; j<cLen+1; j++) {
                if (i==0) {
                    opt[i][j] = 0;
                    continue;
                }

                if (i < coins[j-1] || opt[i - coins[j-1]][j] == Integer.MAX_VALUE) {
                    opt[i][j] = opt[i][j-1];
                    continue;
                }

                opt[i][j] = Math.min(1 + opt[i - coins[j-1]][j], opt[i][j-1]);
            }
        }

        if (opt[amount][cLen] == Integer.MAX_VALUE) {
            return -1;
        }

        return opt[amount][cLen];
    }
}