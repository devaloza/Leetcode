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
    public void reorderList(ListNode head) {
    ListNode slow = head;
        ListNode fast = head;
        while (fast.next !=null && fast.next.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //Reverse slow
        ListNode prev = null;
        ListNode curr = slow.next;
        while (curr !=null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        slow.next = null;
        ListNode firstHalf = head;
        ListNode secondHalf = prev;
        while (secondHalf != null) {
            ListNode temp1 = firstHalf.next;
            ListNode temp2 = secondHalf.next;
            firstHalf.next = secondHalf;
            secondHalf.next = temp1;
            firstHalf = temp1;
            secondHalf = temp2;
        }
    }
}