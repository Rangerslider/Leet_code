class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if (mat.length == 0 || mat[0].length == 0) {
            return mat;
        }
        int[][] dist = new int[mat.length][mat[0].length];
        int range = mat.length * mat[0].length;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                } else {
                    int up = (i > 0) ? dist[i - 1][j] : range;
                    int left = (j > 0) ? dist[i][j - 1] : range;
                    dist[i][j] = Math.min(up, left) + 1;
                }
            }
        }

        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[0].length - 1; j >= 0; j--) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                } else {
                    int down = (i < mat.length - 1) ? dist[i + 1][j] : range;
                    int right = (j < mat[0].length - 1) ? dist[i][j + 1] : range;
                    dist[i][j] = Math.min(Math.min(down, right) + 1, dist[i][j]);
                }
            }
        }

        return dist;
    }
}