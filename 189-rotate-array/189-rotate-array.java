class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <=0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums,0, k-1);
        reverse(nums, k, nums.length - 1);
    }
    private void reverse(int[] array, int start, int end) {
        while (start < end) {
                swap(array, start, end);
                start++;
                end--;
            }
    }
    private void swap(int[] array2, int start, int end) {
        int temp = array2[start];
        array2[start] = array2[end];
        array2[end] = temp;
    }
}