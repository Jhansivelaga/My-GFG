class Solution {
    public boolean isIdentical(Node r1, Node r2) {
        // if both trees are empty
        if (r1 == null && r2 == null)
            return true;
            
        // if one is null and the other isn't
        if (r1 == null || r2 == null)
            return false;
            
        // if data doesn't match
        if (r1.data != r2.data)
            return false;
            
        // check both left and right subtrees recursively
        return isIdentical(r1.left, r2.left) && isIdentical(r1.right, r2.right);
    }
}
