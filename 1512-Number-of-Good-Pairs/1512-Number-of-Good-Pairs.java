class Solution {
    public int numIdenticalPairs(int[] nums) {
        /*if (nums.length %2 !=0) {
            return 0;
        }*/
        int pair = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i+1;
            while (start < nums.length) {
                if (nums[i] == nums[start]) {
                    pair++;
                }
                start++;
            }
        }
        return pair;
    }
}