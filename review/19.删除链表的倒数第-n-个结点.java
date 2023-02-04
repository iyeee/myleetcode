import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0,head);
        Deque<ListNode> deque=new LinkedList<>();
        ListNode cur=dummy;
        while(cur!=null){
            deque.push(cur);
            cur=cur.next;
        }
        for(int i=0;i<n;i++){
            deque.pop();
        }
        ListNode pre=deque.peek();
        pre.next=pre.next.next;
        return dummy.next;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummy=new ListNode(0,head);
//         // slow,fast
//         ListNode pre=dummy,cur=dummy;
//         while(n!=-1){
//             cur=cur.next;
//             n--;
//         }
//         while(cur!=null){
//             pre=pre.next;
//             cur=cur.next;
//         }
//         pre.next=pre.next.next;
//         return dummy.next;
//     }
// }