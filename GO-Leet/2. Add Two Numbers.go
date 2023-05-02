package main

func addTwoNumbers(l1 *ListNode, l2 *ListNode) *ListNode {
	p1 := l1
	p2 := l2
	ans := &ListNode{}
	now := ans
	carry := 0

	for p1 != nil || p2 != nil {
		sum := carry

		if p1 != nil {
			sum += p1.Val
			p1 = p1.Next
		}
		if p2 != nil {
			sum += p2.Val
			p2 = p2.Next
		}

		carry = sum / 10
		now.Next = &ListNode{Val: sum % 10}
		now = now.Next
	}

	if carry > 0 {
		now.Next = &ListNode{Val: carry}
	}

	return ans.Next
}
