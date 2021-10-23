#
# @lc app=leetcode.cn id=1315 lang=python3
#
# [1315] 祖父节点值为偶数的节点和
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumEvenGrandparent(self, root: TreeNode) -> int:
        sum=0
        def dfs(node,parent,grandparent):
            nonlocal sum
            if not node:
                return
            if grandparent:
                sum+=node.val
            grandparent=parent
            parent=(node.val%2==0)
            dfs(node.left,parent,grandparent)
            dfs(node.right,parent,grandparent)
        dfs(root,False,False)
        return sum
            
# @lc code=end

# Solution1:
# 直接搜索每一个结点的孙子
# class Solution:
#     def sumEvenGrandparent(self, root: TreeNode) -> int:
#         sum=0
#         def dfs(node):
#             nonlocal sum
#             if not node:
#                 return
#             if node.val%2==0:
#                 if node.left!=None:
#                     if node.left.left!=None:
#                         sum+=node.left.left.val
#                     if node.left.right!=None:
#                         sum+=node.left.right.val
#                 if node.right!=None:
#                     if node.right.left!=None:
#                         sum+=node.right.left.val
#                     if node.right.right!=None:
#                         sum+=node.right.right.val
#             dfs(node.left)
#             dfs(node.right)
#         dfs(root)
#         return sum


# Solution2:
# 记录parent和grandparent
# class Solution:
#     def sumEvenGrandparent(self, root: TreeNode) -> int:
#         sum=0
#         def dfs(node,parent,grandparent):
#             nonlocal sum
#             if not node:
#                 return
#             if grandparent:
#                 sum+=node.val
#             grandparent=parent
#             parent=(node.val%2==0)
#             dfs(node.left,parent,grandparent)
#             dfs(node.right,parent,grandparent)
#         dfs(root,False,False)
#         return sum