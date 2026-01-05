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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        System.out.printf("Root val and target sum is %d and %d", root.val, targetSum);
        System.out.println("-");
        if (root.left == null && root.right == null && targetSum-root.val == 0) {
            System.out.print("--");
            return true;
        }
        System.out.println(targetSum);
        return ((hasPathSum(root.left, targetSum-root.val))|| (hasPathSum(root.right, targetSum-root.val))); 
    }
}