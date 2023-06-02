package main

import "math/rand"

type RandomizedSet struct {
	m   map[int]int
	arr []int
}

func Constructor() RandomizedSet {
	return RandomizedSet{m: make(map[int]int)}
}

func (this *RandomizedSet) Insert(val int) bool {
	if _, ok := this.m[val]; !ok {
		this.m[val] = len(this.arr)
		this.arr = append(this.arr, val)
		return true
	}
	return false
}

func (this *RandomizedSet) Remove(val int) bool {
	if _, ok := this.m[val]; ok { // if exist
		this.arr[this.m[val]] = this.arr[len(this.arr)-1]
		this.m[this.arr[len(this.arr)-1]] = this.m[val]
		this.arr = this.arr[:len(this.arr)-1]
		delete(this.m, val)
		return true
	}
	return false
}

func (this *RandomizedSet) GetRandom() int {
	k := rand.Intn(len(this.arr))
	return this.arr[k]
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Insert(val);
 * param_2 := obj.Remove(val);
 * param_3 := obj.GetRandom();
 */
