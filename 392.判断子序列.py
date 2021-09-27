#
# @lc app=leetcode.cn id=392 lang=python3
#
# [392] 判断子序列
#

# @lc code=start
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        m,n=len(s),len(t)
        i=j=0
        while i<m and j<n:
            if s[i]==t[j]:
                i+=1
            j+=1
        return i==m
# @lc code=end

# Solution1:
# class Solution:
#     def isSubsequence(self, s: str, t: str) -> bool:
#         n=len(s)
#         i=0
#         if s=="":
#             return True
#         for c in t:
#             if c==s[i]:
#                 i+=1
#             if i==n:
#                 return True     
#         return False

# Solution2:
# 双指针
# class Solution:
#     def isSubsequence(self, s: str, t: str) -> bool:
#         m,n=len(s),len(t)
#         i=j=0
#         while i<m and j<n:
#             if s[i]==t[j]:
#                 i+=1
#             j+=1
#         return i==m


# ？Solution3：
# 动态规划