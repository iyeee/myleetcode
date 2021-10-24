#
# @lc app=leetcode.cn id=695 lang=python3
#
# [695] 岛屿的最大面积
#

# @lc code=start
class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        def dfs(i,j):
            if   not 0<=i<m or not 0<=j<n or grid[i][j]==0 :
                return 0
            grid[i][j]=0
            return 1+dfs(i-1,j)+dfs(i,j-1)+dfs(i+1,j)+dfs(i,j+1)
        m,n=len(grid),len(grid[0])
        res=0
        for i in range(m):
            for j in range(n):
                if grid[i][j]==1:
                    res=max(res,dfs(i,j))
        return res
# @lc code=end

