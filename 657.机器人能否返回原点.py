#
# @lc app=leetcode.cn id=657 lang=python3
#
# [657] 机器人能否返回原点
#

# @lc code=start



# @lc code=end

# solution1:
# class Solution:
#     def judgeCircle(self, moves: str) -> bool:
#         up=down=left=right=0
#         for s in moves:
#             if s=="U":
#                 up+=1
#             elif s=="D":
#                 down+=1
#             elif s=="L":
#                 left+=1
#             elif s=="R":
#                 right+=1
#         if up==down and left==right:
#             return True
#         else:
#             return False

# class Solution:
#     def judgeCircle(self, moves: str) -> bool:
#         return moves.count("U")==moves.count("D") and moves.count("L")==moves.count("R")