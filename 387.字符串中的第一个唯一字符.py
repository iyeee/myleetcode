#
# @lc app=leetcode.cn id=387 lang=python3
#
# [387] 字符串中的第一个唯一字符
#

# @lc code=start
class Solution:
    def firstUniqChar(self, s: str) -> int:
        l=[0]*26
        for c in s:
            l[ord(c)-ord('a')]+=1
        for i,c in enumerate(s):
            if l[ord(c)-ord('a')]==1:
                return i
        return -1
# @lc code=end

# Soluton1:
# class Solution:
#     def firstUniqChar(self, s: str) -> int:
#         l=[0]*26
#         for c in s:
#             l[ord(c)-ord('a')]+=1
#         for i,c in enumerate(s):
#             if l[ord(c)-ord('a')]==1:
#                 return i
#         return -1