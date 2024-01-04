package LinkedList.leetcode_160_intersection_of_two_linked_lists;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2){
            if (p1 == null){
                p1 = headB;
            }else{
                p1 = p1.next;
            }

            if (p2 == null){
                p2 = headA;
            }else{
                p2 = p2.next;
            }
        }
        return p2;
    }
}