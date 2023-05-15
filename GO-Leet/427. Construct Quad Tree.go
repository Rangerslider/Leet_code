func construct(grid [][]int) *Node {
	return helper(grid, 0, 0, len(grid))
}

func helper(grid [][]int, x, y, j int) *Node {
	if allSame(grid, x, y, j) {
		n := &Node{IsLeaf: true}
		if grid[x][y] == 1 {
			n.Val = true
		} else {
			n.Val = false
		}

		return n
	}

	return &Node{
		Val:         true,
		IsLeaf:      false,
		TopLeft:     helper(grid, x, y, j/2),
		TopRight:    helper(grid, x, y+j/2, j/2),
		BottomLeft:  helper(grid, x+j/2, y, j/2),
		BottomRight: helper(grid, x+j/2, y+j/2, j/2)}
}

func allSame(grid [][]int, x, y, j int) bool {
	val := grid[x][y]

	for i := x; i < x+j; i++ {
		for k := y; k < y+j; k++ {
			if grid[i][k] != val {
				return false
			}
		}
	}

	return true
}

