/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    StringBuilder sb = new StringBuilder();
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "null";
       helper(root);
       return sb.toString();
    }
    void helper(TreeNode node) {
        if (node == null) {
            sb.append("null#");
            return;
        }
        sb.append(node.val).append("#");
        helper(node.left);
        helper(node.right);
    }
    int index;
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
         //if (data.length() == 1 && data.charAt(0) == '#') return null;
         String[] str = data.split("#");
         index=0;
         return deserializeHelper(str);
    }
    public TreeNode deserializeHelper(String[] str_array) {
        if (str_array[index].equals("null")) { // optional guard depending on split
                index++;
                return null;
            }
        TreeNode node = new TreeNode(Integer.parseInt(str_array[index]));
        index++;
        node.left = deserializeHelper(str_array);
        node.right = deserializeHelper(str_array);
        return node;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));