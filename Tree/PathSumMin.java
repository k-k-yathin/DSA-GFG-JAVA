class Solution {
    
    int maxSum = Integer.MIN_VALUE;
    
    int findMaxSum(Node root) {
        solve(root);
        return maxSum;
    }
    
    int solve(Node node){
        if(node == null) return 0;
        
        int left = Math.max(0, solve(node.left));
        int right = Math.max(0, solve(node.right));
        
        maxSum = Math.max(maxSum, left + right + node.data);
        
        return node.data + Math.max(left, right);
    }
}
