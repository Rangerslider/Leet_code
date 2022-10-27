/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val ){
            head = head.next;
        }
        
        ListNode cur_node = head;
        
        while(cur_node != null && cur_node.next != null){
            
            if(cur_node.next.val == val){
                cur_node.next = cur_node.next.next;
            }
            else{
            cur_node = cur_node=cur_node.next;
        }
        
        }
        return head;
        }
}