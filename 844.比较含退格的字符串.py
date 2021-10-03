#
# @lc app=leetcode.cn id=844 lang=python3
#
# [844] 比较含退格的字符串
#

# @lc code=start
class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        i,j=len(s)-1,len(t)-1
        skipS=skipT=0
        while i>=0 or j>=0:
            while i>=0:
                if s[i]=='#':
                    skipS+=1
                    i-=1
                elif skipS>0:
                    skipS-=1
                    i-=1
                else:
                    break
            while j>=0:
                if t[j]=='#':
                    skipT+=1
                    j-=1
                elif skipT>0:
                    skipT-=1
                    j-=1
                else:
                    break
            if i>=0 and j>=0:
                if s[i]!=t[j]:
                    return False
            elif i>=0 or j>=0:
                return False
            i-=1
            j-=1  
        return True  
# @lc code=end

# Solution1:
# 没有符合进阶要求，用O(1)空间
# class Solution:
#     def backspaceCompare(self, s: str, t: str) -> bool:
#         l1,l2=[],[]
#         for c in s:
#             if c=="#":
#                 if l1:
#                     l1.pop()
#             else:
#                 l1.append(c)
#         for c in t:
#             if c=="#":
#                 if l2:
#                     l2.pop()
#             else:
#                 l2.append(c)
#         return l1==l2


# Solution2:
# 双指针
# class Solution:
#     def backspaceCompare(self, s: str, t: str) -> bool:
#         i,j=len(s)-1,len(t)-1
#         skipS=skipT=0
#         while i>=0 or j>=0:
#             while i>=0:
#                 if s[i]=='#':
#                     skipS+=1
#                     i-=1
#                 elif skipS>0:
#                     skipS-=1
#                     i-=1
#                 else:
#                     break
#             while j>=0:
#                 if t[j]=='#':
#                     skipT+=1
#                     j-=1
#                 elif skipT>0:
#                     skipT-=1
#                     j-=1
#                 else:
#                     break
#             if i>=0 and j>=0:
#                 if s[i]!=t[j]:
#                     return False
#             elif i>=0 or j>=0:
#                 return False
#             i-=1
#             j-=1  
#         return True  