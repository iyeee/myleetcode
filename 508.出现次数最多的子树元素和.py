#
# @lc app=leetcode.cn id=508 lang=python3
#
# [508] 出现次数最多的子树元素和
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findFrequentTreeSum(self, root: TreeNode) -> List[int]:
        res=[]
        mp={}
        def dfs(node):
            if not node:
                return 0
            l=dfs(node.left)
            r=dfs(node.right)
            total=l+r+node.val
            mp.update({total:mp.setdefault(total,0)+1})
            return l+r+node.val
        dfs(root)
        mx=max(mp.values())
        for k,v in mp.items():
            if v==mx:
                res.append(k)
        return res
# @lc code=end


# Solution1:
# class Solution:
#     def findFrequentTreeSum(self, root: TreeNode) -> List[int]:
#         res=[]
#         mp={}
#         def dfs(node):
#             if not node:
#                 return 0
#             l=dfs(node.left)
#             r=dfs(node.right)
#             total=l+r+node.val
#             mp.update({total:mp.setdefault(total,0)+1})
#             return l+r+node.val
#         dfs(root)
#         mx=max(mp.values())
#         for k,v in mp.items():
#             if v==mx:
#                 res.append(k)
#         return res