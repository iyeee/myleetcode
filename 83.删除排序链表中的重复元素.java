import java.util.List;

/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode cur=head;
        while(cur.next!=null){
            if(cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else{
                cur=cur.next;
            }
        }
        return head;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         if(head==null){
//             return null;
//         }
//         ListNode cur=head;
//         while(cur.next!=null){
//             if(cur.val==cur.next.val){
//                 cur.next=cur.next.next;
//             }else{
//                 cur=cur.next;
//             }
//         }
//         return head;
//     }
// }