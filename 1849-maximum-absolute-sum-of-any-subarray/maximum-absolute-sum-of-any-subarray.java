class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if (nums.length < 0) {
            return 0;
        }
        int currentMin = 0;
        int currentMax = 0;
        int totalMin = 0;
        int totalMax = 0;
        int result = Integer.MIN_VALUE;
        for (int i : nums) {
            currentMin = Math.min(i, currentMin + i);
            currentMax = Math.max(i, currentMax + i);

            totalMin = Math.min(totalMin, currentMin);
            totalMax = Math.max(totalMax, currentMax);
        }
        return Math.max(totalMax, Math.abs(totalMin));
    }
}