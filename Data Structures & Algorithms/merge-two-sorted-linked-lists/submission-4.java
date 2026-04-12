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
    // Time complexity: O(n + m)
    // Space complexity: O(1)
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Initialize result listnode
        ListNode result = new ListNode(0);
        ListNode dummyNode = result;

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        // Iterate through both lists
        // if list1 val is less than list2 val add to result and increment
        if(list1.val<=list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        // if list2 val is less than list1 val add to result and increment
        else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
