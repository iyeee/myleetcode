#
# @lc app=leetcode.cn id=645 lang=python3
#
# [645] 错误的集合
#

# @lc code=start
from collections import Counter
class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]: 
        dic=Counter(nums)
        num1,num2=0,0
        for i in range(1,len(nums)+1):
            if dic[i]==0:
                num2=i
            elif dic[i]==2:
                num1=i
        return [num1,num2]
# @lc code=end


# Solution1:
# class Solution:
#     def findErrorNums(self, nums: List[int]) -> List[int]:
#         res=[]
#         nums.sort()
#         for i in range(len(nums)-1):
#             if nums[i]==nums[i+1]:
#                 res.append(nums[i])
#         s1=set(nums)
#         s2={i+1 for i in range(len(nums))}
#         res.append((s2-s1).pop())
#         return res    

# Soluton2:
# 使用Counter
# from collections import Counter
# class Solution:
#     def findErrorNums(self, nums: List[int]) -> List[int]: 
#         dic=Counter(nums)
#         num1,num2=0,0
#         for i in range(1,len(nums)+1):
#             if dic[i]==0:
#                 num2=i
#             elif dic[i]==2:
#                 num1=i
#         return [num1,num2]