#
# @lc app=leetcode.cn id=500 lang=python3
#
# [500] 键盘行
#

# @lc code=start    
# @lc code=end

# Solution1:
# class Solution:
#     def findWords(self, words: List[str]) -> List[str]:
#         map={c:1 for c in "qwertyuiop"}
#         map.update({c:2 for c in "asdfghjkl" })
#         map.update({c:3 for c in "zxcvbnm"})
#         print(map)
#         res=[]

#         for word in words:
#             flag=True
#             tmpWord=word.lower()
#             t=map[tmpWord[0]]
#             for c in tmpWord:
#                 if map[c]!=t:
#                     flag=False
#                     break
#             if flag:
#                 res.append(word)
#         return res

# Solution2:
# Set求交集
# class Solution:
#     def findWords(self, words: List[str]) -> List[str]:
#         set1=set("qwertyuiopQWERTYUIOP")
#         set2=set("asdfghjklASDFGHJKL")
#         set3=set("zxcvbnmZXCVBNM")
#         res=[]
#         for word in words:
#             s=set(word)
#             if s&set1==s or s&set2==s or s&set3==s:
#                 res.append(word)
#         return res
    
# class Solution:
# python中 set运算 a&b=a 《=》 a<=b
#     def findWords(self, words: List[str]) -> List[str]:
#         set1=set("qwertyuiopQWERTYUIOP")
#         set2=set("asdfghjklASDFGHJKL")
#         set3=set("zxcvbnmZXCVBNM")
#         res=[]
#         for word in words:
#             s=set(word)
#             if set1>=s or set2>=s or set3>=s:
#                 res.append(word)
#         return res


# class Solution:
#     def findWords(self, words: List[str]) -> List[str]:
#         set1=set("qwertyuiopQWERTYUIOP")
#         set2=set("asdfghjklASDFGHJKL")
#         set3=set("zxcvbnmZXCVBNM")
#         res=[]
#         for word in words:
#             s=set(word)
#             if s.issubset(set1) or s.issubset(set2) or s.issubset(set3):
#                 res.append(word)
#         return res
    
# Solution3:
# 替换字符串
# strip的妙用
# class Solution:
#     def findWords(self, words: List[str]) -> List[str]:
#         s1="qwertyuiopQWERTYUIOP"
#         s2="asdfghjklASDFGHJKL"
#         s3="zxcvbnmZXCVBNM"
#         res=[]
#         for word in words:
#            if word.strip(s1)=="" or word.strip(s2)=="" or word.strip(s3)=="":
#                res.append(word)
#         return res