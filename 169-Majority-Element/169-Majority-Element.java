class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2) return nums[0];
        int j = nums.length / 2;
        return nums[j];
    }
}