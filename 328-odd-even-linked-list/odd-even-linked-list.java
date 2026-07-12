class Solution {
    public ListNode oddEvenList(ListNode head) {
        // FIX: Handle the empty list edge case to prevent NullPointerException
        if (head == null) {
            return null;
        }

        ListNode oddHead = null, oddTail = null;
        ListNode evenHead = null, evenTail = null;

        ListNode current = head;
        int count = 1;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = null; // Severing the link

            if (count % 2 == 1) { // odd position
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            } else { // even position
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            }

            current = nextNode;
            count++;
        }

        // Now oddTail is guaranteed not to be null
        oddTail.next = evenHead;
        head = oddHead;

        return head;
    }
}
