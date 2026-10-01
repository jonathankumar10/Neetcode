# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        slow = head
        fast = head

        while(fast != None and fast.next != None):
            slow = slow.next
            fast = fast.next.next

        mid = slow.next
        slow.next = None
        prev = None

        while(mid != None):
            temp = mid.next
            mid.next = prev
            prev = mid
            mid = temp

        first = head
        second = prev

        while(second != None):
            temp1 = first.next
            temp2 = second.next
            first.next = second
            second.next = temp1
            first = temp1
            second = temp2