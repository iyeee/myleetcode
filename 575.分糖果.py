#
# @lc app=leetcode.cn id=575 lang=python3
#
# [575] 分糖果
#

# @lc code=start
class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        lenth=len(candyType)
        if lenth==0:
            return 0
        candyType.sort()
        count=1
        pre=candyType[0]
        for i,c in enumerate(candyType):
            if c!=pre:
                count+=1
            pre=c
        return min(count,lenth//2)

# @lc code=end

# Solution1:
# class Solution:
#     def distributeCandies(self, candyType: List[int]) -> int:
#         s=set(candyType)
#         m,n=len(s),len(candyType)
#         half=n//2
#         if m>=half:
#             return half
#         else:
#             return m

# Solution2:
# 排序后计算种类数，较慢
# class Solution:
#     def distributeCandies(self, candyType: List[int]) -> int:
#         s=set(candyType)
#         m,n=len(s),len(candyType)
#         half=n//2
#         if m>=half:
#             return half
#         else:
#             return m