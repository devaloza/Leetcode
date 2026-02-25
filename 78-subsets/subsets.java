class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> subset = new ArrayList<>();
        if (nums.length ==1) {
            subset.add(nums[0]);
            result.add(new ArrayList<>());
            result.add(subset);
            return result;
        }
        backtrack(0, nums, subset);
        return result;
    }
    public void backtrack(int index, int[] arr, ArrayList<Integer> sub){
        result.add(new ArrayList(sub));
        for (int i = index; i < arr.length; i++) {
            sub.add(arr[i]);
            backtrack(i+1, arr, sub);
            sub.remove(sub.size()-1);
        }
    }
}