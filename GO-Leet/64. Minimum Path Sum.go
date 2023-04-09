func minPathSum(grid [][]int) int {
	m := len(grid)
	if m == 0 {
		return 0
	}
	n := len(grid[0])
	if n == 0 {
		return 0
	}

	paths := make([][]int, m+1)
	for i := range paths {
		paths[i] = make([]int, n+1)
	}
	paths[1][1] = grid[0][0]

	for i := 1; i <= m; i++ {
		for j := 1; j <= n; j++ {
			if i == 1 && j == 1 {
				continue
			} else {
				curr := 0
				if i == 1 {
					curr = paths[i][j-1]
				} else if j == 1 {
					curr = paths[i-1][j]
				} else {
					if paths[i][j-1] < paths[i-1][j] {
						curr = paths[i][j-1]
					} else {
						curr = paths[i-1][j]
					}
				}
				paths[i][j] = curr + grid[i-1][j-1]
			}
		}
	}
	return paths[m][n]
}
