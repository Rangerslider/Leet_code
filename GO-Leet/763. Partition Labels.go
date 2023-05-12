package main

func partitionLabels(s string) []int {
	array := []byte(s)
	n := len(array)
	right := make([]int, 26)

	for i := range right {
		right[i] = -1
	}
	for i, a := range array {
		right[int(a-'a')] = i
	}

	var ans []int
	p, q, sum := 0, 0, 0

	for q < n {
		for ; p < n && p <= q; p++ {
			if q < right[int(array[p]-'a')] {
				q = right[int(array[p]-'a')]
			}
		}
		ans = append(ans, p-sum)
		q = p
		sum += ans[len(ans)-1]
	}
	return ans
}
