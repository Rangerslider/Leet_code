/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
package main

func kthSmallest(root *TreeNode, k int) int {
	ans := 0

	var index func(*TreeNode)
	index = func(root *TreeNode) {
		if root == nil {
			return
		}

		index(root.Left)

		k--
		if k == 0 {
			ans = root.Val
		}

		index(root.Right)
	}

	index(root)

	return ans
}
