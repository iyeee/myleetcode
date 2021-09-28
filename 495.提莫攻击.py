#
# @lc app=leetcode.cn id=495 lang=python3
#
# [495] 提莫攻击
#

# @lc code=start
class Solution:
    def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
        sum,pre=0,0
        for i,n in enumerate(timeSeries):
            if n>pre+duration or i==0:
                sum+=duration
            else:
                sum=sum+n-pre
            pre=n
        return sum

# @lc code=end

# wrong Solution:
# 超时
# class Solution:
#     def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
#         s=set()
#         for n in timeSeries:
#             for m in range(duration):
#                 s.add(n+m)
#         return len(s)

# Solution1:
# class Solution:
#     def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
#         sum,pre=0,0
#         for i,n in enumerate(timeSeries):
#             if n>pre+duration or i==0:
#                 sum+=duration
#             else:
#                 sum=sum+n-pre
#             pre=n
#         return sum

# class Solution:
#     def findPoisonedDuration(self, timeSeries: List[int], duration: int) -> int:
#         if len(timeSeries)==0 or duration==0:
#             return 0
#         sum=0
#         for i in range(len(timeSeries)-1):
#             sum+=min(duration,timeSeries[i+1]-timeSeries[i])
#         return sum+duration