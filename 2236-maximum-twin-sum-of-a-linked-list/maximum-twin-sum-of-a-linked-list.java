class Solution {
    public int pairSum(ListNode head) {
        if(head == null) return 0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast=fast.next.next;
        }                                                            
        ListNode prev=null;
        ListNode curr=slow;
        // int count=0;
        while(curr != null){
            // count++;
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=prev;
        ListNode rigth=head;
        int sum=0;
        while(left != null && rigth != null){
            sum=Math.max(sum,left.val + rigth.val);
            left=left.next;
            rigth=rigth.next;      
        }
        return sum;
        
    }
}