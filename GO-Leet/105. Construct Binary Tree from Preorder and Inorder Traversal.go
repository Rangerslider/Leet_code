/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
package main

func buildTree(preorder []int, inorder []int) *TreeNode {
	if len(preorder) == 0 {
		return nil
	}

	node := &TreeNode{Val: preorder[0]}

	if len(preorder) == 1 {
		return node
	}

	i := findIndex(inorder, preorder[0])
	node.Left = buildTree(preorder[1:i+1], inorder[0:i])
	node.Right = buildTree(preorder[i+1:], inorder[i+1:])

	return node
}

func findIndex(arr []int, target int) int {
	for i, n := range arr {
		if n == target {
			return i
		}
	}

	return -1
}
