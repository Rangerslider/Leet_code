package main

func generateParenthesis(n int) []string {

	var res []string
	generateParenthesis_(n, "", n, &res)
	return res
}

func generateParenthesis_(n int, path string, totalN int, res *[]string) {
	l1 := len(path)
	if l1 == (totalN << 1) {
		*res = append(*res, path)
		return
	}

	if n > 0 {
		generateParenthesis_(n-1, path+"(", totalN, res)
	}
	if l1 < ((totalN - n) << 1) {
		generateParenthesis_(n, path+")", totalN, res)
	}
}
