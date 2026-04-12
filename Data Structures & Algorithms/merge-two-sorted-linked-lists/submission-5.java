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

    // Time complexity: O(m+n)
    // Space complexity: O(m+n)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Base case 1 = if list 1 is null return list 2
        if(list1 == null){
            return list2;
        }

        // Base case 2 = if list 2 is null return list 1
        if(list2 == null){
            return list1;
        }

        // Check if val in list 1 is less than list 2
        // if so then set list1.next value to result of recursive call of list1.next and list2
        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;

        }
        // else set list2.next value to result of recursive call of list1 and list2.next
         else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}