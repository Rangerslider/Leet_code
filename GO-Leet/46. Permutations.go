package main

func permute(nums []int) [][]int {
	ans := make([][]int, 0)
	per := make([]int, len(nums))
	visit := make([]bool, len(nums))

	var num func(int)
	num = func(index int) {
		if index == len(nums) {
			ans = append(ans, append([]int{}, per...))
			return
		}

		for i := 0; i < len(nums); i++ {
			if !visit[i] {
				visit[i] = true
				per[index] = nums[i]
				num(index + 1)
				visit[i] = false
			}
		}
	}

	num(0)

	return ans
}
