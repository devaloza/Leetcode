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
    int count = 0;
     int result = Integer.MIN_VALUE;
    
    public int kthSmallest(TreeNode root, int k) {
        kthSmallesthelper(root, k);
        return result;
    }
    void kthSmallesthelper(TreeNode node, int k){
        if (node == null) return;
        kthSmallesthelper(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        kthSmallesthelper(node.right, k);
    }
}