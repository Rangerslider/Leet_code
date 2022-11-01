
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
              if(head==null) 
              {
                  return null;
              }
        
        ListNode A =new ListNode(0);
        A.next=head;
        
        ListNode back=A;
        ListNode cur =head;
        
        while(cur!=null)
        {
            while(cur.next!=null && cur.val==cur.next.val)
            {
                cur=cur.next;
            }
            
            if(back.next==cur)
            {
                back = back.next;
            }
            
            else
            {
                back.next=cur.next;
            }
            cur=cur.next;
        }
        
        return A.next;
    }
}