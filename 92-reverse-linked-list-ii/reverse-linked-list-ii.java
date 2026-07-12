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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || right == left) return head;
        ListNode firstprev = null;
        ListNode curr = head;
        for(int i = 1;i < left;i++){
            firstprev = curr;
            curr = curr.next;
        }

        ListNode first = curr;
        ListNode prev = null;
        for(int i = 0;i <= right - left;i++){
            
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        if(firstprev != null){
            firstprev.next = prev;
        }
        else{
            head = prev;
        }
        first.next = curr;

        return head;
        
        
    }
}