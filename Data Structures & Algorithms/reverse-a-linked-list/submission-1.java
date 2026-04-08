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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head; // current head is 0  
        ListNode prev = null; // used to maintain a previous pointer
        
        // null [0, 1, 2, 3]
        while (curr != null){
            ListNode temp = curr.next; // null
            curr.next = prev; // 1
            prev = curr; // 3
            curr = temp; // 2
        }

        return prev; 
    }
}
