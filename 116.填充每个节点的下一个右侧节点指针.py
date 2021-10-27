#
# @lc app=leetcode.cn id=116 lang=python3
#
# [116] 填充每个节点的下一个右侧节点指针
#

# @lc code=start
"""
# Definition for a Node.
class Node:
    def __init__(self, val: int = 0, left: 'Node' = None, right: 'Node' = None, next: 'Node' = None):
        self.val = val
        self.left = left
        self.right = right
        self.next = next
"""

from collections import deque
class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return None
        q=deque([root])
        while q:
            l=len(q)
            pre=Node()
            for _ in range(l):
                node=q.popleft()
                pre.next=node
                pre=node
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            pre.next=None
        return root  
# @lc code=end


solution1:

# from collections import deque
# 注：在Python里，queue.Queue主要是为了线程间通信，作为“队列”只是附带的功能。而collections.deque就是个容器，和dict，list类似。
# class Solution:
#     def connect(self, root: 'Node') -> 'Node':
#         if not root:
#             return None
#         q=deque([root])
#         while q:
#             l=len(q)
#             pre=Node()
#             for _ in range(l):
#                 node=q.popleft()
#                 pre.next=node
#                 pre=node
#                 if node.left:
#                     q.append(node.left)
#                 if node.right:
#                     q.append(node.right)
#             pre.next=None
#         return root  

# Solution2:
# class Solution:
#     def connect(self, root: 'Node') -> 'Node':
#         if not root:
#             return root
#         cur=root
#         while cur:
#             dummyNode=Node()
#             pre=dummyNode
#             while cur:
#                 if cur.left:
#                     pre.next=cur.left
#                     pre=pre.next
#                 if cur.right:
#                     pre.next=cur.right
#                     pre=pre.next
#                 cur=cur.next
            
#             cur=dummyNode.next
#         return root