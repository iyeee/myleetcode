#
# @lc app=leetcode.cn id=821 lang=python3
#
# [821] 字符的最短距离
#

# @lc code=start
class Solution:
    def shortestToChar(self, s: str, c: str):
        prev=float('-inf')
        ans=[]
        for i,x in enumerate(s):
            if x==c:
                prev=i
            ans.append(i-prev)
        prev=float('inf')
        for i in range(len(s)-1,-1,-1):
            if s[i]==c:
                prev=i
            ans[i]=min(ans[i],prev-i)
        return ans
# @lc code=end

# Solution1:
# class Solution:
#     def shortestToChar(self, s: str, c: str):
#         res=[]
#         strs=s.split(c)
#         lenth=len(strs)
#         for i in range(len(strs[0])):
#             res.append(len(strs[0])-i)
#         res.append(0)
#         for j in range(1,lenth-1):
#             for k in range(len(strs[j])):
#                 res.append(min(k+1,len(strs[j])-k))
#             res.append(0)
#         if lenth>=2:  
#             for l in range(len(strs[-1])):
#                 res.append(l+1)
#         return res

# 前后两次遍历取min
# solutoin2:
# class Solution:
#     def shortestToChar(self, s: str, c: str):
#         prev=float('-inf')
#         ans=[]
#         for i,x in enumerate(s):
#             if x==c:
#                 prev=i
#             ans.append(i-prev)
#         prev=float('inf')
#         for i in range(len(s)-1,-1,-1):
#             if s[i]==c:
#                 prev=i
#             ans[i]=min(ans[i],prev-i)
#         return ans