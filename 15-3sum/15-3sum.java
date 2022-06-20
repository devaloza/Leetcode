class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0 || nums.length < 2) {
            return result;
        }
        Arrays.sort(nums);
        int target = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int first = nums[i];
            int newTarget = target - first;
            int left = i+1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == newTarget) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(first);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    left++;
                    right--;
                    //continue;
                }
                //System.out.printf("sum-->%d%n", nums[left] + nums[right]);
                else if (nums[left] + nums[right] > newTarget) {
                    right--;
                } else {
                    //System.out.printf("left-->%d%n", nums[left]);
                    left++;
                }   
            }
        }
        return result;
    }
}