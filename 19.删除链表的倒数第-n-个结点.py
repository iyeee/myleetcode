#
# @lc app=leetcode.cn id=19 lang=python3
#
# [19] 删除链表的倒数第 N 个结点
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        stack=list()
        dummy=ListNode(0,head)
        cur=dummy
        while cur:
            stack.append(cur)
            cur=cur.next
        for _ in range(n):
            stack.pop()
        stack[-1].next=stack[-1].next.next
        return dummy.next
# @lc code=end

# Solution1:
# class Solution:
#     def removeNthFromEnd(self, head\: ListNode, n: int) -> ListNode:
#         fast,slow,pre=head,head,None
#         for _ in range(n):
#             fast=fast.next
#         while fast!=None:
#             fast=fast.next
#             pre=slow
#             slow=slow.next
#         if slow==head:
#             return slow.next
#         else:
#             pre.next=slow.next
#         return head  

# class Solution:
#     def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
#         dummy=ListNode(0,head)
#         fast,slow=head,dummy
#         for _ in range(n):
#             fast=fast.next
#         while fast:
#             fast=fast.next
#             slow=slow.next
#         slow.next=slow.next.next
#         return  dummy.next

# Solution2:
# 使用栈
# class Solution:
#     def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
#         stack=list()
#         dummy=ListNode(0,head)
#         cur=dummy
#         while cur:
#             stack.append(cur)
#             cur=cur.next
#         for _ in range(n):
#             stack.pop()
#         stack[-1].next=stack[-1].next.next
#         return dummy.next