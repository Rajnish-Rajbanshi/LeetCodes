//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         ListNode slow = head, fast = head;
//         boolean isCycle = false;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 isCycle = true;
//                 break;
//             }
//         }
//         if (!isCycle) {
//             return null;
//         }
//         slow = head;
//          ListNode prev=null;
//         while (slow != fast) {
//             slow = slow.next;
//              prev=fast;
//             fast = fast.next;
//         }
//         prev.next=null;
//         return slow;
//     }
// }