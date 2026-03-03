class Solution {
    public List<List<Integer>> resultList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates.length ==1 && candidates[0] == target) {
            return new ArrayList<>(new ArrayList<>(candidates[0]));
        }
        Arrays.sort(candidates);
        backtrack(0, candidates, target, new ArrayList<>(), 0);
        return resultList;
    }
    private void backtrack(int sum, int[] arr, int target, List<Integer> subList, int start) {
        if (target == sum) {
            //System.out.println(subList);
            resultList.add(new ArrayList<>(subList));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = start; i < arr.length; i++) {
            subList.add(arr[i]);
            backtrack(sum + arr[i], arr, target, subList, i);
            subList.remove(subList.size()-1);
        }
    }
}