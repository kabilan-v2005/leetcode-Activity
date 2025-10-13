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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        // Edge case: if list has only one node, no insertion needed
        

        ListNode curr = head;

        // Traverse till the second last node
        while (curr != null && curr.next != null) {
            int gcdVal = gcd(curr.val, curr.next.val);  // find GCD of two nodes
            ListNode newNode = new ListNode(gcdVal);    // create a new node for GCD

            // Insert newNode between curr and curr.next
            newNode.next = curr.next;
            curr.next = newNode;

            // Move curr two steps ahead
            curr = newNode.next;
        }

        return head;
    }

    // GCD helper function (Euclidean algorithm)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
