package main

import "sort"

func findMedianSortedArrays(num1 []int, num2 []int) float64 {
	return findMedianSortedArrays2(num1, num2)
}

func findMedianSortedArrays2(num1 []int, num2 []int) float64 {

	method := append(num1, num2...)
	sort.Ints(method)
	n := len(method)
	if n%2 == 0 {
		return (float64(method[n/2] + method[(n/2)-1])) / 2
	} else {
		return float64(method[(n-1)/2])
	}
}

func findMedianSortedArrays1(num1 []int, num2 []int) float64 {
	values := []int{}
	if len(num1) == 0 && len(num2) == 0 {
		return 0
	} else if len(num1) == 0 {
		values = append(values, num2...)
	} else if len(num2) == 0 {
		values = append(values, num1...)
	} else {
		i, j := 0, 0
		for i < len(num1) && j < len(num2) {
			item1, item2 := num1[i], num2[j]
			if item1 < item2 {
				values = append(values, item1)
				i++
			} else {
				values = append(values, item2)
				j++
			}
		}

		for i < len(num1) {
			values = append(values, num1[i])
			i++
		}

		for j < len(num2) {
			values = append(values, num2[j])
			j++
		}
	}
	mid := len(values) / 2
	if len(values)%2 != 0 {
		return float64(values[mid])
	} else {
		return float64((values[mid-1] + values[mid])) / 2
	}
}
