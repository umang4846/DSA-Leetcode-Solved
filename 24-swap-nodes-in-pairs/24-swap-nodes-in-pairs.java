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
    public ListNode swapPairs(ListNode head) {
        //Declare a dummy node
        ListNode temp = new ListNode(0);
        temp.next = head;
        //Declare current node for iteration
        ListNode current = temp;
        while(current.next != null && current.next.next != null){
            ListNode firstNode = current.next;
            ListNode secondNode = current.next.next;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            current.next = secondNode;
            current = current.next.next;
        }
        return temp.next;
        
    }
}