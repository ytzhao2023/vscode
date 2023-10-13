# Definition for singly-linked list.
class ListNode(object):
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        current_head = head
        pre_head = None
        while current_head is not None:
            temp = current_head.next
            current_head.next = pre_head
            pre_head = current_head
            current_head = temp
        return pre_head
