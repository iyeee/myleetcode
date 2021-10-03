#
# @lc app=leetcode.cn id=819 lang=python3
#
# [819] 最常见的单词
#

# @lc code=start
from collections import Counter
class Solution:
    def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
        for c in "!?',;.":
            paragraph=paragraph.lower().replace(c," ")
        dic=Counter(word for word in paragraph.split())
        m=0
        for k,v in dic.items():
            if k not in banned and v>m:
                m=v
                res=k
        return res 
# @lc code=end

# Solution1:
# from collections import Counter
# class Solution:
#     def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
#         # paragraph=("".join(filter(lambda x:x not in "!?',;.",list(paragraph)))).lower()
#         for c in "!?',;.":
#             paragraph=paragraph.lower().replace(c," ")
#         dic=Counter(paragraph.split())
#         m=0
#         for k,v in dic.items():
#             if k not in banned:
#                 if v>m:
#                     m=v
#                     res=k
#         return res 

# Solution2
# from collections import Counter
# class Solution:
#     def mostCommonWord(self, paragraph: str, banned: List[str]) -> str:
#         for c in "!?',;.":
#             paragraph=paragraph.lower().replace(c," ")
#         dic=Counter(word for word in paragraph.split())
#         m=0
#         for k,v in dic.items():
#             if k not in banned and v>m:
#                 m=v
#                 res=k
#         return res 