class Solution {

    static int preIndex;

    public static Node buildTree(int inorder[], int preorder[]) {
        preIndex = 0;  
        return construct(inorder, preorder, 0, inorder.length - 1);
    }

    static Node construct(int inorder[], int preorder[], int inStart, int inEnd) {

        if (inStart > inEnd)
            return null;

        Node root = new Node(preorder[preIndex++]);

        if (inStart == inEnd)
            return root;

        int inIndex = search(inorder, inStart, inEnd, root.data);

        root.left = construct(inorder, preorder, inStart, inIndex - 1);
        root.right = construct(inorder, preorder, inIndex + 1, inEnd);

        return root;
    }

    static int search(int inorder[], int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value)
                return i;
        }
        return -1;
    }
}
