class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <=0) {
            return;
        }
        k = k%nums.length;
        reverse(nums, 0);
        reverse(nums,k);
    }
    private void reverse(int[] array, int index) {
        int start = 0;
        int end = array.length - 1;
        if (index == 0) {
            while (start < end) {
                swap(array, start, end);
                start++;
                end--;
            }
        } else {
            end = index-1;
            while (start < end) {
                swap(array, start, end);
                start++;
                end--;
            }
            start = index;
            end = array.length - 1;
             while (start < end) {
                swap(array, start, end);
                start++;
                end--;
            }
        }
    }
    private void swap(int[] array2, int start, int end) {
        int temp = array2[start];
        array2[start] = array2[end];
        array2[end] = temp;
    }
}