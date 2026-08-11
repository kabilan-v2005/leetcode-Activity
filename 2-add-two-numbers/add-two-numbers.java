import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Convert l1 to a number
        StringBuilder s = new StringBuilder();
        ListNode temp = l1;

        while (temp != null) {
            s.append(temp.val);
            temp = temp.next;
        }

        s.reverse();

        BigInteger num1 = new BigInteger(s.toString());

        // Convert l2 to a number
        StringBuilder ss = new StringBuilder();
        ListNode temp2 = l2;

        while (temp2 != null) {
            ss.append(temp2.val);
            temp2 = temp2.next;
        }

        ss.reverse();

        BigInteger num2 = new BigInteger(ss.toString());

        // Add the two numbers
        BigInteger sum = num1.add(num2);

        // Put result back into linked list
        String result = sum.toString();

        ListNode curr = l1;
        ListNode prev = null;

        // Result needs to be stored in reverse order
        for (int i = result.length() - 1; i >= 0; i--) {

            int digit = result.charAt(i) - '0';

            if (curr != null) {
                curr.val = digit;
                prev = curr;
                curr = curr.next;
            } else {
                prev.next = new ListNode(digit);
                prev = prev.next;
            }
        }

        return l1;
    }
}