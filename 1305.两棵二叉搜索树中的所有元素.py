#
# @lc app=leetcode.cn id=1305 lang=python3
#
# [1305] 两棵二叉搜索树中的所有元素
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        res1,res2,res=[],[],[]
        def dfs(node,l):
            if not node:
                return
            dfs(node.left,l)
            l.append(node.val)
            dfs(node.right,l)
        dfs(root1,res1)
        dfs(root2,res2)
        i,j=0,0
        while i<len(res1) and j<len(res2):
            if res1[i]<res2[j]:
                res.append(res1[i])
                i+=1
            else:
                res.append(res2[j])
                j+=1
        if i<len(res1):
            res.extend(res1[i:])
        if j<len(res2):
            res.extend(res2[j:])
        return res
# @lc code=end


# Solution1:
# class Solution:
#     def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
#         res1,res2,res=[],[],[]
#         def dfs(node,l):
#             if not node:
#                 return
#             dfs(node.left,l)
#             l.append(node.val)
#             dfs(node.right,l)
#         dfs(root1,res1)
#         dfs(root2,res2)
#         # i,j=0,0
#         # while i<len(res1) or j<len(res2):
#         #     if 
#         res1.extend(res2)
#         res1.sort()
#         return res1


# class Solution:
#     def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
#         res1,res2,res=[],[],[]
#         def dfs(node,l):
#             if not node:
#                 return
#             dfs(node.left,l)
#             l.append(node.val)
#             dfs(node.right,l)
#         dfs(root1,res1)
#         dfs(root2,res2)
#         i,j=0,0
#         while i<len(res1) and j<len(res2):
#             if res1[i]<res2[j]:
#                 res.append(res1[i])
#                 i+=1
#             else:
#                 res.append(res2[j])
#                 j+=1
#         if i<len(res1):
#             res.extend(res1[i:])
#         if j<len(res2):
#             res.extend(res2[j:])