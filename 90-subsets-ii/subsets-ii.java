class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        boolean[] count = new boolean[nums.length];
        if (nums.length ==1) {
            subset.add(nums[0]);
            result.add(new ArrayList<>());
            result.add(subset);
            return result;
        }
        Arrays.sort(nums); 
        backtrack(0, nums, subset, count);
        return result;
    }
    public void backtrack(int index, int[] arr, List<Integer> sub, boolean[] count){
        result.add(new ArrayList(sub));
        for (int i = index; i < arr.length; i++) {
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }
                sub.add(arr[i]);
                backtrack(i+1, arr, sub, count);
                sub.remove(sub.size()-1);
        }
    }  
}