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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next ==null) return null;
        ListNode fp=head,sp=head,prev=head;
        while(fp!=null && fp.next!=null){
            prev=sp;
            sp=sp.next;
            fp=fp.next.next;
        }
        //prev.val=sp.val;
        prev.next=sp.next;
        return head;
    }
}