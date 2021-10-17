#
# @lc app=leetcode.cn id=1877 lang=python3
#
# [1877] 数组中最大数对和的最小值
#

# @lc code=start
class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        res=0
        lenth=len(nums)
        nums.sort()
        for i in range(lenth):
            res=max(res,nums[i]+nums[lenth-i-1])
        return res
# @lc code=end

 