#
# @lc app=leetcode.cn id=814 lang=python3
#
# [814] 二叉树剪枝
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pruneTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        def dfs(node):
            if not node:
                return False
            a1=dfs(node.left)
            a2=dfs(node.right)
            if not a1:
                node.left=None
            if not a2:
                node.right=None
            return node.val==1 or a1 or a2
        return root if dfs(root) else None

# @lc code=end

# Solution1:
# class Solution:
#     def pruneTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
#         if not root:
#             return None
#         root.left=self.pruneTree(root.left)
#         root.right=self.pruneTree(root.right)
#         if root.val==0 and not root.left and not root.right:
#             return None
#         return root

# 官解
# Solution2:
# class Solution(object):
#     def pruneTree(self, root):
#         def containsOne(node):
#             if not node: return False
#             a1 = containsOne(node.left)
#             a2 = containsOne(node.right)
#             if not a1: node.left = None
#             if not a2: node.right = None
#             return node.val == 1 or a1 or a2

#         return root if containsOne(root) else None
