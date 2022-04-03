
/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if(list1==null){
          return list2;
      }else if(list2==null){
          return list1;
      }else if(list1.val<list2.val){
          list1.next=mergeTwoLists(list1.next, list2);
          return list1;
      }else{
          list2.next=mergeTwoLists(list1, list2.next);
          return list2;
      }
}
}
// @lc code=end


// Solution1:
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode dummy=new ListNode();
//         ListNode cur=dummy;
//         while(list1!=null&&list2!= null){
//             if(list1.val<=list2.val){
//                 cur.next=list1;
//                 list1=list1.next;
//             }else{
//                 cur.next=list2;
//                 list2=list2.next;
//             }
//             cur=cur.next;
//         }
//         // if(list1!=null){
//         //     cur.next=list1;
//         // }else{
//         //     cur.next=list2;
//         // }
//         cur.next=list1!=null?list1:list2;
//         return dummy.next;
//     }
// }



// Solution2: ???递归
// ????????????
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//       if(list1==null){
//           return list2;
//       }else if(list2==null){
//           return list1;
//       }else if(list1.val<list2.val){
//           list1.next=mergeTwoLists(list1.next, list2);
//           return list1;
//       }else{
//           list2.next=mergeTwoLists(list1, list2.next);
//           return list2;
//       }
// }
// }