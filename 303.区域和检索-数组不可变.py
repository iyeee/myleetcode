#
# @lc app=leetcode.cn id=303 lang=python3
#
# [303] 区域和检索 - 数组不可变
#

# @lc code=start

        
# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
# @lc code=end

# Solution1:
# 直接计算，较慢
# class NumArray:

#     def __init__(self, nums: List[int]):
#         self.nums=nums
#     def sumRange(self, left: int, right: int) -> int:
#         return sum(self.nums[left:right+1])

# Solution2：
# 前缀和
# class NumArray:

#     def __init__(self, nums: List[int]):
#         n=len(nums)
#         self.preSum=[0]*(n+1)
#         for i in range(1,n+1):
#             self.preSum[i]=self.preSum[i-1]+nums[i-1]
#     def sumRange(self, left: int, right: int) -> int:
#         return self.preSum[right+1]-self.preSum[left]

# class NumArray:

#     def __init__(self, nums: List[int]):
#         self.preSum=[0]
#         _preSum=self.preSum
#         for num in nums:
#             _preSum.append(_preSum[-1]+num)
#     def sumRange(self, left: int, right: int) -> int:
#         return self.preSum[right+1]-self.preSum[left]