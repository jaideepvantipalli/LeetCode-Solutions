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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        ListNode sp=head,fp=head;
        int i=1;
        while(i++<=n){
            fp=fp.next;
        }
        if(fp == null ) return head.next;
        while(fp.next!=null){
            fp=fp.next;
            sp=sp.next;
        }
        if(sp.next!=null){
            sp.next=sp.next.next;
        }
        return head;
    }
}