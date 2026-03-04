class Solution {
    public List<List<Integer>> resultList = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>());
        return resultList;
    }
    public void backtrack(int start, int[] arr, int target, List<Integer>subList) {
        if (target == 0) {
            resultList.add(new ArrayList<>(subList));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i=start; i< arr.length; i++) {
            if (i > start && arr[i] == arr[i-1]) {
                continue;
            }
            if (arr[i] > target) {
                break;
            }
            subList.add(arr[i]);
            backtrack(i+1, arr, target-arr[i], subList);
            subList.remove(subList.size() - 1);
        }
    }
}