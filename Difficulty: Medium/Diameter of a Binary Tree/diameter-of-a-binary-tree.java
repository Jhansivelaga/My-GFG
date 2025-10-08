class Solution {
    int maxDiameter = 0;
    
    public int diameter(Node root) {
        height(root);
        return maxDiameter;  // already in terms of edges
    }

    private int height(Node root) {
        if (root == null)
            return 0;

        int left = height(root.left);
        int right = height(root.right);

        // update diameter as sum of edges
        maxDiameter = Math.max(maxDiameter, left + right);

        // return height in edges (so +1 for current edge)
        return 1 + Math.max(left, right);
    }
}
