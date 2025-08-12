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

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode previus = null;
        ListNode actual = head;

        while(actual != null) { 
            ListNode next = actual.next;
            actual.next = previus;
            previus = actual;
            actual = next;
        }

        return previus;
    }
}
