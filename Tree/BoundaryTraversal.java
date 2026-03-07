class Solution {
    
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) return res;
        
        if(!isLeaf(root))
            res.add(root.data);
        
        addLeft(root, res);
        
        addLeaves(root, res);
        
        addRight(root, res);
        
        return res;
    }
    
    boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }
    
    void addLeft(Node node, ArrayList<Integer> res){
        Node curr = node.left;
        
        while(curr != null){
            if(!isLeaf(curr))
                res.add(curr.data);
            
            if(curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }
    
    void addLeaves(Node node, ArrayList<Integer> res){
        if(node == null) return;
        
        if(isLeaf(node)){
            res.add(node.data);
            return;
        }
        
        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }
    
    void addRight(Node node, ArrayList<Integer> res){
        Node curr = node.right;
        Stack<Integer> st = new Stack<>();
        
        while(curr != null){
            if(!isLeaf(curr))
                st.push(curr.data);
            
            if(curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }
        
        while(!st.isEmpty())
            res.add(st.pop());
    }
}
