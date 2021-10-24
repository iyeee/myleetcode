#
# @lc app=leetcode.cn id=1325 lang=python3
#
# [1325] 删除给定值的叶子节点
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def removeLeafNodes(self, root: TreeNode, target: int) -> TreeNode:
        if not root:
            return None
        root.left=self.removeLeafNodes(root.left,target)
        root.right=self.removeLeafNodes(root.right,target)
        if not root.left and not root.right and target==root.val:
            return None
        return root            

# @lc code=end


# Solution1:
# 较慢且代码长
# class Solution:
#     def removeLeafNodes(self, root: TreeNode, target: int) -> TreeNode:
#         def dfs(node,father,isLeft):
#             nonlocal flag
#             if not node:
#                 return
#             if not node.left and not node.right and target==node.val:
#                 flag=True
#                 if isLeft==1:
#                     father.left=None
#                 elif isLeft==2:
#                     father.right=None
#             dfs(node.left,node,1)
#             dfs(node.right,node,2)
#         dumNode=TreeNode(0,root,None)
#         flag=True
#         while flag:
#             flag=False
#             dfs(dumNode.left,dumNode,1)
#         return dumNode.left