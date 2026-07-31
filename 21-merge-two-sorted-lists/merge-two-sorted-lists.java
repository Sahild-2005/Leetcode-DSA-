class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    // base case 
    if(list1==null && list2==null) return null;
    if(list1==null) return list2;
    if(list2==null) return list1;
    
ListNode head = new ListNode(-1);
ListNode temp = head;

    while(list1!=null && list2!=null){

        if(list1.val<=list2.val) {
            temp.next = list1;
            temp = list1;
            list1 = list1.next;
        }

        else{
            // list 2 is smaller
            temp.next = list2;
            temp = list2;
            list2 = list2.next;

        }
    }

    if(list1==null){
        while(list2!=null){
            temp.next = list2;
            temp = list2;
            list2 = list2.next;
        }
    }
    if(list2 == null){
        while(list1!=null){
              temp.next = list1;
            temp = list1;
            list1 = list1.next;
        }
    }
    return head.next;
    }
}