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