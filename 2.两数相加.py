#
# @lc app=leetcode.cn id=2 lang=python3
#
# [2] 两数相加
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from typing import List


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        head=cur=ListNode()
        carry=0
        while l1!=None or l2!=None:
            x=l1.val if l1!=None else 0
            y=l2.val if l2!=None else 0
            sum=x+y+carry
            tmp=ListNode(sum%10)
            cur.next=tmp
            cur=tmp
            carry=sum//10
            if l1!=None:
                l1=l1.next
            if l2!=None:
                l2=l2.next
        if carry!=0:
            tmp=ListNode(1)
            cur.next=tmp
        return head.next
# @lc code=end

