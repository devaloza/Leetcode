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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode current = resultNode;
        int carry = 0;
        //int sum = 0;
        while (l1 !=null || l2 !=null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int tempSum = carry + x + y;
            carry = tempSum / 10;
            //resultNode.value = carry;
            current.next = new ListNode(tempSum % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            //sum +=node1.value + node2.value;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return resultNode.next;
    }
}