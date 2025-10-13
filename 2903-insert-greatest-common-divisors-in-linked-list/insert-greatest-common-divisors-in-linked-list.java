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
        
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            
            int gcd=GCD(temp.val,temp.next.val);
            ListNode newnode=new ListNode(gcd);
            newnode.next=temp.next;
            temp.next=newnode;

            temp=newnode.next;
        }
       
        return head;
    }
     public static int GCD(int a,int b){
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            return a;
        }
}