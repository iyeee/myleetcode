#
# @lc app=leetcode.cn id=953 lang=python3
#
# [953] 验证外星语词典
#

# @lc code=start
class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        wordMap={c:i for i,c in enumerate(order)}
        for i in range(len(words)-1):
            word1=words[i]
            word2=words[i+1]
            flag=True
            for k in range(min(len(word1),len(word2))):
                if word1[k]!=word2[k]:
                    if wordMap[word1[k]]>wordMap[word2[k]]:
                        return False
                    else:
                        flag=False
                        break
            if flag and k==min(len(word1),len(word2)-1):
                if len(word1)>len(word2):
                    return False
        return True
# @lc code=end

# Solution1:
# class Solution:
#     def isAlienSorted(self, words: List[str], order: str) -> bool:
#         newList=[]
#         wordMap={c:i for i,c in enumerate(order)}
#         for word in words:
#             l=list(word)
#             for i,c in enumerate(l):
#                 l[i]=chr(wordMap.get(c)+97)
#             newList.append("".join(l))
#         oldList=newList.copy()
#         newList.sort()
#         return newList==oldList


# Solution2:
# class Solution:
#     def isAlienSorted(self, words: List[str], order: str) -> bool:
#         wordMap={c:i for i,c in enumerate(order)}
#         for i in range(len(words)-1):
#             word1=words[i]
#             word2=words[i+1]
#             flag=True
#             for k in range(min(len(word1),len(word2))):
#                 if word1[k]!=word2[k]:
#                     if wordMap[word1[k]]>wordMap[word2[k]]:
#                         return False
#                     else:
#                         flag=False
#                         break
#             if flag and k==min(len(word1),len(word2)-1):
#                 if len(word1)>len(word2):
#                     return False
#         return True