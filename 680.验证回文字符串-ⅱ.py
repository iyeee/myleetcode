#
# @lc app=leetcode.cn id=680 lang=python3
#
# [680] 验证回文字符串 Ⅱ
#

# @lc code=start


# @lc code=end

print(Solution().validPalindrome("abc"))
# wrong Solution：
# 超时
# class Solution:
#     def validPalindrome(self, s: str) -> bool:
#         def isPal(s):
#             l=len(s)
#             for i in range(l//2):
#                 if s[i]!=s[l-i-1]:
#                     return False
#             return True
#         if isPal(s):
#             return True
#         li=list(s)
#         for i in range(len(s)):
#             li.pop(i)
#             if isPal("".join(li)):
#                 return True
#             li=list(s)
#         return False


# Solution1:
# class Solution:
#     def validPalindrome(self, s: str) -> bool:
#         def isPal(low,high):
#             while low<high:
#                 if s[low]!=s[high]:
#                     return False
#                 low+=1
#                 high-=1
#             return True
#         l,h=0,len(s)-1
#         if isPal(l,h):
#             return True
#         while l<h:
#             if s[l]==s[h]:
#                 l+=1
#                 h-=1
#             else:
#                 return isPal(l+1,h) or isPal(l,h-1)
#         return True

# 改进:
# 利用切片
# class Solution:
#     def validPalindrome(self, s: str) -> bool:
#         isPal=lambda s:s==s[::-1]
#         l,h=0,len(s)-1
#         if isPal(s):
#             return True
#         while l<h:
#             if s[l]==s[h]:
#                 l+=1
#                 h-=1
#             else:
#                 return isPal(s[l+1:h+1]) or isPal(s[l:h])
#         return True
