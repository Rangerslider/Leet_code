package main

func decodeString(s string) string {
	return helper(s)
}

func helper(s string) string {
	res := ""

	for i := 0; i < len(s); i++ {

		if s[i] >= '0' && s[i] < '9' {
			endNumber := strings.Index(s[i:], "[") + i
			repeatCount, _ := strconv.Atoi(s[i:endNumber])

			start := endNumber + 1
			i = findScopeEndingBracket(start, s)
			tmp := helper(s[start:i])

			res += strings.Repeat(tmp, repeatCount)
		} else {
			res += string(s[i])
		}
	}

	return res
}

func findScopeEndingBracket(i int, s string) int {
	bracketsCount := 1
	for i < len(s) && bracketsCount > 0 {
		if s[i] == '[' {
			bracketsCount++
		} else if s[i] == ']' {
			bracketsCount--
		}
		i++
	}
	return i - 1
}
