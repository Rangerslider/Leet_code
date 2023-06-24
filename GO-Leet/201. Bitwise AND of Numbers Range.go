func rangeBitwiseAnd(m int, n int) int {
	var res uint32 = 0
	for m != n {
		m, n = m>>1, n>>1
		res++
	}
	return m << res
}
