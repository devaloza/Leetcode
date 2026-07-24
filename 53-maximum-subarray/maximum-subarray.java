class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int current_sum = 0;
        int best_max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
                current_sum = Math.max(nums[i], current_sum + nums[i]);
                best_max = Math.max(best_max, current_sum);
        }
        return best_max;
    }
}