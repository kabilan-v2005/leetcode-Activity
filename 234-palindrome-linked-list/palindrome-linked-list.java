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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp=head;
        for(int i=0;i<count/2;i++){
            temp=temp.next;
        }
        ListNode perv=null;
        while(temp!=null){
            ListNode next=temp.next;
            temp.next=perv;
            perv=temp;
            temp=next;
        }
        
        ListNode first=head;
        ListNode last=perv;

        while(last != null){
            if(first.val != last.val) return false;
            first=first.next;
            last=last.next;
        }
        
        
        return true;
        
    }
}