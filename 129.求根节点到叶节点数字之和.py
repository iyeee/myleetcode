#
# @lc app=leetcode.cn id=129 lang=python3
#
# [129] 求根节点到叶节点数字之和
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: TreeNode) -> int:
        total=0
        def dfs(node,val):
            nonlocal total
            if not node:
                return
            val=val*10+node.val
            if node.left==None and node.right==None:
                total+=val
                return
            dfs(node.left,val)
            dfs(node.right,val)
        dfs(root,0)
        return total    
# @lc code=end


# Solution1:
# class Solution:
#     def sumNumbers(self, root: TreeNode) -> int:
#         total=0
#         def dfs(node,val):
#             nonlocal total
#             if not node:
#                 return
#             val=val*10+node.val
#             if node.left==None and node.right==None:
#                 total+=val
#                 return
#             dfs(node.left,val)
#             dfs(node.right,val)
#         dfs(root,0)
#         return total  

# BFS
# Solution2: