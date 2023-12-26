class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        backtrack(nums, results, new ArrayList<>(), visited);
        return results;
    }
    private static void backtrack(int[] nums, List<List<Integer>> results, List<Integer> current, boolean [] visited) {
        if (current.size() == nums.length) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == true) continue;
            current.add(nums[i]);
            visited[i] = true;
            backtrack(nums, results, current, visited);
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}