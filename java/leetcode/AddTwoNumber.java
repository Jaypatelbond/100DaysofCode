/**
 * 
 * 2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 * 
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        
        int carry = 0; int div = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + div;
            carry = sum % 10;
            div = sum / 10;
            ListNode next = new ListNode(carry);
            head.next = next;
            head = head.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            int sum = l1.val + div;
            carry = sum % 10;
            div = sum / 10;
            ListNode next = new ListNode(carry);
            head.next = next;
            head = head.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            int sum = l2.val + div;
            carry = sum % 10;
            div = sum / 10;
            ListNode next = new ListNode(carry);
            head.next = next;
            head = head.next;
            l2 = l2.next;
        }
        
        if(div != 0){
            ListNode next = new ListNode(div);
            head.next = next;
            head = head.next;
        }
        
        return dummy.next;
    }
}