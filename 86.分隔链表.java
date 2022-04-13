import java.util.List;

/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
 */

// @lc code=start
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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead=new ListNode(0);
        ListNode largeHead=new ListNode(0);
        ListNode smallCur=smallHead,largeCur=largeHead;
        while(head!=null){
            if(head.val>=x){
                largeCur.next=head;
                largeCur=head;
            }else{
                smallCur.next=head;
                smallCur=head;
            }
            head=head.next;
        }
        largeCur.next=null;
        smallCur.next=largeHead.next;
        return smallHead.next;
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public ListNode partition(ListNode head, int x) {
//         ListNode smallHead=new ListNode(0);
//         ListNode largeHead=new ListNode(0);
//         ListNode smallCur=smallHead,largeCur=largeHead;
//         while(head!=null){
//             if(head.val>=x){
//                 largeCur.next=head;
//                 largeCur=head;
//             }else{
//                 smallCur.next=head;
//                 smallCur=head;
//             }
//             head=head.next;
//         }
//         largeCur.next=null;
//         smallCur.next=largeHead.next;
//         return smallHead.next;
//     }
// }