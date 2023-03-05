import java.util.List;

/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre=null,cur=head,next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
// @lc code=end
// Solution1：
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null){
//             return null;
//         }
//         ListNode dummy=new ListNode();
//         dummy.next=head;
//         ListNode pre=dummy,cur=head,next=null;
//         while(cur!=null){
//             next=cur.next;
//             cur.next=pre;
//             pre=cur;
//             cur=next;
//         }
//         // wrong dummy=null
//         dummy.next.next=null;
//         return pre;
//     }
// }


// Solution2:
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         if(head==null){
//             return null;
//         }
//         ListNode pre=null,cur=head,next=null;
//         while(cur!=null){
//             next=cur.next;
//             cur.next=pre;
//             pre=cur;
//             cur=next;
//         }
//         return pre;
//     }
// }