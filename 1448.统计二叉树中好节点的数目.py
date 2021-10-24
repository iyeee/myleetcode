#
# @lc app=leetcode.cn id=1448 lang=python3
#
# [1448] 统计二叉树中好节点的数目
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#  import sys     self.right = right
import sys
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        total=0
        def dfs(node,maxV):
            nonlocal total
            if not node:
                return
            if node.val>=maxV:
                maxV=node.val
                total+=1
            dfs(node.left,maxV)
            dfs(node.right,maxV)
        min_value = -sys.maxsize - 1
        dfs(root,min_value)
        return total
# @lc code=end



# dfs
# Solution1:
# import sys
# class Solution:
#     def goodNodes(self, root: TreeNode) -> int:
#         total=0
#         def dfs(node,maxV):
#             nonlocal total
#             if not node:
#                 return
#             if node.val>=maxV:
#                 maxV=node.val
#                 total+=1
#             dfs(node.left,maxV)
#             dfs(node.right,maxV)
#         min_value = -sys.maxsize - 1
#         dfs(root,min_value)
#         return total