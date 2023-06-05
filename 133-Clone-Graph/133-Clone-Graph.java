
class Solution {
    HashMap<Node, Node> oldToNew = new HashMap();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        if (oldToNew.containsKey(node)) {
            return oldToNew.get(node);
        }
        Node copy = new Node(node.val);
        oldToNew.put(node, copy);
        for (Node neibour : node.neighbors) {
            oldToNew.get(node).neighbors.add(cloneGraph(neibour));
        }
        return copy;
    }
}