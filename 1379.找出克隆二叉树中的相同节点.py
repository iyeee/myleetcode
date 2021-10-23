#
# @lc app=leetcode.cn id=1379 lang=python3
#
# [1379] 找出克隆二叉树中的相同节点
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
        if not original:
            return None
        if original==target:
            return cloned
        return self.getTargetCopy(original.left,cloned.left,target) or self.getTargetCopy(original.right,cloned.right,target)
        
        
# @lc code=end

# Solution1:

# class Solution:
#     def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
#         res=None
#         def dfs(origin,clone):
#             if not origin:
#                 return
#             if origin==target:
#                 nonlocal res
#                 res=clone
#                 return 
#             dfs(origin.left,clone.left)
#             dfs(origin.right,clone.right)
#         dfs(original,cloned)
#         return res

# class Solution:
#     def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
#         if not original:
#             return None
#         if original==target:
#             return cloned
#         res=self.getTargetCopy(original.left,cloned.left,target)
#         if res:
#             return res
#         else:
#             return self.getTargetCopy(original.right,cloned.right,target)


# class Solution:
#     def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:
#         if not original:
#             return None
#         if original==target:
#             return cloned
#         return self.getTargetCopy(original.left,cloned.left,target) or self.getTargetCopy(original.right,cloned.right,target)
        