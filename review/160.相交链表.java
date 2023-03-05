/*
 * @lc app=leetcode.cn id=160 lang=java
 *
 * [160] 相交链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         if(headA==null||headB==null){
            return null;
         }
         ListNode p1=headA,p2=headB;
         while(p1!=p2){
            p1=p1!=null?p1.next:headB;
            p2=p2!=null?p2.next:headA;
         }
         return p1;
    }
}
// @lc code=end



// Solution1:
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         int len1=0,len2=0;
//         ListNode curA=headA,curB=headB;
//         while(curA!=null){
//             len1++;
//             curA=curA.next;
//         }
//         while(curB!=null){
//             len2++;
//             curB=curB.next;
//         }
//         if(len1>len2){
//             for(int i=0;i<len1-len2;i++){
//                 headA=headA.next;
//             }
//         }else{
//             for(int i=0;i<len2-len1;i++){
//                 headB=headB.next;
//             }
//         }
//         while(headA!=null){
//             if(headA==headB){
//                 return headA;
//             }
//             headA=headA.next;
//             headB=headB.next;
//         }
//         return null;
//     }
// }

// Solution2:
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