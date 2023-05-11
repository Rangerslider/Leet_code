package main

func rob(nums []int) int {
	if len(nums) == 1 {
		return nums[0]
	}

	arr := []int{nums[0], max(nums[0], nums[1])}

	for i := 2; i < len(nums); i++ {
		arr = append(arr, max(arr[i-1], nums[i]+arr[i-2]))
	}

	return arr[len(arr)-1]
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
