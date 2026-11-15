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
    public ListNode partition(ListNode head, int x) {
        ListNode smaller = new ListNode(-1);
        ListNode larger = new ListNode(-1);
        ListNode p = smaller;
        ListNode q = larger;
        while(head != null){
            if(head.val >= x){
                q.next  = head;
                q = q.next;
            } else{
                p.next = head;
                p = p.next;
            }
            head = head.next;
        }
        q.next = null;
        p.next = larger.next;
        return smaller.next;
    }
}