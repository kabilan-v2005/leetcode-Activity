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
    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode prev=dummy;
        // ListNode temp=head;
        while(prev.next!=null && prev.next.next!=null) {
            ListNode first=prev.next;
            ListNode sec=prev.next.next;
            
            first.next=sec.next;
            sec.next=first;
            prev.next=sec;

            prev=first;
            

        }
        return dummy.next;
    }
}