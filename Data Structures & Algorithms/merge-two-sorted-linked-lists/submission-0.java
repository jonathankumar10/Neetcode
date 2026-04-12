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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        ListNode lcurr = list1;
        ListNode rcurr = list2;

        while(lcurr != null && rcurr != null){
            if(lcurr.val < rcurr.val){
                node.next = lcurr;
                lcurr = lcurr.next;
            }
            else{
                node.next = rcurr;
                rcurr = rcurr.next;
            }
            node = node.next;
        }

        if(lcurr != null){
            node.next = lcurr;
        }else{
            node.next = rcurr;
        }

        return dummy.next;
    }
}