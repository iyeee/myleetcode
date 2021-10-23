# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from queue import Queue
class Solution:
    def levelOrder(self, root: TreeNode) -> List[int]:
        res=[]
        if not root:
            return res
        q=Queue()
        q.put(root)
        while not q.empty():
            node=q.get()
            res.append(node.val)
            if node.left!=None:
                q.put(node.left)
            if node.right!=None:
                q.put(node.right)
        return res