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
class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode pre=head;
        boolean flag=false;
        int val1,val2,val;
        while(l1!=null||l2!=null){
            // if(l1==null){
            //     val1=0;
            // }else{
            //     val1=l1.val;
            // }
            // if(l2==null){
            //     val2=0;
            // }else{
            //     val2=l2.val;
            // }
            val1=l1==null?0:l1.val;
            val2=l2==null?0:l2.val;
            val=val1+val2;
            if(flag){
                val+=1;
            }
            if(val>=10){
                val-=10;
                flag=true;
            }else{
                flag=false;
            }
            ListNode node=new ListNode(val);
            pre.next=node;
            pre=node;
            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
        }
        if(flag){
            pre.next=new ListNode(1);
        }
        return head.next;
    }

}
// @lc code=end


// Solution1:
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

//         ListNode cur1=l1,cur2=l2;
//         ListNode head=new ListNode(0);
//         ListNode tmp=head;
//         int carry=0;
//         while(cur1!=null||cur2!=null){
//             int x=cur1==null?0:cur1.val;
//             int y=cur2==null?0:cur2.val;
//             int sum=x+y+carry;
//             if(sum>=10){
//                 carry=1;
//                 sum-=10;
                
//             }else{
//                 carry=0;
//             }
//             System.out.println(sum);
//             tmp.next=new ListNode(sum);
//             tmp=tmp.next;
//             if(cur1!=null){
//                 cur1=cur1.next;
//             }
//             if(cur2!=null){
//                 cur2=cur2.next;
//             }
//         }
//         if(carry==1){
            
//             tmp.next=new ListNode(1);
//         }
//         return head.next;
//     }
// }