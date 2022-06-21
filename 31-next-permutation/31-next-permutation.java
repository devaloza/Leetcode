class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i !=-1 && nums[i+1] <= nums[i]) {
            i--;
        }
        int changeIndex = i;
        if (changeIndex >=0) {
            int j = nums.length - 1;
            while (nums[changeIndex] >= nums[j]) {
                // swap with targetIndex element
                j--;
            }
            swap(nums, changeIndex, j);
        }
        reverse(nums, changeIndex+1);
    }
    private void swap(int[] array, int targetIndex, int swapIndex) {
        int temp = array[targetIndex];
        array[targetIndex] = array[swapIndex];
        array[swapIndex] = temp;
    }
    private void reverse(int[] array, int start) {
        int i = start;
        int j = array.length - 1;
        while (i < j) {
            swap(array, i, j);
            i++;
            j--;
        }
    }
}