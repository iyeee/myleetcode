#
# @lc app=leetcode.cn id=228 lang=python3
#
# [228] 汇总区间
#

# @lc code=start
from types import resolve_bases


class Solution:
    def summaryRanges(self, nums):
        result=[]
        low=high=i=0
        n=len(nums)
        while i<n:
            low=i
            i+=1
            while i<n and nums[i-1]+1==nums[i]:
                i+=1
            high=i-1
            if low==high:
                result.append(str(nums[low]))
            else:
                result.append(str(nums[low])+"->"+str(nums[high]))
            
        return result
Solution().summaryRanges([0,1,2])
# @lc code=end

# Solution1:
# class Solution:
#     def summaryRanges(self, nums):
#         result=[]
#         pre=""
#         for i in range(len(nums)):
#             cur=str(nums[i])
#             if i==len(nums)-1:
#                 if pre=="":
#                     result.append(cur)
#                 else:
#                     result.append(pre+"->"+cur  )
#             elif nums[i]+1!=nums[i+1]:
#                 if pre=="":
#                     result.append(cur)
#                 else:
#                     result.append(pre+"->"+cur)
#                     pre=""
#             else:
#                 if  i==0 or nums[i-1]+1!=nums[i]:
#                     pre=cur
#         return result

# Solution2:
# class Solution:
#     def summaryRanges(self, nums):
#         result=[]
#         low=high=i=0
#         n=len(nums)
#         while i<n:
#             low=i
#             i+=1
#             while i<n and nums[i-1]+1==nums[i]:
#                 i+=1
#             high=i-1
#             if low==high:
#                 result.append(str(nums[low]))
#             else:
#                 result.append(str(nums[low])+"->"+str(nums[high]))
            
#         return result
