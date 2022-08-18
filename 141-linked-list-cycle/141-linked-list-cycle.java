
public class Solution {
    public boolean hasCycle(ListNode h) {
        
         ListNode a = h;
    ListNode b = h;
    while (b != null && b.next != null) {
      a = a.next;
      b = b.next.next;
      if (a == b)
        return true;
    }
    return false;
    }
}