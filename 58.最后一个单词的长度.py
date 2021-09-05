#
# @lc app=leetcode.cn id=58 lang=python3
#
# [58] 最后一个单词的长度
#

# @lc code=start
class Solution:
    def lengthOfLastWord(self, s: str) -> int:
       if not s.strip(): 
           return 0
       return len(s.split()[-1])

# @lc code=end

# Solution1:
# class Solution:
#     def lengthOfLastWord(self, s: str) -> int:
#         string=s.strip()
#         num=0
#         for i in range(len(string)-1,-1,-1):
#             if string[i]!=" ":
#                 num+=1
#             else:
#                 break
#         return num

# Solution2.1:
# class Solution:
#     def lengthOfLastWord(self, s: str) -> int:
#        if not s.strip(): 
#            return 0
#        return len(s.split()[-1])

# Solution2.2:
# class Solution:
#     def lengthOfLastWord(self, s: str) -> int:
#        return len(s.strip().split(" ")[-1])


# 注:
# print("".split(" "))   ['']
# print("".split())      []


