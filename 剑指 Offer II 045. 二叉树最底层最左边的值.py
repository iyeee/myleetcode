#
# @lc app=leetcode.cn id=513 lang=python3
#
# [513] 找树左下角的值
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from queue import Queue
class Solution:
    def findBottomLeftValue(self, root: TreeNode) -> int:
        res=[0,-1]
        def dfs(node,level):
            if not node:
                return
            if node.left==None and node.right==None and level>res[1]:
                res[0]=node.val
                res[1]=level
                return
            dfs(node.left,level+1)
            dfs(node.right,level+1)
        dfs(root,0)
        return res[0]
# @lc code=end
# bfs
# Solution1:
# from queue import Queue
# class Solution:
#     def findBottomLeftValue(self, root: TreeNode) -> int:
#         q=Queue()
#         q.put(root)
#         while not q.empty():
#             res=0
#             for i in range(q.qsize()):
#                 node=q.get()
#                 if i==0:
#                     res=node.val
#                 if node.left!=None:
#                     q.put(node.left)
#                 if node.right!=None:
#                     q.put(node.right)
#         return res


# dfs
# Soluiton2:
# from queue import Queue
# class Solution:
#     def findBottomLeftValue(self, root: TreeNode) -> int:
#         res=[0,-1]
#         def dfs(node,level):
#             if not node:
#                 return
#             if node.left==None and node.right==None and level>res[1]:
#                 res[0]=node.val
#                 res[1]=level
#                 return
#             dfs(node.left,level+1)
#             dfs(node.right,level+1)
#         dfs(root,0)
#         return res[0]