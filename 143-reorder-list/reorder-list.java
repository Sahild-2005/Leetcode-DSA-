
class Solution {
        public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
        public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
     // next (n) 
        ListNode n = head;

        while(curr!=null){
            n  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;

        } 

        return prev;
    }
    public void reorderList(ListNode head) {
       
       ListNode leftmiddle = middleNode(head);
        ListNode head2 = leftmiddle.next;
       
    // break connection

    leftmiddle.next = null;

    // reverse 2nd half
  head2 =  reverseList(head2);

 

    // dummy node
    ListNode dummy = new ListNode(100);
    ListNode temp = dummy;


 // now make connection alternate 

  while(head!=null && head2!=null){
    temp.next = head;
    head = head.next;
    temp = temp.next;
    temp.next = head2;
    head2 = head2.next;
    temp = temp.next;
   
  }
  if(head==null)  temp.next = head2;
    if(head2==null) temp.next = head;

    head = dummy.next;

    
    }
}