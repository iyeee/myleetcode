#
# @lc app=leetcode.cn id=414 lang=python3
#
# [414] 第三大的数
#

# @lc code=start
class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        max=mid=min=float("-inf")
        for n in nums:
            if n>max:
                min=mid
                mid=max
                max=n
            elif n==max:
                continue
            elif n>mid:
                min=mid
                mid=n
            elif mid==n:
                continue
            elif n>min:
                min=n
            elif min==n:
                continue
        if min!=float("-inf"):
            return min
        return max
# @lc code=end

# Solution1:
# class Solution:
#     def thirdMax(self, nums: List[int]) -> int:
#         max=mid=min=float("-inf")
#         for n in nums:
#             if n>max:
#                 min=mid
#                 mid=max
#                 max=n
#             elif n==max:
#                 continue
#             elif n>mid:
#                 min=mid
#                 mid=n
#             elif mid==n:
#                 continue
#             elif n>min:
#                 min=n
#             elif min==n:
#                 continue
#         if min!=float("-inf"):
#             return min
#         return max