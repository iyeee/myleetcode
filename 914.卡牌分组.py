#
# @lc app=leetcode.cn id=914 lang=python3
#
# [914] 卡牌分组
#

# @lc code=start
from collections import Counter
from functools import reduce
class Solution:
    def hasGroupsSizeX(self, deck: List[int]) -> bool:
        dic=Counter(deck).values()
        return reduce(gcd,dic)>=2

# @lc code=end

# Solution1:
# from collections import Counter
# class Solution:
#     def hasGroupsSizeX(self, deck: List[int]) -> bool:
#         dic=Counter(deck)
#         for x in range(2,max(dic.values())+1):
#             flag=True
#             for n in dic.values():
#                 if n%x!=0:
#                     flag=False
#                     break
#             if flag:
#                 return True
#         return False

# from collections import Counter
# class Solution:
#     def hasGroupsSizeX(self, deck: List[int]) -> bool:
#         dic=Counter(deck)
#         for x in range(2,max(dic.values())+1):
#             flag=True
#             for n in dic.values():
#                 if n%x!=0:
#                     flag=False
#                     break
#             if flag:
#                 return True
#         return False


# Solution2:
# 使用reduce(gcd,)
# from collections import Counter
# from functools import reduce
# class Solution:
#     def hasGroupsSizeX(self, deck: List[int]) -> bool:
#         dic=Counter(deck).values()
#         return reduce(gcd,dic)>=2