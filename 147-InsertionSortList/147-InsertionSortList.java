// Last updated: 8/26/2025, 12:35:54 PM
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
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> lst = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            lst.add(curr.val);
            curr = curr.next;
        }
        for (int i = 0; i < lst.size(); i++) {
            for (int j = i + 1; j < lst.size(); j++) {
                if (lst.get(i) > lst.get(j)) {
                    int temp = lst.get(i);
                    lst.set(i, lst.get(j));
                    lst.set(j, temp);
                }
            }
        }
        curr = head;  
        int idx = 0;
        while (curr != null) {
            curr.val = lst.get(idx++);
            curr = curr.next;
        }

        return head;
    }
}