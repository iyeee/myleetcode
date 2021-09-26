#
# @lc app=leetcode.cn id=242 lang=python3
#
# [242] 有效的字母异位词
#

# @lc code=start
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        ls=list(s)
        lt=list(t)
        ls.sort()
        lt.sort()
        return ls==lt
    
print(Solution().isAnagram("ccar","racc"))
# @lc code=end


# Solution1:
# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         mapS,mapT={},{}
#         for c in s:
#             mapS.update({c:mapS.get(c,0)+1})
#         for c2 in t:
#             mapT.update({c2:mapT.get(c2,0)+1})
#         return mapS==mapT


# Solution2：
# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         strs=[0]*26
#         for c in s:
#             strs[ord(c)-ord('a')]+=1
#         print(strs)
#         for t in t:
#             index=ord(t)-ord('a')
#             strs[index]-=1
#             if strs[index]<0:
#                 return False
#         print(strs)
#         for n in strs:
#             if n>0:
#                 return False
#         return True

# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         strs=[0]*26
#         for c in s:
#             strs[ord(c)-ord('a')]+=1
#         print(strs)
#         for t in t:
#             index=ord(t)-ord('a')
#             strs[index]-=1
#         for n in strs:
#             if n!=0:
#                 return False
#         return True


# solution3:
# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         ls=list(s)
#         lt=list(t)
#         ls.sort()
#         lt.sort()
#         return ls==lt