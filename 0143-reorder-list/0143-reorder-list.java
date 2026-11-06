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
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;
        ListNode slow= head , fast = head;
        while (fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;;
        }
        ListNode first = head;
        ListNode second = slow.next;
        slow.next = null;
        second = reverse(second);
        while( first != null && second != null){
            dummy.next = first;
            first = first.next;
            dummy = dummy.next;

            dummy.next = second;
            second = second.next;
            dummy = dummy.next;
        }
        if(second != null){
            dummy.next = second;
            second = second.next;
        }
        while(first != null){
            dummy.next = first;
            first = first.next;
        }
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}