class Solution {

    static void solveSudoku2(int[][] board) {
        solve(board);
    }

    static boolean solve(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == 0) {

                    for (int num = 1; num <= 9; num++) {

                        if (isValid(board, i, j, num)) {
                            board[i][j] = num;

                            if (solve(board))
                                return true;

                            board[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValid(int[][] board, int row, int col, int num) {

        for (int k = 0; k < 9; k++) {
            if (board[row][k] == num) return false;
            if (board[k][col] == num) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == num) return false;
            }
        }

        return true;
    }
}
