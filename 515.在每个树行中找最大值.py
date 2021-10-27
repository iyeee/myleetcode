#
# @lc app=leetcode.cn id=515 lang=python3
#
# [515] 在每个树行中找最大值
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from queue import Queue
class Solution:
    def largestValues(self, root):
        if not root:
            return []
        values=[]
        q=Queue()
        q.put(root)
        while not q.empty():
            l=q.qsize()
            m=float('-inf')
            for _ in range(l):
                node=q.get()
                m=max(m,node.val)
                if  node.left:
                    q.put(node.left)
                if  node.right:
                    q.put(node.right)
            values.append(m)
    
        return values
# @lc code=end

