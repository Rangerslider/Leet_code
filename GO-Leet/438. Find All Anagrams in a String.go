package main

func findAnagrams(s string, p string) []int {
	l := len(p)
	res := make([]int, 0)
	m := make(map[byte]int)

	for i := 0; i < l; i++ {
		m[p[i]]++
	}

	sm := make(map[byte]int)
	for i := 0; i < len(s); i++ {
		sm[s[i]]++

		flag := true
		for k := range m {
			if m[k] != sm[k] {
				flag = false
			}
		}

		if flag {
			res = append(res, i-l+1)
		}

		if i-l+1 >= 0 {
			sm[s[i-l+1]]--
			if sm[s[i-l+1]] == 0 {
				delete(sm, s[i-l+1])
			}
		}
	}

	return res
}
