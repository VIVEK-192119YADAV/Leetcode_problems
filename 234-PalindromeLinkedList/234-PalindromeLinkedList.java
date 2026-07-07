// Last updated: 7/7/2026, 11:18:06 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    ListNode rec(ListNode cur){
13        if(cur==null || cur.next==null) return cur;
14        ListNode right=cur.next;
15        ListNode new_head=rec(right);
16        right.next=cur;
17        cur.next=null;
18        return new_head;
19    }
20
21    public boolean isPalindrome(ListNode head) {
22        ListNode slow=head;
23        ListNode fast=head;
24        while(fast.next!=null && fast.next.next!=null){
25            slow=slow.next;
26            fast=fast.next.next;
27        }
28        ListNode rev_head=rec(slow.next);
29        ListNode ptr1=head,ptr2=rev_head;
30        while(ptr1!=null && ptr2!=null){
31            if(ptr1.val!=ptr2.val) return false;
32            ptr1=ptr1.next;
33            ptr2=ptr2.next;
34
35        }
36        return true;
37        
38
39    }
40}