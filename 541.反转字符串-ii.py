#
# @lc app=leetcode.cn id=541 lang=python3
#
# [541] 反转字符串 II
#

# @lc code=start


# @lc code=end

# Solution1:
# class Solution:
#     def reverseStr(self, s: str, k: int) -> str:
#         ans=''
#         for i in range(0,len(s), 2*k):
#             if i==0:
#                 ans+=s[i+k-1::-1]
#             else:
#                 ans+=s[i+k-1:i-1:-1]
#             ans+=s[i+k:i+2*k]
#         return ans

# solution2:
# class Solution:
#     def reverseStr(self, s: str, k: int) -> str:
#         l=list(s)
#         for i in range(0,len(s),2*k):
#             l[i:i+k]=reversed(l[i:i+k])
#         return "".join(l)