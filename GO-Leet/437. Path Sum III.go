package main

func pathSum(root *TreeNode, sum int) int {
	if root == nil {
		return 0
	}
	count := 0

	// root is the begin of the sum path
	var dfs func(root *TreeNode, sum int)

	dfs = func(root *TreeNode, sum int) {
		if root == nil {
			return
		}
		if root.Val == sum {
			count++
		}
		dfs(root.Left, sum-root.Val)
		dfs(root.Right, sum-root.Val)
	}

	dfs(root, sum)

	// root.Left or root.Right is the begin of the sum path
	// recursive
	return count + pathSum(root.Left, sum) + pathSum(root.Right, sum)
}
