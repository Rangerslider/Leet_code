func mergeAlternately(word1 string, word2 string) string {
	index := 0
	ans := make([]byte, 0)

	for index < len(word1) || index < len(word2) {
		if index < len(word1) {
			ans = append(ans, word1[index])
		}

		if index < len(word2) {
			ans = append(ans, word2[index])
		}

		index++
	}

	return string(ans)
}