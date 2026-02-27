/*21. Merge Two Sorted Lists
Easy
Topics
premium lock icon
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list. */

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
//        if(head1==null || head2==null){
//         return (head1==null)?head2:head1;
//        } 

//        if(head1.val<=head2.val){
//         head1.next=mergeTwoLists(head1.next,head2);
//         return head1;
//        } else{
//         head2.next=mergeTwoLists(head1,head2.next);
//         return head2;
//        }
//     }
// }