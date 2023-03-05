/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast=head,slow=head;
        while(true){
            if(fast.next==null||fast.next.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
// @lc code=end


// Solution1
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//          if(headA==null||headB==null){
//             return null;
//          }
//          ListNode p1=headA,p2=headB;
//          while(p1!=p2){
//             p1=p1!=null?p1.next:headB;
//             p2=p2!=null?p2.next:headA;
//          }
//          return p1;
//     }
// }