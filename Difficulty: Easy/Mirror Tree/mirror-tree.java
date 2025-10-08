class Solution {
    void mirror(Node root) {
        // base case: if tree is empty
        if (root == null)
            return;

        // swap left and right children
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recursively call for subtrees
        mirror(root.left);
        mirror(root.right);
    }
}
