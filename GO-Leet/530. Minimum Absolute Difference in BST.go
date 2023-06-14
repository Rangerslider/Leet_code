func getMinimumDifference(root *TreeNode) int {
	minDiff := 1<<31 - 1
	lastNumber := 0
	start := false

	var dfs func(current *TreeNode)
	dfs = func(current *TreeNode) {
		if current != nil {
			dfs(current.Left)
			if start {
				diff := abs(lastNumber - current.Val)
				if diff < minDiff {
					minDiff = diff
				}
			}
			start = true
			lastNumber = current.Val
			dfs(current.Right)
		}
	}

	dfs(root)
	return minDiff
}

func abs(num int) int {
	if num < 0 {
		return -num
	}
	return num
}