#
# @lc app=leetcode.cn id=697 lang=python3
#
# [697] 数组的度
#

@lc code=start
from collections import Counter
class Solution:
    def findShortestSubArray(self, nums) -> int:
        dic=Counter(nums)
        max_v,res=max(dic.values()),float("inf")
        l=[]
        for k,v in dic.items():
            if v==max_v:
                l.append(k)
        for n in l:
            index=nums.index(n)
            index2=nums[::-1].index(n)
            tmp=len(nums)-index-index2
            res=min(res,tmp)
        return res
# @lc code=end

# Solution1
# 有点慢
# from collections import Counter
# class Solution:
#     def findShortestSubArray(self, nums) -> int:
#         dic=Counter(nums)
#         max_v,res=max(dic.values()),float("inf")
#         l=[]
#         for k,v in dic.items():
#             if v==max_v:
#                 l.append(k)
#         for n in l:
#             index=nums.index(n)
#             index2=nums[::-1].index(n)
#             tmp=len(nums)-index-index2
#             res=min(res,tmp)
#         return res


# Solution2:
# class Solution:
#     def findShortestSubArray(self, nums) -> int:
#         mp={}
#         for i,num in enumerate(nums):
#             if num in mp.keys():
#                 mp[num][0]+=1
#                 mp[num][2]=i
#             else:
#                 mp[num]=[1,i,i]   
#         maxNum=minLen=0 
#         for count,left,right in mp.values():
#             if count>maxNum:
#                 maxNum=count
#                 minLen=right-left+1
#             elif count==maxNum:
#                 minLen=min(minLen,right-left+1)
#         return minLen