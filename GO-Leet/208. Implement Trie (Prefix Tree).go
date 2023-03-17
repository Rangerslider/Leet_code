type Trie struct {
	children   [26]*Trie
	isTerminal bool
}

func Constructor() Trie {
	return Trie{}
}

func (this *Trie) Insert(word string) {
	for i := 0; i < len(word); i++ {
		if this.children[word[i]-'a'] == nil {
			this.children[word[i]-'a'] = &Trie{}
		}
		this = this.children[word[i]-'a']
	}
	this.isTerminal = true
}

func (this *Trie) Search(word string) bool {
	for i := 0; i < len(word); i++ {
		if this.children[word[i]-'a'] == nil {
			return false
		}
		this = this.children[word[i]-'a']
	}
	if this.isTerminal == false {
		return false
	}

	return true
}

func (this *Trie) StartsWith(prefix string) bool {
	for i := 0; i < len(prefix); i++ {
		if this.children[prefix[i]-'a'] == nil {
			return false
		}
		this = this.children[prefix[i]-'a']
	}

	return true
}

/**
 * Your Trie object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Insert(word);
 * param_2 := obj.Search(word);
 * param_3 := obj.StartsWith(prefix);
 */
/**
 * Your Trie object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Insert(word);
 * param_2 := obj.Search(word);
 * param_3 := obj.StartsWith(prefix);
 */