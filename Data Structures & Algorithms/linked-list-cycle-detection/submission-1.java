/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // Time complexity: O(n)
    // Space complexity: O(1)
    public boolean hasCycle(ListNode head) {
        // Check base case to see if head or next value is null, return false
        if(head == null || head.next == null){
            return false;
        }

        // Initialize slow and fast listnodes
        ListNode slow = head;
        ListNode fast = head.next;

        // Iterate till slow or fast or next value of fast is null
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // if slow is equal to fast we have found a cycle
            if (slow == fast){
                return true;
            }
        }
        // else we return false
        return false;
    }
}