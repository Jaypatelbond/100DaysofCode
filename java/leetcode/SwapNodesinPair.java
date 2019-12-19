/**
 * 
 * 24. Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.

You may not modify the values in the list's nodes, only nodes itself may be changed.

 

Example:

Given 1->2->3->4, you should return the list as 2->1->4->3.
 */

 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * @author Jaypatelbond
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       if (head == null) {
           return null;
          }
       if (head.next == null) {
           return head;
          }
    if (head.next.next == null) {
       ListNode t = head.next;
       head.next = t.next;
       t.next = head;
        return t;
         }
       ListNode res = head.next;
       ListNode node = new ListNode(-1);
        node.next = head;
        ListNode n1, n2, n3;
        while (node != null && node.next != null && node.next.next != null) {
       n1 = node;
       n2 = node.next;
       n3 = node.next.next;

     n1.next = n3;
     n2.next = n3.next;
     n3.next = n2;
     
     node = n2;
 }
 return res;
}
}