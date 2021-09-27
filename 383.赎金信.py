#
# @lc app=leetcode.cn id=383 lang=python3
#
# [383] 赎金信
#

# @lc code=start
class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        words=[0]*26
        for c in magazine:
            words[ord(c)-ord('a')]+=1
        for c in ransomNote:
            index=ord(c)-ord('a')
            words[index]-=1
            if words[index]<0:
                return False
        return True
# @lc code=end

# Solution1:
# class Solution:
#     def canConstruct(self, ransomNote: str, magazine: str) -> bool:
#         words=[0]*26
#         for c in magazine:
#             words[ord(c)-ord('a')]+=1
#         for c in ransomNote:
#             index=ord(c)-ord('a')
#             words[index]-=1
#             if words[index]<0:
#                 return False
#         return True