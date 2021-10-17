#
# @lc app=leetcode.cn id=1302 lang=python3
#
# [1302] 层数最深叶子节点的和
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.maxdepth=-1
        self.total=0
    def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
        def dfs(node,depth):
            if not node:
                return
            print(depth)
            if depth>self.maxdepth:
                self.maxdepth,self.total=depth,node.val
            elif depth==self.maxdepth:
                self.total+=node.val
            dfs(node.left,depth+1)
            dfs(node.right,depth+1)
        dfs(root,0)
        return self.total
# @lc code=end

# Solution1:
# class Solution:
#     def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
#         q=Queue()
#         q.put(root)
#         while not q.empty():
#             tmpVal=0
#             for _ in range(q.qsize()):
#                 tmp=q.get()
#                 tmpVal+=tmp.val
#                 if tmp.left!=None:
#                     q.put(tmp.left)
#                 if tmp.right!=None:
#                     q.put(tmp.right)
#             if q.empty():
#                 return tmpVal


# dfs:
# Solution2:
# class Solution:
#     def __init__(self):
#         self.maxdepth=-1
#         self.total=0
#     def deepestLeavesSum(self, root: Optional[TreeNode]) -> int:
#         def dfs(node,depth):
#             if not node:
#                 return
#             print(depth)
#             if depth>self.maxdepth:
#                 self.maxdepth,self.total=depth,node.val
#             elif depth==self.maxdepth:
#                 self.total+=node.val
#             dfs(node.left,depth+1)
#             dfs(node.right,depth+1)
#         dfs(root,0)
#         return self.total
