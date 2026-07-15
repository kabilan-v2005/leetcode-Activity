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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        dummy.next = list1;

        ListNode curr = dummy;

        for(int i = 0;i < a;i++){
            curr = curr.next;
        }
        // curr.next = null;
        ListNode temp = list2;
        while(temp.next != null){
            temp = temp.next;
        }

        
        ListNode end = curr;

        for(int i = 0;i < (b - a) + 2;i++){
            end = end.next;
        }
        
        curr.next = list2;
        
        temp.next = end;

        return dummy.next;
        

    }
}