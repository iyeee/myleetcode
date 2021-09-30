#
# @lc app=leetcode.cn id=682 lang=python3
#
# [682] 棒球比赛
#

# @lc code=start
class Solution:
    def calPoints(self, ops) -> int:
        res=[]
        for op in ops:
            if op=="+":
                res.append(res[-1]+res[-2])
            elif op=="D":
                res.append(2*res[-1])
            elif op=="C":
                res.pop()
            else:
                res.append(int(op))
        return sum(res)
# @lc code=end

# Solution1:
# class Solution:
#     def calPoints(self, ops) -> int:
#         res=[]
#         i=0
#         for op in ops:
#             if op=="+":
#                 res.append(res[i-1]+res[i-2])
#             elif op=="D":
#                 res.append(2*res[i-1])
#             elif op=="C":
#                 res.pop()
#                 i-=2
#             else:
#                 res.append(int(op))
#             i+=1
#         return sum(res)

# class Solution:
#     def calPoints(self, ops) -> int:
#         res=[]
#         for op in ops:
#             if op=="+":
#                 res.append(res[-1]+res[-2])
#             elif op=="D":
#                 res.append(2*res[-1])
#             elif op=="C":
#                 res.pop()
#             else:
#                 res.append(int(op))
#         return sum(res)