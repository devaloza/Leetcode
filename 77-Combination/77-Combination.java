class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(n, k, 1, results, new ArrayList<Integer>());
        return results;
    }
    private static void backtrack(int n, int k, int start, List<List<Integer>> results, List<Integer> current) {
        if (k==0) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <=n; i++) {
            current.add(i);
            backtrack(n, k-1, i+1, results, current);
            current.remove(current.size()-1);
        }
    }
}