# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
from collections import deque
class Solution:
    def listOfDepth(self, tree: TreeNode) -> List[ListNode]: 
        q=deque([tree])
        res=[]
        while q:
            l=len(q)
            head=tmp=ListNode(0)
            for _ in range(l):
                node=q.popleft()
                tmp.next=ListNode(node.val)
                tmp=tmp.next
                if node.left:
                    q.append(node.left)
                if node.right:
                    q.append(node.right)
            res.append(head.next)
        return res
