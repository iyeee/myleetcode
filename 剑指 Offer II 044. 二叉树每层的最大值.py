# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from queue import Queue
class Solution:
    def largestValues(self, root: TreeNode) -> List[int]:
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

