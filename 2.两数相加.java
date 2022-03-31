import java.util.List;

/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode cur1=l1,cur2=l2;
        ListNode head=new ListNode(0);
        ListNode tmp=head;
        int carry=0;
        while(cur1!=null||cur2!=null){
            int x=cur1==null?0:cur1.val;
            int y=cur2==null?0:cur2.val;
            int sum=x+y+carry;
            if(sum>=10){
                carry=1;
                sum-=10;
                
            }else{
                carry=0;
            }
            System.out.println(sum);
            tmp.next=new ListNode(sum);
            tmp=tmp.next;
            if(cur1!=null){
                cur1=cur1.next;
            }
            if(cur2!=null){
                cur2=cur2.next;
            }
        }
        if(carry==1){
            
            tmp.next=new ListNode(1);
        }
        return head.next;
    }
}
// @lc code=end

