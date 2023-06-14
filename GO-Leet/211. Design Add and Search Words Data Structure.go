package main

type WordDictionary struct {
	Children   [26]*WordDictionary
	isTerminal bool
}

func Constructor() WordDictionary {
	return WordDictionary{}
}

func (this *WordDictionary) AddWord(word string) {
	for i := 0; i < len(word); i++ {
		if this.Children[word[i]-'a'] == nil {
			this.Children[word[i]-'a'] = &WordDictionary{}
		}
		this = this.Children[word[i]-'a']
	}

	this.isTerminal = true
}

func (this *WordDictionary) Search(word string) bool {
	for i := 0; i < len(word); i++ {
		if word[i] == '.' {
			for j := 0; j < 26; j++ {
				if this.Children[j] != nil && this.Children[j].Search(word[i+1:]) {
					return true
				}
			}

			return false
		}

		if this.Children[word[i]-'a'] == nil {
			return false
		}

		this = this.Children[word[i]-'a']
	}

	if this.isTerminal == true {
		return true
	}

	return false
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * obj := Constructor();
 * obj.AddWord(word);
 * param_2 := obj.Search(word);
 */
