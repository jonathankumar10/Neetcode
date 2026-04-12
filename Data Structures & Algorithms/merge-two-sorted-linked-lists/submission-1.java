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
        ListNode left = list1;
        ListNode right = list2;
        ListNode ans = new ListNode(0);
        ListNode node = ans;

        while(left != null && right != null){
            if(left.val < right.val){
                node.next = left;
                left = left.next;
            }
            else {
                node.next = right;
                right = right.next;
            }
            node = node.next;
        }

        if(left !=null){
            node.next = left;
        }
        else{
            node.next = right;
        }

        return ans.next;
    }
}