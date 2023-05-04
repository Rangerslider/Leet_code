package main

func inorderTraversal(root *TreeNode) []int {
	res := make([]int, 0)

	var num func(*TreeNode)
	num = func(root *TreeNode) {
		if root == nil {
			return
		}

		num(root.Left)
		res = append(res, root.Val)
		num(root.Right)
	}

	num(root)

	return res
}
