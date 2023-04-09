func partitionString(s string) int {
	m := make(map[byte]bool)
	ans := make([]string, 0)

	pre := 0
	for i := 0; i < len(s); i++ {
		if m[s[i]] {
			ans = append(ans, s[pre:i])
			pre = i
			m = make(map[byte]bool)

		}
		m[s[i]] = true
	}

	return len(ans) + 1
}