class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null)
            return null;
        ListNode prev = null;
        ListNode front = head.next;

        while (front != null) {
            head.next = prev;
            prev = head;
            head = front;
            front = front.next;
        }
        // front null 
        head.next = prev;
        return head;
    }

    public ListNode doubleIt(ListNode head) {

        ListNode head1 = reverseList(head);
        ListNode ans = head1;
        int carry = 0;
        ListNode prev = null;

        while (head1 != null) {
            int value = head1.val * 2 + carry;
            head1.val = value % 10;
            carry = value / 10;
            prev = head1;
            head1 = head1.next;
        }

        if (carry > 0) {
            prev.next = new ListNode(carry);
        }

        return reverseList(ans);
    }
}