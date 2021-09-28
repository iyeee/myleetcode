#
# @lc app=leetcode.cn id=434 lang=python3
#
# [434] 字符串中的单词数
#

# @lc code=start
class Solution:
    def countSegments(self, s: str) -> int:
        s+=" "
        count=0
        for i in range(len(s)):
            if s[i]!=" " and s[i+1]==" ":
                count+=1
        return count

# @lc code=end

# solution1:
# class Solution:
#     def countSegments(self, s: str) -> int:
#         return len(s.split())

# Solution2：
# class Solution:
#     def countSegments(self, s: str) -> int:
#         count=0
#         for i in range(len(s)):
#             if (i==0 or s[i-1]==" ") and s[i]!=" ":
#                 count+=1
#         return count

# python and 有短路
# class Solution:
#     def countSegments(self, s: str) -> int:
#         s+=" "
#         count=0
#         for i in range(len(s)):
#             if s[i]!=" " and s[i+1]==" ":
#                 count+=1
#         return count