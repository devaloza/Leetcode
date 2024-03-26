class Solution {
    public int maxProfit(int[] prices) {
        /* int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                maxProfit += prices[i] - min;
            }
            min = prices[i];
        }
        return maxProfit;*/
        int[] dp = new int[prices.length];
        dp[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i] = dp[i-1] + Math.max(0, prices[i]-prices[i-1]);
        }
        return dp[prices.length-1];
    }
}