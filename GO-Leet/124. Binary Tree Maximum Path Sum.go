/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func maxPathSum(root *TreeNode) int {
	ans := math.MinInt32

	var helper func(*TreeNode) int
	helper = func(root *TreeNode) int {
		if root == nil {
			return 0
		}

		left := max(helper(root.Left), 0)
		right := max(helper(root.Right), 0)
		ans = max(ans, left+right+root.Val)

		return max(left, right) + root.Val
	}

	helper(root)

	return ans
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}