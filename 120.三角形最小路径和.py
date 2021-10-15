#
# @lc app=leetcode.cn id=120 lang=python3
#
# [120] 三角形最小路径和
#

# @lc code=start
class Solution:
    def minimumTotal(self, triangle) -> int:
        l=len(triangle)
        dp=[0]*(l+1)
        for i in range(l-1,-1,-1):
            for j in range(i+1):
                dp[j]=min(dp[j],dp[j+1])+triangle[i][j]
        return dp[0]
Solution().minimumTotal([[2],[3,4],[6,5,7],[4,1,8,3]])
# @lc code=end


# Solution1:
# class Solution:
#     def minimumTotal(self, triangle: List[List[int]]) -> int:
#         dp=triangle.copy()
#         l=len(triangle)
#         for i in range(1,l):
#             dp[i][0]=triangle[i][0]+dp[i-1][0]
#             dp[i][-1]=triangle[i][-1]+dp[i-1][-1]
#             for j in range(1,i):
#                 dp[i][j]=min(dp[i-1][j-1],dp[i-1][j])+triangle[i][j]
#         return min(dp[l-1])

# 官解
# class Solution:
#     def minimumTotal(self, triangle: List[List[int]]) -> int:
#         n = len(triangle)
#         f = [[0] * n for _ in range(n)]
#         f[0][0] = triangle[0][0]

#         for i in range(1, n):
#             f[i][0] = f[i - 1][0] + triangle[i][0]
#             for j in range(1, i):
#                 f[i][j] = min(f[i - 1][j - 1], f[i - 1][j]) + triangle[i][j]
#             f[i][i] = f[i - 1][i - 1] + triangle[i][i]
        
#         return min(f[n - 1])

# o(n)空间
# class Solution:
#     def minimumTotal(self, triangle) -> int:
#         l=len(triangle)
#         dp=[[0]*l,[0]*l]
#         dp[0][0]=triangle[0][0]
#         for i in range(1,l):
#             cur,pre=i%2,1-i%2
#             dp[cur][0]=triangle[i][0]+dp[pre][0]
#             dp[cur][i]=triangle[i][i]+dp[pre][i-1]
#             for j in range(1,i):
#                 dp[cur][j]=min(dp[pre][j-1],dp[pre][j])+triangle[i][j]

#         return min(dp[(l-1)%2])

# 由下往上
# class Solution:
#     def minimumTotal(self, triangle) -> int:
#         l=len(triangle)
#         dp=[0]*(l+1)
#         for i in range(l-1,-1,-1):
#             for j in range(i+1):
#                 dp[j]=min(dp[j],dp[j+1])+triangle[i][j]
#         return dp[0]