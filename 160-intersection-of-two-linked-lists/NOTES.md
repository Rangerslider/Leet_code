​1st e  pointer set korbo p1 to list A.<br>
then  pointer p2 to list B.<br>
Run a while loop and while the nodes pointed by p1 and p2 are not same:<br>
If p1 is pointing to NULL, set p1 to head of B.<br>
Else, move to the next node of A.<br>
If p2 is pointing to NULL, set p2 to head of A.<br>
Else, move to the next node of B.
Return the node pointed by p1. 
Time Complexity:O(N + M),  N and M is the size of the linked list
Space Complexity:O(1), here  no extra space is used.
