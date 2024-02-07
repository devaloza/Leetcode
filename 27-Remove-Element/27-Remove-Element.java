class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        int len = nums.length;
        int j = len-1;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                //nums[c++] = nums[i];
                int temp = nums[c];
                nums[c] = nums[i];
                nums[i] = temp;
                c++;
            }
        }
        return c;
    }
}