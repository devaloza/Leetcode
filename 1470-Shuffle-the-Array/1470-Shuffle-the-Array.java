class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] shuffle = new int[nums.length];
       for (int i = 0, j = n, idx = 0; idx < shuffle.length; i++, j++) {
            shuffle[idx++] = nums[i];
            shuffle[idx++] = nums[j];
        } 
       return shuffle;
    }
}