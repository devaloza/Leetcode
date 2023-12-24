class Solution {
    public int lengthOfLIS(int[] nums) {
        //   int[] dp = new int[nums.length];
        //   int gMax = 0;
        //   for (int i = 0; i<nums.length; i++) {
        //       dp[i] = 1;
        //       for (int j = 0; j < i; j++) {
        //           if (nums[j] < nums[i]) {
        //               dp[i] = Math.max(dp[i], dp[j]+1);
        //           }
        //       }
        //       gMax = Math.max(gMax, dp[i]);
        //   }
        //   return gMax;
        int[] tails = new int[nums.length];
        int length = 1;
        tails[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > tails[length-1]) {
                tails[length++] = nums[i];
            } else {
                int index = Arrays.binarySearch(tails, 0, length-1, nums[i]);
                if (index < 0) {
                    index = -(index + 1);
                }
                tails[index] = nums[i];
                if (index==length) length++;
            }
        }
        return length;
    }
}