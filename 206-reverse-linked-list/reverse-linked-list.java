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
    public ListNode reverseList(ListNode head) {
        
        if(head==null ) return null;
        ListNode prev = null;
        ListNode front = head.next;

        while(front!=null){
            head.next = prev;
            prev = head;
            head = front;
            front = front.next;
        }
        // front null 
        head.next = prev;
        return head;
    }
}