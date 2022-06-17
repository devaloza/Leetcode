class Solution {
    public int[] twoSum(int[] nums, int target) {
        //List<Integer> list = new ArrayList<Integer>();
         int[] arr = new int[2];
        if (nums.length < 2) {
            return arr;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i < nums.length; i++) {
            int targetNumer = target - nums[i];
            if (map.containsKey(targetNumer)) {
                arr[0] = i;
                arr[1] = map.get(targetNumer);
                return arr;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}