package main

func search(board [][]byte, word string, i, j, d int, visit [][]bool) bool {
	if visit[i][j] == true {
		return false
	}

	if board[i][j] != word[d] {
		return false
	}

	if d == len(word)-1 {
		return true
	}

	visit[i][j] = true

	if i-1 >= 0 {
		if search(board, word, i-1, j, d+1, visit) {
			return true
		}
	}
	if j+1 < len(board[0]) {
		if search(board, word, i, j+1, d+1, visit) {
			return true
		}
	}
	if i+1 < len(board) {
		if search(board, word, i+1, j, d+1, visit) {
			return true
		}
	}
	if j-1 >= 0 {
		if search(board, word, i, j-1, d+1, visit) {
			return true
		}
	}

	visit[i][j] = false

	return false
}

func exist(board [][]byte, word string) bool {

	for i, b := range board {
		for j, _ := range b {

			visit := make([][]bool, len(board))
			for i, _ := range board {
				visit[i] = make([]bool, len(board[0]))
			}

			if search(board, word, i, j, 0, visit) {
				return true
			}
		}
	}

	return false
}
