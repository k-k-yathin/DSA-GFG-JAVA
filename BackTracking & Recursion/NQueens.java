import java.util.*;

class Solution {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        boolean[] col = new boolean[n];
        boolean[] diag1 = new boolean[2 * n]; // row - col + n
        boolean[] diag2 = new boolean[2 * n]; // row + col
        int[] board = new int[n];

        solve(0, n, board, col, diag1, diag2);
        return res;
    }

    void solve(int row, int n, int[] board,
               boolean[] col, boolean[] diag1, boolean[] diag2) {

        if (row == n) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int x : board) temp.add(x);
            res.add(temp);
            return;
        }

        for (int c = 0; c < n; c++) {
            int d1 = row - c + n;
            int d2 = row + c;

            if (col[c] || diag1[d1] || diag2[d2]) continue;

            board[row] = c + 1; // 1-based column index
            col[c] = diag1[d1] = diag2[d2] = true;

            solve(row + 1, n, board, col, diag1, diag2);

            col[c] = diag1[d1] = diag2[d2] = false;
        }
    }
}
