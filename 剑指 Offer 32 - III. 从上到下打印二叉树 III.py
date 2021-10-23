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
        flag=0
        while not q.empty():
            tmp=[]
            for _ in range(q.qsize()):
                node=q.get()
                tmp.append(node)
                if node.left!=None:
                    q.put(node.left)
                if node.right!=None:
                    q.put(node.right)
            if flag==0:
                res.append(tmp)
            else:
                res.append(tmp[::-1])
            flag=~flag
        return res