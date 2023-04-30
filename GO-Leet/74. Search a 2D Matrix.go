package main

func searchMatrix(matrix [][]int, target int) bool {
	for _, row := range matrix {
		if target > row[len(row)-1] {
			continue
		} else {
			return binarySearch(row, target)
		}
	}

	return false
}

func binarySearch(row []int, target int) bool {
	left, right := 0, len(row)-1

	for left <= right {
		mid := (left + right) / 2

		if row[mid] == target {
			return true
		} else if row[mid] > target {
			right = mid - 1
		} else {
			left = mid + 1
		}
	}

	return false
}
