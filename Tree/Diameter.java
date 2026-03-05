class Solution {
    
    int diameter = 0;
    public int diameter(Node root) {
        height(root);
        
        return diameter;
        
    }
    int height(Node node){
        if(node==null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        
        diameter = Math.max(diameter,l+r);
        
        return 1+Math.max(l,r);
    }
}
