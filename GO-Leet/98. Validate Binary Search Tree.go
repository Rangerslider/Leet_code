package main

func isValidBST(root *TreeNode) bool {
	return tree(root, nil, nil)
}

func tree(root, min, max *TreeNode) bool {
	if root == nil {
		return true
	}

	if min != nil && root.Val <= min.Val {
		return false
	}
	if max != nil && root.Val >= max.Val {
		return false
	}

	return tree(root.Left, min, root) && tree(root.Right, root, max)
}
