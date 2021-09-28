#
# @lc app=leetcode.cn id=492 lang=python3
#
# [492] 构造矩形
#

# @lc code=start
import math
class Solution:
    def constructRectangle(self, area: int) -> List[int]:
    
        for n in range(int(math.sqrt(area)),0,-1):
            if area%n==0:
                return [area//n,n]
# @lc code=end


# Solution1：
# 从两端向中间，较慢
# import math
# class Solution:
#     def constructRectangle(self, area: int) -> List[int]:
#         sq=math.sqrt(area)
#         if sq%1==0:
#             return [int(sq),int(sq)]
#         l,w=0,0
#         for n in range(area,int(math.sqrt(area)),-1):
#             if area%n==0:
#                 l,w=n,area//n
#         return [l,w]

# Solution2:
# 从中间向两端，较快
# import math
# class Solution:
#     def constructRectangle(self, area: int) -> List[int]:
    
#         for n in range(int(math.sqrt(area)),0,-1):
#             if area%n==0:
#                 return [area//n,n]
