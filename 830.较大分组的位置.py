#
# @lc app=leetcode.cn id=830 lang=python3
#
# [830] 较大分组的位置
#

# @lc code=start
class Solution:
    def largeGroupPositions(self, s: str):
        pre=""
        tmp,tmpNum,ans=[],0,[]
        s+="!"
        for i,c in enumerate(s):
            if c!=pre:
                if tmpNum>=3:
                    tmp.append(i-1)
                    ans.append(tmp)  
                tmp,tmpNum=[i],1
            else:
                tmpNum+=1
            pre=c
        return ans
# @lc code=end

# Solution1:
# class Solution:
#     def largeGroupPositions(self, s: str):
#         pre=""
#         tmp,tmpNum,ans=[],0,[]
#         s+="!"
#         for i,c in enumerate(s):
#             if c!=pre:
#                 if tmpNum>=3:
#                     tmp.append(i-1)
#                     ans.append(tmp)  
#                 tmp,tmpNum=[i],1
#             else:
#                 tmpNum+=1
#             pre=c
#         return ans