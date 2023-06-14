func findOrder(num int, pre [][]int) []int {

	tree := make([][]int, num)
	root := make([]int, num)

	for _, pre := range pre {
		tree[pre[1]] = append(tree[pre[1]], pre[0])
		root[pre[0]]++
	}

	queue, res := []int{}, []int{}
	for i, v := range root {
		if v == 0 {
			queue = append(queue, i)
		}
	}
	for len(queue) != 0 {
		head := queue[0]
		queue = queue[1:]

		res = append(res, head)
		for _, v := range tree[head] {
			root[v]--
			if root[v] == 0 {
				queue = append(queue, v)
			}
		}
	}

	if len(res) != num {
		return []int{}
	}

	return res
}
