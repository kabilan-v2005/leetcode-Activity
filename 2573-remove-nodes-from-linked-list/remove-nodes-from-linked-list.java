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
    public ListNode removeNodes(ListNode head) {
        head=reverse(head); // note this make the key change(reverseing)
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        int max=0;
        while(curr!= null){
            if(curr.val >= max){
                max=curr.val;
                prev=curr;
            }
            else{
                prev.next=curr.next;
            }
            curr=curr.next;
        }
        return reverse(dummy.next);
    }
        private ListNode reverse(ListNode head){
            ListNode prev=null;
            while(head != null){
                ListNode next=head.next;
                head.next=prev;
                prev=head;
                head=next;
            }
            return prev;
        }
    
}