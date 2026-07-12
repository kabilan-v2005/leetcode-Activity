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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;
        ListNode temp = head;
        while(temp !=  null){
            count++;
            temp = temp.next;
        }
        int parts = count / k;
        int extrapart = count % k;

        ListNode[] ans = new ListNode[k];

        ListNode curr = head;
        ListNode prev = curr;
        for(int i = 0;i < k;i++){
            ListNode newtemp = curr;
            int currentSize = parts;
            //checking for extras in first list
            if(extrapart > 0){
                extrapart--;
                currentSize++;
            }
            int j = 0;
            while(j < currentSize){
                prev = curr;
                curr = curr.next;
                j++;
            }
            if(prev != null){
                prev.next = null;
            }
            ans[i] = newtemp;
        }
        return ans;
    }
}