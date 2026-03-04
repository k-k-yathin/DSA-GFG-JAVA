class Solution {
    int height(Node root) {
        if (root == null) return -1;
        
        int left = height(root.left);
        int right = height(root.right);
        
        return Math.max(left, right) + 1;
    }
}
