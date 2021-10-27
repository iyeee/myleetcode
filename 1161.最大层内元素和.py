#
# @lc app=leetcode.cn id=1161 lang=python3
#
# [1161] 最大层内元素和
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import defaultdict
class Solution:
    def maxLevelSum(self, root: TreeNode) -> int:
        def dfs(node,level):
            if node:
                mp[level]+=node.val
                dfs(node.left,level+1)
                dfs(node.right,level+1)

        mp=defaultdict(int)
        dfs(root,1)
        return max(mp,key=lambda x:mp[x])

# @lc code=end

# Solution1:
# from collections import deque
# class Solution:
#     def maxLevelSum(self, root: TreeNode) -> int:
#         q=deque([root])
#         max,res,level=float('-inf'),0,1
#         while q:
#             l=len(q)
#             tmp=0
#             for _ in range(l):
#                 node=q.popleft()
#                 tmp+=node.val
#                 if node.left:
#                     q.append(node.left)
#                 if node.right:
#                     q.append(node.right)    
#             if tmp>max:
#                 max=tmp
#                 res=level
#             level+=1
#         return res

# Solution2:
# from collections import defaultdict
# class Solution:
#     def maxLevelSum(self, root: TreeNode) -> int:
#         def dfs(node,level):
#             if node:
#                 mp[level]+=node.val
#                 dfs(node.left,level+1)
#                 dfs(node.right,level+1)

#         mp=defaultdict(int)
#         dfs(root,1)
#        # #return max(mp,key=lambda x:mp[x])
#         return max(mp,key=mp.get)
