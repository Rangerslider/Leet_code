func minSubArrayLen(target int, nums []int) int {
	ans := len(nums) + 1
	left := 0
	sum := 0

	for i, n := range nums {
		sum += n
		for sum >= target {
			ans = min(ans, i-left+1)
			sum -= nums[left]
			left += 1
		}
	}
	if ans == len(nums)+1 {
		return 0
	} else {
		return ans
	}
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}