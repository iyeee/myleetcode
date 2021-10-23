#
# @lc app=leetcode.cn id=113 lang=python3
#
# [113] 路径总和 II
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        res=[]
        path=[]
        def dfs(node,path,sum):
            if not node:
                return
            sum+=node.val
            path.append(node.val)
            if sum==targetSum and not node.left and not node.right:
                res.append(path[:])
            dfs(node.left,path,sum)
            dfs(node.right,path,sum)
            path.pop()
        dfs(root,path,0)
        return res
# @lc code=end

# Solution1:
# class Solution:
#     def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
#         res=[]
#         def dfs(node,path,sum):
#             if not node:
#                 return
#             sum+=node.val
#             l=path.copy()
#             l.append(node.val)
#             if sum==targetSum and not node.left and not node.right:
#                 res.append(l)
#             dfs(node.left,l,sum)
#             dfs(node.right,l,sum)
#         dfs(root,[],0)
#         return res

# class Solution:
#     def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
#         res=[]
#         path=[]
#         def dfs(node,path,sum):
#             if not node:
#                 return
#             sum+=node.val
#             path.append(node.val)
#             if sum==targetSum and not node.left and not node.right:
#            # 注意是path[:]
#                 res.append(path[:])
#             dfs(node.left,path,sum)
#             dfs(node.right,path,sum)
#             path.pop()
#         dfs(root,path,0)
#         return res