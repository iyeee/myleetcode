#
# @lc app=leetcode.cn id=64 lang=python3
#
# [64] 最小路径和
#

# @lc code=start
class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        if not grid or not grid[0]:
            return 0
        m,n=len(grid),len(grid[0])
        dp=[[0]*n for _ in range(m)]
        dp[0][0]=grid[0][0]
        tmp1=tmp2=0
        for i in range(n):
            tmp1+=grid[0][i]
            dp[0][i]=tmp1
        for j in range(m):
            tmp2+=grid[j][0]
            dp[j][0]=tmp2
        for i in range(1,m):
            for j in range(1,n):
                dp[i][j]=min(dp[i-1][j],dp[i][j-1])+grid[i][j]
        return dp[m-1][n-1]
# @lc code=end

# Solution1:
# class Solution:
#     def minPathSum(self, grid: List[List[int]]) -> int:
#         if not grid or not grid[0]:
#             return 0
#         m,n=len(grid),len(grid[0])
#         dp=[[0]*n for _ in range(m)]
#         dp[0][0]=grid[0][0]
#         tmp1=tmp2=0
#         for i in range(n):
#             tmp1+=grid[0][i]
#             dp[0][i]=tmp1
#         for j in range(m):
#             tmp2+=grid[j][0]
#             dp[j][0]=tmp2
#         for i in range(1,m):
#             for j in range(1,n):
#                 dp[i][j]=min(dp[i-1][j],dp[i][j-1])+grid[i][j]
#         return dp[m-1][n-1]