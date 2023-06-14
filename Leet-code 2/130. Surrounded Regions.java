class Solution {
    void fillBoarders(char[][] board, char target, char ch) {
        int row = board.length, col = board[0].length;

        // Checking the left and right column
        for (int r = 0; r < row; r++) {
            if (board[r][0] == target) {
                fill(board, r, 0, target, ch);
            }
            if (board[r][col-1] == target) {
                fill(board, r, col-1, target, ch);
            }
        }

        // Checking first row and last row
        for (int c = 0; c < col; c++) {
            if (board[0][c] == target) {
                fill(board, 0, c, target, ch);
            }
            if (board[row-1][c] == target) {
                fill(board, row-1, c, target, ch);
            }
        }
    } 

    void fill(char[][] board, int row, int col, char target, char ch) {
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) return;
        if (board[row][col] != target) return;
        board[row][col] = ch;
        fill(board, row-1, col, target, ch);
        fill(board, row+1, col, target, ch);
        fill(board, row, col-1, target, ch);
        fill(board, row, col+1, target, ch);
    }

    void replace(char[][] board, char target, char ch) {
        int row = board.length, col = board[0].length;
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (board[r][c] == target) {
                    board[r][c] = ch;
                }
            }
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length < 3 || board[0].length < 3) return;
        fillBoarders(board, 'O', 'Y');
        replace(board, 'O', 'X');
        replace(board, 'Y', 'O');
    }
}