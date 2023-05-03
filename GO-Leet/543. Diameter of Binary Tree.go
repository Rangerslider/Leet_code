/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
package main

func diameterOfBinaryTree(root *TreeNode) int {
	ans := 0

	if root == nil {
		return ans
	}

	var num func(*TreeNode) int
	num = func(root *TreeNode) int {
		if root == nil {
			return 0
		}

		left := num(root.Left)
		right := num(root.Right)

		ans = max(ans, left+right)

		return max(left, right) + 1
	}

	num(root)

	return ans
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
