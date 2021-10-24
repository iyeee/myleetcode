#
# @lc app=leetcode.cn id=222 lang=python3
#
# [222] 完全二叉树的节点个数
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def countNodes(self, root: TreeNode) -> int:
        def dfs(node):
            if not node:
                return 0
            return dfs(node.left)+dfs(node.right)+1
        return dfs(root)
# @lc code=end
# dfs
# Solution1:
# class Solution:
#     def countNodes(self, root: TreeNode) -> int:
#         total=0
#         def dfs(node):
#             nonlocal total
#             if not node:
#                 return
#             total+=1
#             dfs(node.left)
#             dfs(node.right)
#         dfs(root)
#         return total

# class Solution:
#     def countNodes(self, root: TreeNode) -> int:
#         def dfs(node):
#             if not node:
#                 return 0
#             return dfs(node.left)+dfs(node.right)+1
#         return dfs(root)        

# TODO 利用完全二叉树的性质
# Solution2