class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> results = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }
    private static void backtrack(int[] candidates, int target, int start, List<Integer> currentList, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<Integer>(currentList));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }
            currentList.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, currentList, results);
            currentList.remove(currentList.size() - 1);
        }
    }
}