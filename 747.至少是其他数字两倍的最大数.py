#
# @lc app=leetcode.cn id=747 lang=python3
#
# [747] 至少是其他数字两倍的最大数
#

# @lc code=start
class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        first,second,index=0,0,0
        for i,num in enumerate(nums):
            if num>first:
                second=first
                first=num
                index=i
            elif num>second:
                second=num
        return index if first>=2*second else -1


# @lc code=end

# Solution1:
# class Solution:
#     def dominantIndex(self, nums: List[int]) -> int:
#         maxNum=max(nums)
#         res=0
#         for i,num in enumerate(nums):
#             if num==maxNum:
#                 res=i
#             elif num*2>maxNum:
#                 return -1
#         return res

# 一次遍历
# class Solution:
#     def dominantIndex(self, nums: List[int]) -> int:
#         first,second,index=0,0,0
#         for i,num in enumerate(nums):
#             if num>first:
#                 second=first
#                 first=num
#                 index=i
#             elif num>second:
#                 second=num

#         return index if first>=2*second else -1
