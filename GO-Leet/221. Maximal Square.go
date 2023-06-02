package main

func maximalSquare(matrix [][]byte) int {
	side := 0

	dp := make([][]int, 0)
	for i := 0; i < len(matrix); i++ {
		dp = append(dp, make([]int, len(matrix[0])))
	}

	for i := 0; i < len(matrix); i++ {
		dp[i][0] = int(matrix[i][0] - '0')
		if dp[i][0] > side {
			side = dp[i][0]
		}
	}

	for i := 0; i < len(matrix[0]); i++ {
		dp[0][i] = int(matrix[0][i] - '0')
		if dp[0][i] > side {
			side = dp[0][i]
		}
	}

	for i := 1; i < len(matrix); i++ {
		for j := 1; j < len(matrix[0]); j++ {
			if matrix[i][j] == '0' {
				dp[i][j] = 0
			} else {
				dp[i][j] = min(dp[i-1][j-1], min(dp[i-1][j], dp[i][j-1])) + 1
			}

			if dp[i][j] > side {
				side = dp[i][j]
			}
		}
	}

	return side * side
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
