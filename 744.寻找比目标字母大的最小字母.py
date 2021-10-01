#
# @lc app=leetcode.cn id=744 lang=python3
#
# [744] 寻找比目标字母大的最小字母
#

# @lc code=start
class Solution:
    def nextGreatestLetter(self, letters, target: str) -> str:
        index=bisect.bisect(letters,target)
        return letters[index%len(letters)]
# @lc code=end
 
# Soluton1:
# class Solution:
#     def nextGreatestLetter(self, letters: List[str], target: str) -> str:
#         if target>=letters[-1] or target<letters[0]:
#             return letters[0]
#         for i in range(len(letters)-1):
#             if letters[i]<=target and letters[i+1]>target:
#                 return letters[i+1]
        
# class Solution:
#     def nextGreatestLetter(self, letters: List[str], target: str) -> str:
#         if target>=letters[-1] or target<letters[0]:
#             return letters[0]
#         for i in range(len(letters)-1):
#             if letters[i]<=target and letters[i+1]>target:
#                 return letters[i+1]
        

# Solution3:
# 二分查找法：
# class Solution:
#     def nextGreatestLetter(self, letters, target: str) -> str:
#         index=bisect.bisect(letters,target)
#         return letters[index%len(letters)]