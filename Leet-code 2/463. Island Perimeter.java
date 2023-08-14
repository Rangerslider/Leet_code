class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, sidenode = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) sidenode++; // count down sidenode
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) sidenode++; // count right sidenode
                }
            }
        }
        return islands * 4 - sidenode * 2;
    }
}