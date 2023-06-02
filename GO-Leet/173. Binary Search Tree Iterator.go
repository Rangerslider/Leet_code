/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
package main

type BSTIterator struct {
	arr []int
}

func Constructor(root *TreeNode) BSTIterator {
	arr := make([]int, 0)

	var add func(root *TreeNode)
	add = func(root *TreeNode) {
		if root == nil {
			return
		}

		add(root.Left)
		arr = append(arr, root.Val)
		add(root.Right)
	}

	add(root)

	return BSTIterator{arr: arr}
}

func (this *BSTIterator) Next() int {
	if len(this.arr) == 0 {
		return -1
	}

	res := this.arr[0]
	this.arr = this.arr[1:]
	return res
}

func (this *BSTIterator) HasNext() bool {
	if len(this.arr) == 0 {
		return false
	}
	return true
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * obj := Constructor(root);
 * param_1 := obj.Next();
 * param_2 := obj.HasNext();
 */
