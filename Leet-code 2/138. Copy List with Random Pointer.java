/*

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        
        Node copyDummy = new Node(0), dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy, copyCurr = copyDummy;
        Map<Node, Node> map = new HashMap<>();
        while (curr.next != null) {
            map.putIfAbsent(curr.next, new Node(curr.next.val));
            copyCurr.next = map.get(curr.next);
            if (curr.next.random != null) {
                map.putIfAbsent(curr.next.random, new Node(curr.next.random.val));
                copyCurr.next.random = map.get(curr.next.random);
            }
            
            curr = curr.next;
            copyCurr = copyCurr.next;
        }
        
        return copyDummy.next;
}
}