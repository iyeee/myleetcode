#
# @lc app=leetcode.cn id=119 lang=python3
#
# [119] 杨辉三角 II
#

# @lc code=start
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        arr = [1] * (rowIndex + 1)
        for i in range(1, len(arr) - 1):
            arr[i] = arr[i - 1] * (rowIndex - i + 1) // i
        return arr


# @lc code=end

# Solution1:
# class Solution:
#     def getRow(self, rowIndex: int) -> List[int]:
#         res=[1]*(rowIndex+1)
#         for i in range(1,rowIndex):
#             for j in range(i,0,-1):
#                 res[j]=res[j]+res[j-1]
#         return res


# Solution2:
# TODO
# 数学方法
# class Solution:
#     def getRow(self, rowIndex: int) -> List[int]:
#         arr = [1] * (rowIndex + 1)
#         for i in range(1, len(arr) - 1):
#             arr[i] = arr[i - 1] * (rowIndex - i + 1) // i
#         return arr
