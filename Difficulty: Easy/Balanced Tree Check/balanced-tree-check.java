class Solution {
    public boolean isBalanced(Node root) {
        // If height() returns -1, the tree is not balanced
        return height(root) != -1;
    }

    private int height(Node root) {
        // Base case: null tree has height 0
        if (root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // If left or right subtree is unbalanced
        if (leftHeight == -1 || rightHeight == -1)
            return -1;

        // If difference in heights is more than 1 → unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // Otherwise return height of this node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
