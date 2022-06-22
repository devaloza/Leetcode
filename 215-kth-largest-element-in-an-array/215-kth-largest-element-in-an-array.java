class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length <=0 || nums.length < k) {
            return 0;
        }
        Arrays.sort(nums);
        int len = nums.length;
        int result = nums[len-k];
        return result;
    }
}