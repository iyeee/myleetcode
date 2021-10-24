#
# @lc app=leetcode.cn id=230 lang=python3
#
# [230] 二叉搜索树中第K小的元素
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        stack=[]
        while root or stack:
            while root:
                stack.append(root)
                root=root.left
            root=stack.pop()
            k-=1
            if k==0:
                return root.val
            root=root.right
# @lc code=end


# Solution1:
# class Solution:
#     def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
#         res=[]
#         def dfs(node):
#             if not node:
#                 return
#             dfs(node.left)
#             res.append(node.val)
#             dfs(node.right)
#         dfs(root)
#         # print(res)
#         return res[k-1]

# 剪枝
# class Solution:
#     def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
#         res=[]
#         def dfs(node):
#             if not node:
#                 return
#             if len(res)<k:
#                 dfs(node.left)
#                 res.append(node.val)
#                 dfs(node.right)
#         dfs(root)
#         return res[k-1]

# 迭代
# Solution2:
# class Solution:
#     def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
#         stack=[]
#         while root or stack:
#             while root:
#                 stack.append(root)
#                 root=root.left
#             root=stack.pop()
#             k-=1
#             if k==0:
#                 return root.val
#             root=root.right