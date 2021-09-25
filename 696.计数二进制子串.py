#
# @lc app=leetcode.cn id=696 lang=python3
#
# [696] 计数二进制子串
#

# @lc code=start

# @lc code=end

# Solution1:
# class Solution:
#     def countBinarySubstrings(self, s: str) -> int:
#         num0=num1=sum=0
#         t=s[0]
#         for c in s:
#             if c=='0':
#                 if c!=t:
#                     num0=0
#                 num0+=1
#                 if num0<=num1:
#                     sum+=1
#             else:
#                 if c!=t:
#                     num1=0
#                 num1+=1
#                 if num0>=num1:
#                     sum+=1
#             t=c
#         return sum
            
# Solution2:
# class Solution:
#     def countBinarySubstrings(self, s: str) -> int:
#         l=[]
#         t=s[0]
#         n=0
#         for c in s:
#             if c!=t:
#                 l.append(n)
#                 n=1
#             else:
#                 n+=1
#             t=c
#         l.append(n)
#         sum=0
#         for i in range(len(l)-1):
#             sum+=min(l[i],l[i+1])
#         return sum