package main

func isSymmetric(root *TreeNode) bool {
	return root == nil || help(root.Left, root.Right)
}

func help(left *TreeNode, right *TreeNode) bool {

	if left == nil || right == nil {
		return left == right
	}

	if left.Val != right.Val {
		return false
	}
	return help(left.Left, right.Right) &&
		help(left.Right, right.Left)
}
