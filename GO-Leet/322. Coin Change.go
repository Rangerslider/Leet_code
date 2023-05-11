func coinChange(coins []int, amount int) int {
	if amount == 0 {
		return 0
	}

	dp := make([]int, amount+1)
	dp[0] = 0

	for _, coin := range coins {
		if coin <= amount {
			dp[coin] = 1
		}
	}

	for i := 0; i <= amount; i++ {
		if dp[i] != 0 {
			for _, coin := range coins {
				if i+coin <= amount {
					if dp[i+coin] == 0 {
						dp[i+coin] = dp[i] + 1
					} else {
						dp[i+coin] = min(dp[i+coin], dp[i]+1)
					}
				}
			}
		}
	}

	if dp[amount] == 0 {
		return -1
	}

	return dp[amount]
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}