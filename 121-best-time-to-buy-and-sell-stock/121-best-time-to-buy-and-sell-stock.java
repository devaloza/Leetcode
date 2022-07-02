class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        if (prices.length == 2) {
            return Math.max(max, (prices[1] - prices[0]));
        }
        int i = 0;
        int j = 1;
        while (j < prices.length) {
            if (prices[i] < prices[j]) {
                max = Math.max(max, (prices[j] - prices[i]));
            } else {
                i = j;
            }
            j++;
        }
        return max;
    }
}