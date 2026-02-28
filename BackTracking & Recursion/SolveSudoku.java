class Solution {

    static void solveSudoku(int[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] box = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != 0) {
                    int mask = 1 << board[i][j];
                    int boxIdx = (i / 3) * 3 + (j / 3);
                    row[i] |= mask;
                    col[j] |= mask;
                    box[boxIdx] |= mask;
                }
            }
        }

        solve(board, row, col, box, 0, 0);
    }

    static boolean solve(int[][] board, int[] row, int[] col, int[] box, int i, int j) {
        if (i == 9) return true;
        if (j == 9) return solve(board, row, col, box, i + 1, 0);
        if (board[i][j] != 0) return solve(board, row, col, box, i, j + 1);

        int boxIdx = (i / 3) * 3 + (j / 3);

        for (int num = 1; num <= 9; num++) {
            int mask = 1 << num;

            if ((row[i] & mask) != 0 || (col[j] & mask) != 0 || (box[boxIdx] & mask) != 0)
                continue;

            board[i][j] = num;
            row[i] |= mask;
            col[j] |= mask;
            box[boxIdx] |= mask;

            if (solve(board, row, col, box, i, j + 1))
                return true;

            board[i][j] = 0;
            row[i] &= ~mask;
            col[j] &= ~mask;
            box[boxIdx] &= ~mask;
        }

        return false;
    }
}
