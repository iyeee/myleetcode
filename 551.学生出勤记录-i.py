#
# @lc app=leetcode.cn id=551 lang=python3
#
# [551] 学生出勤记录 I
#

# @lc code=start


# @lc code=end

# Solution1:
# class Solution:
#     def checkRecord(self, s: str) -> bool:
#         num=0
#         numL=0
#         for i in range(len(s)):
#             if s[i]=='A':
#                 num+=1
#             if s[i]=='L':
#                 numL+=1
#                 if numL==3:
#                     return False
#             else:
#                 numL=0 

#         if num>=2:
#             return False
#         return True

# class Solution:
#     def checkRecord(self, s: str) -> bool:
#         num=0
#         numL=0
#         for i,c in enumerate(s):
#             if c=='A':
#                 num+=1
#             if c=='L':
#                 numL+=1
#                 if numL==3:
#                     return False
#             else:
#                 numL=0 

#         if num>=2:
#             return False
#         return True