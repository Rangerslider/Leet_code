package main

func maxProduct(nums []int) int {
	res := nums[0]
	max1 := nums[0]
	min1 := nums[0]

	for i := 1; i < len(nums); i++ {
		premax := max1
		max1 = max(nums[i], max1*nums[i], min1*nums[i])
		min1 = min(nums[i], min1*nums[i], premax*nums[i])

		if max1 > res {
			res = max1
		}
	}

	return res
}

func max(a, b, c int) int {
	if a >= b && a >= c {
		return a
	} else if b >= a && b >= c {
		return b
	}

	return c
}

func min(a, b, c int) int {
	if a <= b && a <= c {
		return a
	} else if b <= a && b <= c {
		return b
	}

	return c
}
