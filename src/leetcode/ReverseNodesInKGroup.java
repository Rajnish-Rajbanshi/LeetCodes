/*25. Reverse Nodes in k-Group
Solved
Hard
Topics
premium lock icon
Companies
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed. */
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
//code::::::::::::
// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         ListNode temp = head;
//         int count = 0;
//         // check whether the list has k nodes or not 
//         while (count < k) {
//             if (temp == null){
//                 return head;
//             }
//             temp = temp.next;
//             count++;
//         }
//         //check for rest of ll
//         ListNode prevNode = reverseKGroup(temp,k);

//         //check for current group of ll to reverse
//         temp = head;
//         count = 0;
//         while (count < k) {
//             ListNode next = temp.next;
//             temp.next = prevNode;
//             prevNode = temp;
//             temp = next;
//             count++;
//         }
//         return prevNode;
//     }
// }