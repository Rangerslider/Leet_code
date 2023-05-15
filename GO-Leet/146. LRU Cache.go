package main

type LRUCache struct {
	cap int
	m   map[int]*list.Element
	l   *list.List
}

type pair struct {
	k, v int
}

func Constructor(capacity int) LRUCache {
	return LRUCache{cap: capacity, m: make(map[int]*list.Element), l: list.New()}
}

func (this *LRUCache) Get(key int) int {
	if num, ok := this.m[key]; ok {
		this.l.MoveToFront(num)
		return num.Value.(pair).v
	}
	return -1
}

func (this *LRUCache) Put(key int, value int) {
	if num, ok := this.m[key]; ok {
		num.Value = pair{key, value}
		this.l.MoveToFront(num)
		return
	}
	this.m[key] = this.l.PushFront(pair{key, value})
	if len(this.m) > this.cap {
		rear := this.l.Back()
		this.l.Remove(rear)
		delete(this.m, rear.Value.(pair).k)
	}
}
