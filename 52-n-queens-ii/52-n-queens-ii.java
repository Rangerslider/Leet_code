class Solution {
     private int count;
    public int totalNQueens(int n) {
      if (n < 0) {
            return 0;
        }
        Set<Integer> cols = new HashSet(); // columns   |
        Set<Integer>   d1 = new HashSet(); // diagonals \
        Set<Integer>   d2 = new HashSet(); // diagonals /
        placeQueens(n, 0, cols, d1, d2);
        return count;
    }

    private void placeQueens(int n, int row, Set<Integer> cols, Set<Integer> d1, Set<Integer> d2) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            int diag1 = col - row;
            int diag2 = col + row;
            if (cols.contains(col) || d1.contains(diag1) || d2.contains(diag2)) {
                continue;
            }
            // put queen on board
            cols.add(col);
            d1.add(diag1);
            d2.add(diag2);

            placeQueens(n, row + 1, cols, d1, d2);

            // remove queen from board
            cols.remove(col);
            d1.remove(diag1);
            d2.remove(diag2);
        }  
    }
}