func calculate(s string) int {

	num := 0
	stack := []int{}
	exp := 1

	for i := 0; i < len(s); i++ {
		if s[i] >= '0' && s[i] <= '9' {
			num1 := 0
			for ; i < len(s) && s[i] >= '0' && s[i] <= '9'; i++ {
				num1 = 10*num1 + int(s[i]-'0')
			}

			num += exp * num1
			i--
		} else if s[i] == '+' {
			exp = 1
		} else if s[i] == '-' {
			exp = -1
		} else if s[i] == '(' {
			stack = append(stack, num, exp)
			num = 0
			exp = 1
		} else if s[i] == ')' {
			expTmp := stack[len(stack)-1]
			numTmp := stack[len(stack)-2]
			stack = stack[:len(stack)-2]
			num = expTmp*num + numTmp
			exp = 1
		}
	}
	return num
}


