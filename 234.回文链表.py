#
# @lc app=leetcode.cn id=234 lang=python3
#
# [234] 回文链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        slow,fast=head,head
        while fast is not None:
            slow=slow.next
            if fast.next is not None:
                fast=fast.next.next
            else:
                fast=fast.next
        cur=slow   
        pre=None
        while cur is not None:
            next=cur.next
            cur.next=pre
            pre=cur
            cur=next
        while pre is not None:
            if pre.val!=head.val:
                return False
            pre=pre.next
            head=head.next
        return True
# @lc code=end

# Solution1:
# class Solution:
#     def isPalindrome(self, head: ListNode) -> bool:
#         cur=head
#         l=[]
#         while cur!=None:
#       # while cur is not None:
#            l.append(cur.val)
#            cur=cur.next
#         return l==l[::-1] 


# Solution2:
# 快慢指针找到中间结点，反转后半部分结点，比较前后部分结点
# class Solution:
#     def isPalindrome(self, head: ListNode) -> bool:
#         slow,fast=head,head
#         while fast is not None:
#             slow=slow.next
#             if fast.next is not None:
#                 fast=fast.next.next
#             else:
#                 fast=fast.next
#         cur=slow   
#         pre=None
#         while cur is not None:
#             next=cur.next
#             cur.next=pre
#             pre=cur
#             cur=next
#         while pre is not None:
#             if pre.val!=head.val:
#                 return False
#             pre=pre.next
#             head=head.next
#         return True