class Solution {
    public int removeDuplicates(int[] nums) {
        int c = 1;
        System.gc();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) {
                nums[c++]=nums[i];
            }
        }
        return c;
    }
}