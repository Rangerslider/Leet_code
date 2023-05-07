package main

func levelOrder(root *TreeNode) [][]int {
	res := make([][]int, 0)

	var helper func(*TreeNode, int)
	helper = func(root *TreeNode, level int) {
		if root == nil {
			return
		}

		if level > len(res) {
			res = append(res, []int{root.Val})
		} else {
			res[level-1] = append(res[level-1], root.Val)
		}

		helper(root.Left, level+1)
		helper(root.Right, level+1)
	}

	helper(root, 1)

	return res
}
