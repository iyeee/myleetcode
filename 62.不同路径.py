#
# @lc app=leetcode.cn id=62 lang=python3
#
# [62] 不同路径
#

# @lc code=start
class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp=[[1]*n]+[[1]+[0]*(n-1) for _ in range(m-1)]
        for i in range(1,m):
            for j in range(1,n):
                dp[i][j]=dp[i-1][j]+dp[i][j-1]
        return dp[-1][-1]
# @lc code=end

# Solution1:
# 组合数学
# class Solution:
#     def uniquePaths(self, m: int, n: int) -> int:
#         def fuc(m,n):
#             res=1
#             for i in range(2,n+1):
#                 res*=i
#             for i in range(2,m+1):
#                 res//=i
#             for i in range(2,n-m+1):
#                 res//=i
#             return res
#         return fuc(min(m,n)-1,m+n-2)

# class Solution:
#     def uniquePaths(self, m: int, n: int) -> int:
#         return comb(m+n-2,n-1)

# class Solution:
#     def uniquePaths(self, m: int, n: int) -> int:
#          return math.factorial(m+n-2)//math.factorial(m-1)//math.factorial(n-1)

# Solution2:
# dp
# class Solution:
#     def uniquePaths(self, m: int, n: int) -> int:
#         dp=[[1]*n]+[[1]+[0]*(n-1) for _ in range(m-1)]
#         for i in range(1,m):
#             for j in range(1,n):
#                 dp[i][j]=dp[i-1][j]+dp[i][j-1]
#         return dp[-1][-1]
