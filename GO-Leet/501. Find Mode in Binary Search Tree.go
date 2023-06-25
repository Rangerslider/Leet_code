func findMode(root *TreeNode) []int {
	var base, cnt, maxCnt int
	res := make([]int, 0)
	update := func(x int) {
		if x == base {
			cnt++
		} else {
			base = x
			cnt = 1
		}
		if cnt == maxCnt {
			res = append(res, x)
		} else if cnt > maxCnt {
			maxCnt = cnt
			res = []int{x}
		}
	}
	cur := root
	for cur != nil {
		if cur.Left == nil {
			update(cur.Val)
			cur = cur.Right
			continue
		}
		pre := cur.Left
		for pre.Right != nil && pre.Right != cur {
			pre = pre.Right
		}
		if pre.Right == nil {
			pre.Right = cur
			cur = cur.Left
		} else {
			pre.Right = nil
			update(cur.Val)
			cur = cur.Right
		}
	}
	return res
}