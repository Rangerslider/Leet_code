/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
package main

func sumNumbers(root *TreeNode) int {
	return helper(root, 0)

}
func helper(root *TreeNode, sum int) int {
	if root == nil {
		return 0
	}

	if root.Right == nil && root.Left == nil {
		return sum*10 + root.Val

	}
	leftsum := helper(root.Left, sum*10+root.Val)
	rightsum := helper(root.Right, sum*10+root.Val)

	return leftsum + rightsum
}
