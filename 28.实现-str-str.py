#
# @lc app=leetcode.cn id=28 lang=python3
#
# [28] 实现 strStr()
#

# @lc code=start
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if len(needle)==0:
            return 0
        for i in range(len(haystack)-len(needle)+1):
            if haystack[i:i+len(needle)]==needle:
                return i
        return -1
# @lc code=end
# solution1:暴力解法
# 最后一个case超时
# class Solution:
#     def strStr(self, haystack: str, needle: str) -> int:
#         if len(needle)==0:
#             return 0
#         lenth1=len(haystack)
#         lenth2=len(needle)
#         for i in range(lenth1-lenth2+1):
#             flag=True
#             for j in range(lenth2):
#                 if haystack[i+j]!=needle[j]:
#                     flag=False
#                     break
#             if flag:
#                 return i
#         return -1

# solution2: ac
# class Solution:
#     def strStr(self, haystack: str, needle: str) -> int:
#         if len(needle)==0:
#             return 0
#         for i in range(len(haystack)):
#             if haystack[i:i+len(needle)]==needle:
#                 return i
#         return -1



# solution3: kmp
# to do

