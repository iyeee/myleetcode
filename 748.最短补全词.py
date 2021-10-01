#
# @lc app=leetcode.cn id=748 lang=python3
#
# [748] 最短补全词
#

# @lc code=start
from collections import Counter
class Solution:
    def shortestCompletingWord(self, licensePlate: str, words) -> str:
        license="".join(filter(str.isalpha,licensePlate)).lower()
        words=sorted(words,key=lambda x:len(x))
        for word in words:
            tmp=word
            flag=True
            for ch in license:
                if ch not in tmp:
                    flag=False
                    break
                else:
                    tmp=tmp.replace(ch,"",1)
            if flag:
                return word
# @lc code=end

# Solution1:
# from collections import Counter
# class Solution:
#     def shortestCompletingWord(self, licensePlate: str, words) -> str:
#         license="".join(filter(str.isalpha,licensePlate)).lower()
#         dic=Counter(license)
#         lenth=float("inf")
#         res=""
#         for word in words:
#             flag=True
#             tmpDic=Counter(word)
#             for c in license:
#                 if  c not in tmpDic or tmpDic[c]<dic[c]:
#                     flag=False
#                     break
#             if flag and len(word)<lenth:
#                 res=word
#                 lenth=len(word)
#         return res


# words先从小到大排序
# from collections import Counter
# class Solution:
#     def shortestCompletingWord(self, licensePlate: str, words) -> str:
#         license="".join(filter(str.isalpha,licensePlate)).lower()
#         dic=Counter(license)
#         words=sorted(words,key=lambda x:len(x))
#         for word in words:
#             flag=True
#             tmpDic=Counter(word)
#             for c in license:
#                 if  c not in tmpDic or tmpDic[c]<dic[c]:
#                     flag=False
#                     break
#             if flag:
#                 return word


# Solution2:
# 注意python for else 语法
# from collections import Counter
# class Solution:
#     def shortestCompletingWord(self, licensePlate: str, words) -> str:
#         license="".join(filter(str.isalpha,licensePlate)).lower()
#         words=sorted(words,key=lambda x:len(x))
#         for word in words:
#             tmp=word
#             for ch in license:
#                 if ch not in tmp:
#                     break
#                 else:
#                     tmp=tmp.replace(ch,"",1)
#             else:
#                 return word

# from collections import Counter
# 不用for else语法
# class Solution:
#     def shortestCompletingWord(self, licensePlate: str, words) -> str:
#         license="".join(filter(str.isalpha,licensePlate)).lower()
#         words=sorted(words,key=lambda x:len(x))
#         for word in words:
#             tmp=word
#             for ch in license:
#                 if ch not in tmp:
#                     break
#                 else:
#                     tmp=tmp.replace(ch,"",1)
#             else:
#                 return word