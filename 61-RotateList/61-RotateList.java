// Last updated: 11/21/2025, 9:49:58 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = getLength(head);
        k = k % length;   // handle large k

        while (k-- > 0) {
            head = rotateOnce(head);
        }

        return head;
    }

    private ListNode rotateOnce(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        // reach last node
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        // curr is last node, prev is second-last
        prev.next = null;
        curr.next = head;
        return curr;   // new head
    }

    private int getLength(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }
}
