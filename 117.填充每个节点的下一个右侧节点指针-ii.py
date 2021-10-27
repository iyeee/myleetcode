#
# @lc app=leetcode.cn id=117 lang=python3
#
# [117] 填充每个节点的下一个右侧节点指针 II
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

class Solution:
    def connect(self, root: 'Node') -> 'Node':
        if not root:
            return root
        cur=root
        while cur:
            dummyNode=Node()
            pre=dummyNode
            while cur:
                if cur.left:
                    pre.next=cur.left
                    pre=pre.next
                if cur.right:
                    pre.next=cur.right
                    pre=pre.next
                cur=cur.next
            
            cur=dummyNode.next
        return root
# @lc code=end



# Solution1:
# 不符合空间复杂度
# from collections import deque
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


# Solution2：
# 空间复杂度 O(1)
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