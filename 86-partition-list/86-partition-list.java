
class Solution {
    public ListNode partition(ListNode h, int x) {
        ListNode a = new  ListNode(0);
         ListNode b = new  ListNode (0);
         ListNode c =  a;
         ListNode d = b ;
       for (; h != null; h = h.next)
            if (h.val< x) {
        c.next = h;
       c = h;
      } else {
        d.next = h;
       d = h;
      }

    d.next = null;
  c.next = b.next;

    return a.next;
        }
}