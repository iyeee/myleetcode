#
# @lc app=leetcode.cn id=797 lang=python3
#
# [797] 所有可能的路径
#

# @lc code=start
class Solution:
    def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
        res,path=[],[0]
        def dfs(index):
            if index==len(graph)-1:
                res.append(path[:])
            for x in graph[index]:
                path.append(x)
                dfs(x)
                path.pop()
        dfs(0)
        return res    
# @lc code=end

# Solution1：
# class Solution:
#     def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
#         res=[]
#         def dfs(index,path):
#             if index==len(graph)-1:
#                 res.append(path)
#             for x in graph[index]:
#                 p=path.copy()
#                 p.append(x)
#                 dfs(x,p)
#         dfs(0,[0])
#         return res   

# class Solution:
#     def allPathsSourceTarget(self, graph: List[List[int]]) -> List[List[int]]:
#         res,path=[],[0]
#         def dfs(index):
#             if index==len(graph)-1:
#                 res.append(path[:])
#             for x in graph[index]:
#                 path.append(x)
#                 dfs(x)
#                 path.pop()
#         dfs(0)
#         return res    