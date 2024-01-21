class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper("", n, 0, 0, result);
        return result;
    }
    static void helper(String current, int n, int o, int c , List<String> result) {
        if (current.length() == 2*n) {
            result.add(current);
            return;
        }
        // call recursive function for open parenthesis
        if (o < n) {
            helper(current+'(', n, o+1, c, result);
        }
        // call recursive function for close parenthesis
        if (c < o) {
            helper(current+')', n, o, c+1, result);
        }
    }
}