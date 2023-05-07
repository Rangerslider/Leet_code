/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
package main

func sortedArrayToBST(nums []int) *TreeNode {
	var create func(int, int) *TreeNode
	create = func(start int, end int) *TreeNode {
		if start > end {
			return nil
		}

		mid := (start + end) / 2

		root := &TreeNode{Val: nums[mid]}

		root.Left = create(start, mid-1)
		root.Right = create(mid+1, end)

		return root
	}

	return create(0, len(nums)-1)
}
