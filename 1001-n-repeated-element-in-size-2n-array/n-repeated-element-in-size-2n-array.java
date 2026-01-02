class Solution {
    public int repeatedNTimes(int[] nums) {
         Map<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return nums[i];
            }
            map.put(nums[i], nums[i]);
         }
         return 0;
    }
}