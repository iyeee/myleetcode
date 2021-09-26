#
# @lc app=leetcode.cn id=171 lang=python3
#
# [171] Excel 表列序号
#

# @lc code=start
class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        sum=0
        for c in columnTitle:
            sum=sum*26+(ord(c)-ord('A')+1)
        return sum
# @lc code=end

# Solution1:
# class Solution:
#     def titleToNumber(self, columnTitle: str) -> int:
#         sum=0
#         for c in columnTitle:
#             sum=sum*26+(ord(c)-64)
#         return sum