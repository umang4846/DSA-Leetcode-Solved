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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
               
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        boolean isSame = false;
        while(head != null){
            while(head.next != null && head.val == head.next.val){
                head = head.next;
                isSame  = true;
            }
            if(isSame){
                prev.next = head.next;
                isSame = false;
            }else{
                prev = head;
            }
            head = head.next;
            
        }
        return dummy.next;
    }
}