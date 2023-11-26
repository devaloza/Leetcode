class Solution {
    public int pivotIndex(int[] nums) {
        for (int i=0; i< nums.length; i++) {
            int leftSum = leftSum(nums, i);
            int rightSum = rightSum(nums, i);
            //System.out.println("LeftSum-->"+leftSum);
            //System.out.println("RightSum-->"+rightSum);
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    private int leftSum(int[] nums, int i) {
        if (i == 0) {
            return 0;
        }
        int sum=0;
        for (int j=0; j< i; j++) {
            sum +=nums[j];
        }
        return sum;
    }
    private int rightSum(int[] nums, int i) {
        if (i == nums.length - 1) {
            return 0;
        }
        int sum=0;
        for (int j=i+1; j<= nums.length - 1; j++) {
            sum +=nums[j];
        }
        return sum;
    }
}