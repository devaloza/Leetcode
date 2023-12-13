class Solution {

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        // Initialize a DP table with dimensions (n + 1) x (amount + 1)
        int[][] dp = new int[n + 1][amount + 1];

        // Base case: If the amount is 0, the minimum number of coins needed is 0 for any denomination.
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // Initialize the DP table for the case where we don't have any coins (i.e., i = 0).
        for (int x = 1; x <= amount; x++) {
            dp[0][x] = Integer.MAX_VALUE; // Set to a large value to represent infinity
        }

        // Fill in the DP table using the recurrence relation
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= amount; x++) {
                dp[i][x] = dp[i - 1][x]; // If we don't use the i-th coin

                // If we can use the i-th coin and it reduces the amount to a non-negative value
                if (x - coins[i - 1] >= 0 && dp[i][x - coins[i - 1]] != Integer.MAX_VALUE) {
                    dp[i][x] = Math.min(dp[i][x], 1 + dp[i][x - coins[i - 1]]);
                }
            }
        }

        // The final result is stored in dp[n][amount]
        return (dp[n][amount] == Integer.MAX_VALUE) ? -1 : dp[n][amount];
    }
}