class Solution {
    public int missingNumber(int[] nums) {
     Set<Integer> num = new HashSet<Integer>();
        for (int i:nums) num.add(i);
        int newNumberSize = nums.length + 1;
        for (int j = 0; j < newNumberSize; j++) {
            if (!num.contains(j)) {
                return j;
            }
        }
        return -1;
    }
}