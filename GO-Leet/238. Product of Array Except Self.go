package main

func productExceptSelf(nums []int) []int {
	l := len(nums)
	result := make([]int, l)
	left, right := 1, 1
	for i, _ := range nums {
		if i > 0 {
			left = left * nums[i-1]
		}
		result[i] = left
	}
	for j := l - 1; j >= 0; j-- {
		if j < l-1 {
			right = right * nums[j+1]
		}
		result[j] *= right
	}

	return result
}
