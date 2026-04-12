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
        ListNode current = head;
        ListNode prev = null;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        return prev;
    }
}

// temp -> 1
// curr.next -> null
// prev -> 0
// curr -> 1

// temp -> 2
// curr.next -> 0
// prev -> 1
// curr -> 2

// temp -> 3
// curr.next -> 1
// prev -> 2
// curr -> 3
