#
# @lc app=leetcode.cn id=168 lang=python3
#
# [168] Excel表列名称
#

# @lc code=start
class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        l=list()
        while columnNumber>0:
            columnNumber-=1
            l.append(chr(65+columnNumber%26))
            columnNumber//=26
        return "".join(l)[::-1]
# print(Solution().convertToTitle(701))
# @lc code=end

# Solution1:
# 相比0-26 1-26进制每一位先减一
# class Solution:
#     def convertToTitle(self, columnNumber: int) -> str:
#         l=list()
#         while columnNumber>0:
#             columnNumber-=1
#             l.append(chr(65+columnNumber%26))
#             columnNumber//=26
#         return "".join(l)[::-1]