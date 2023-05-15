package main

func canFinish(n int, pre [][]int) bool {
	node := make([]int, n)
	trees := make([][]int, n)
	next := make([]int, 0, n)

	for _, v := range pre {
		node[v[0]]++
		trees[v[1]] = append(trees[v[1]], v[0])
	}

	for i := 0; i < n; i++ {
		if node[i] == 0 {
			next = append(next, i)
		}
	}

	for i := 0; i != len(next); i++ {
		c := next[i]
		v := trees[c]

		for _, vv := range v {
			node[vv]--
			if node[vv] == 0 {
				next = append(next, vv)
			}
		}
	}

	return len(next) == n
}
