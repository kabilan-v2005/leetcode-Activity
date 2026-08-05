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
    public int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder();
        ListNode temp = head;
        while(temp != null){
            str.append(temp.val);
            temp = temp.next;
        }
        String s = str.toString();
        // int n = Integer.parseInt(s);
        int ans = Integer.parseInt(s,2);
        return ans;

    }
}