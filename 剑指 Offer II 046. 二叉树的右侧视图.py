# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def rightSideView(self, root: TreeNode) -> List[int]:
        res,maxLevel=[],-1
        def dfs(node,level):
            if not node:
                return
            nonlocal maxLevel
            if level>maxLevel:
                maxLevel=level
                res.append(node.val)
            dfs(node.right,level+1)
            dfs(node.left,level+1)
        dfs(root,0 )
        return res


# Solution1:
# from queue import Empty, Queue
# class Solution:
#     def rightSideView(self, root: TreeNode) -> List[int]:
#         res=[]
#         if not root:
#             return res
#         q=Queue()
#         q.put(root)
#         while not q.empty():
#             lenth=q.qsize()
#             for x in range(lenth):
#                 node=q.get()
#                 if x==lenth-1:
#                     res.append(node.val)
#                 if  node.left:
#                     q.put(node.left)
#                 if  node.right:
#                     q.put(node.right)
#         return res


# Solution2:
# class Solution:
#     def rightSideView(self, root: TreeNode) -> List[int]:
#         res,maxLevel=[],-1
#         def dfs(node,level):
#             if not node:
#                 return
#             nonlocal maxLevel
#             if level>maxLevel:
#                 maxLevel=level
#                 res.append(node.val)
#             dfs(node.right,level+1)
#             dfs(node.left,level+1)
#         dfs(root,0 )
#         return res