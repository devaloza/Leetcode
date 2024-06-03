/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result = 0;
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSum = new HashMap<>();
        // Initialize prefixSum with base case
        prefixSum.put(0L, 1);
        return dfs(root, 0, targetSum, prefixSum);
    }
    private int dfs(TreeNode node, long currentSum, int targetSum, Map<Long, Integer> prefixSum) {
        if (node == null) {
            return 0;
        }

        // Update the current sum
        currentSum += node.val;

        // Calculate the number of valid paths ending at the current node
        int pathCount = prefixSum.getOrDefault(currentSum - targetSum, 0);

        // Update the prefixSum map with the current sum
        prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum, 0) + 1);

        // Recursively count paths in the left and right subtrees
        pathCount += dfs(node.left, currentSum, targetSum, prefixSum);
        pathCount += dfs(node.right, currentSum, targetSum, prefixSum);

        // Remove the current sum from the prefixSum map (backtrack)
        prefixSum.put(currentSum, prefixSum.get(currentSum) - 1);

        return pathCount;
    }
}