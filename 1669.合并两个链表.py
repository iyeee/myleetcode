#
# @lc app=leetcode.cn id=1669 lang=python3
#
# [1669] 合并两个链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        l,r=list1,list1
        for _ in range(a-1):
            l=l.next
        for _ in range(b+1):
            r=r.next
        l.next=list2
        if list2==None:
            l.next=r
            return list1
        while list2.next!=None:
            list2=list2.next
        list2.next=r
        return list1
# @lc code=end

Solution1:
class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        l,r=list1,list1
        for _ in range(a-1):
            l=l.next
        for _ in range(b+1):
            r=r.next
        l.next=list2
        if list2==None:
            l.next=r
            return list1
        while list2.next!=None:
            list2=list2.next
        list2.next=r
        return list1