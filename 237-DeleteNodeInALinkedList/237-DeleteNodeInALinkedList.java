// Last updated: 8/3/2025, 8:38:34 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    // first solution
    // node.val=node.next.val;
    //   node.next=node.next.next;
    // second solution
    ListNode temp=node;
    ListNode prev=null;
    while(temp.next!=null){
        temp.val=temp.next.val;
        prev=temp;
        temp=temp.next;
    }
    prev.next=null;
    }
}