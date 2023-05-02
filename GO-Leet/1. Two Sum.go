func twoSum(nums []int, target int) []int {
	indexmap := make(map[int]int)

	for currentIdx, currentNum := range nums {
		if index, ok := indexmap[target-currentNum]; ok {
			return []int{currentIdx, index}
		}
		indexmap[currentNum] = currentIdx
	}

	return []int{}
}