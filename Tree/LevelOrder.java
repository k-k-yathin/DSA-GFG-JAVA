class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                level.add(curr.data);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            res.add(level);
        }
        return res;
    }
}
