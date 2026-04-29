/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA,p2=headB;
        while(p1!=p2){
            p1=(p1 != null )?p1.next:headA;
            p2=(p2 != null )?p2.next:headB;
        }
        return p2;
    }
}