#
# @lc app=leetcode.cn id=746 lang=python3
#
# [746] 使用最小花费爬楼梯
#

# @lc code=start
class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        l=len(cost)
        dp=[0]*(l+1)
        for i in range(2,l+1):
            dp[i]=min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1])
        return dp[l]
# @lc code=end

# dp
# Solution1:
# class Solution:
#     def minCostClimbingStairs(self, cost: List[int]) -> int:
#         l=len(cost)
#         costs=[0]*(l+1)
#         for i in range(2,l+1):
#             costs[i]=min(costs[i-2]+cost[i-2],costs[i-1]+cost[i-1])
#         return costs[l]