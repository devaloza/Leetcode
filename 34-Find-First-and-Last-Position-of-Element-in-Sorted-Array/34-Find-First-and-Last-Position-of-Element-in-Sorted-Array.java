class Solution {
    public int[] searchRange(int[] nums, int target) {  
         int[] result = new int[2];
         if (nums.length ==0) {
            //result[0] = -1;
            //result[1]= -1;
            //return result;
            return new int[]{-1, -1};
        }
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        if (left == 0 && right == 0 && target !=nums[0]) {
            result[0] = -1;
            result[1]= -1;
        } else {
            result[0] = left;
            result[1]= right;
        }
       
        return result;
    }
    static int binarySearch(int[] nums, int target, boolean leftBias) {
        int start = 0;
        int end = nums.length -1;
        int i = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                i = mid;
                if (leftBias) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            } else if(nums[mid] < target) {
                // check in right side of mid
                start = mid+1;
            } else {
                // check in left side of mid
                end = mid-1;
            }
        }
        return i;
        }
}