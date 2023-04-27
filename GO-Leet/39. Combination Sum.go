package main

import "sort"

func num(candidates, solution []int, target int, result *[][]int) {
	if target == 0 {
		*result = append(*result, solution)
	}

	if len(candidates) == 0 || target < candidates[0] {
		return
	}
	solution = solution[:len(solution):len(solution)]
	num(candidates, append(solution, candidates[0]), target-candidates[0], result)
	num(candidates[1:], solution, target, result)
}

func combinationSum(candidates []int, target int) [][]int {
	sort.Ints(candidates)

	res := [][]int{}
	solution := []int{}
	num(candidates, solution, target, &res)
	return res
}
