#
# @lc app=leetcode.cn id=290 lang=python3
#
# [290] 单词规律
#

# @lc code=start
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:   
        word2ch,ch2word=dict(),dict()
        words=s.split(" ")
        if len(pattern)!=len(words):
            return False
        for ch,word in zip(pattern,words):
            if (ch in ch2word and ch2word[ch]!=word) or (word in word2ch and word2ch[word]!=ch):
                return False
            word2ch[word]=ch
            ch2word[ch]=word
        return True

# @lc code=end


# Solution1:
# class Solution:
#     def wordPattern(self, pattern: str, s: str) -> bool:
#         l=s.split(" ")
#         if len(pattern)!=len(l):
#             return False
#         for i in range(len(pattern)):
#             for j in range(i+1,len(pattern)):
#                 if pattern[i]==pattern[j]:
#                     if l[i]!=l[j]:
#                         return False
#                 else:
#                     if l[i]==l[j]:
#                         return False
#         return True

# Solution2:
# 哈希表 简单双射 较慢
# class Solution:
#     def wordPattern(self, pattern: str, s: str) -> bool:   
#         l=s.split(" ")
#         m,n=len(pattern),len(l)
#         if m!=n:
#             return False
#         map={}
#         map2={}
#         for i in range(m):
#             if pattern[i] not in map.keys():
#                 map.update({pattern[i]:l[i]})
#             else:
#                 if map[pattern[i]]!=l[i]:
#                     return False
#             if l[i] not in map2.keys():
#                 map2.update({l[i]:pattern[i]})
#             else:
#                 if map2[l[i]]!=pattern[i]:
#                     return False
#         return True
# 官解
# class Solution:
#     def wordPattern(self, pattern: str, s: str) -> bool:   
#         word2ch,ch2word=dict(),dict()
#         words=s.split(" ")
#         if len(pattern)!=len(words):
#             return False
#         for ch,word in zip(pattern,words):
#             if (ch in ch2word and ch2word[ch]!=word) or (word in word2ch and word2ch[word]!=ch):
#                 return False
#             word2ch[word]=ch
#             ch2word[ch]=word
#         return True


# Solution3：
# 改进 一个hash表
# class Solution:
#     def wordPattern(self, pattern: str, s: str) -> bool:   
#         l=s.split(" ")
#         m,n=len(pattern),len(l)
#         if m!=n:
#             return False
#         map={}
#         for i in range(m):
#             if pattern[i] not in map.keys():
#                 if l[i] not in map.values():
#                     map.update({pattern[i]:l[i]})
#                 else:
#                     map[pattern[i]]=0
#             if map[pattern[i]]!=l[i]:
#                 return False
#         return True
