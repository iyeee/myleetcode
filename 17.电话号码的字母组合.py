#
# @lc app=leetcode.cn id=17 lang=python3
#
# [17] 电话号码的字母组合
#

# @lc code=start
class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        if not digits: return []
        phone = {'2': ['a', 'b', 'c'],
                 '3': ['d', 'e', 'f'],
                 '4': ['g', 'h', 'i'],
                 '5': ['j', 'k', 'l'],
                 '6': ['m', 'n', 'o'],
                 '7': ['p', 'q', 'r', 's'],
                 '8': ['t', 'u', 'v'],
                 '9': ['w', 'x', 'y', 'z']}
        res = []
        tmppath = ""
        def back(index):
            nonlocal tmppath
            if len(tmppath) == len(digits):
                res.append(tmppath)
                return
            for item in phone[digits[index]]:
                tmppath += item
                back(index + 1)
                tmppath = tmppath[:-1]
        back(0)
        return res
# @lc code=end

# Solution1:
# class Solution:
#     def letterCombinations(self, digits: str) -> List[str]:
#         phoneMap={2:['a','b','c'],3:['d','e','f'],4:['g','h','i'],5:['j','k','l'],6:['m','n','o'],7:['p','q','r','s'],8:['t','u','v'],9:['w','x','y','z']}
#         lenth=len(digits)
#         list=[]
#         if lenth==0:
#             return list
#         elif lenth==1:
#             return phoneMap[int(digits[0])]
#         elif lenth==2:
#             index=int(digits[0])
#             index1=int(digits[1])
#             for i in range(len(phoneMap[index])):
#                 for j in range(len(phoneMap[index1])):
#                     str=phoneMap[index][i]
#                     str+=phoneMap[index1][j]
#                     list.append(str)
#             return list
#         elif lenth==3 :
#             index=int(digits[0])
#             index1=int(digits[1])
#             index2=int(digits[2])
#             for i in range(len(phoneMap[index])):
#                 for j in range(len(phoneMap[index1])):
#                     for k in range(len(phoneMap[index2])):
#                         str=phoneMap[index][i]+phoneMap[index1][j]
#                         str+=phoneMap[index2][k]
#                         list.append(str)
#             return list
#         else:
#             index=int(digits[0])
#             index1=int(digits[1])
#             index2=int(digits[2])
#             index3=int(digits[3])
#             for i in range(len(phoneMap[index])):
#                 for j in range(len(phoneMap[index1])):
#                     for k in range(len(phoneMap[index2])):
#                         for l in range(len(phoneMap[index3])):
#                             str=phoneMap[index][i]+phoneMap[index1][j]+phoneMap[index2][k]
#                             str+=phoneMap[index3][l]
#                             list.append(str)
#             return list


# ?Solution2: 队列方法
# class Solution:
#     def letterCombinations(self, digits: str) -> List[str]:
#         if not digits:
#             return []
#         phoneMap={
#             2:['a','b','c'],
#             3:['d','e','f'],
#             4:['g','h','i'],
#             5:['j','k','l'],
#             6:['m','n','o'],
#             7:['p','q','r','s'],
#             8:['t','u','v'],
#             9:['w','x','y','z']
#         }
#         res=['']
#         for digit in digits:
#             for x in range(len(res)):
#                 tmp=res.pop(0)
#                 for letter in phoneMap[int(digit)]:
#                     res.append(tmp+letter)
#         return res

# Solution3.1:
# from typing import List
# class Solution:
#     def letterCombinations(self, digits: str) -> List[str]:
#         if not digits: return []
#         phone = {'2':['a','b','c'],
#                  '3':['d','e','f'],
#                  '4':['g','h','i'],
#                  '5':['j','k','l'],
#                  '6':['m','n','o'],
#                  '7':['p','q','r','s'],
#                  '8':['t','u','v'],
#                  '9':['w','x','y','z']}
#         res=[]
#         def back(digits,index,path):
#             if len(path)==len(digits):
#                 res.append(path)
#                 return
#             for item in phone[digits[index]]:
#                 path+=item
#                 back(digits,index+1,path)
#                 path=path[:-1]
#         back(digits,0,"")
#         return res


# Solution3.2
# 注意global和nonlocal的使用
# class Solution:
#     def letterCombinations(self, digits: str) -> List[str]:
#         if not digits: return []
#         phone = {'2': ['a', 'b', 'c'],
#                  '3': ['d', 'e', 'f'],
#                  '4': ['g', 'h', 'i'],
#                  '5': ['j', 'k', 'l'],
#                  '6': ['m', 'n', 'o'],
#                  '7': ['p', 'q', 'r', 's'],
#                  '8': ['t', 'u', 'v'],
#                  '9': ['w', 'x', 'y', 'z']}
#         res = []
#         tmppath = ""
#         def back(index):
#             nonlocal tmppath
#             if len(tmppath) == len(digits):
#                 res.append(tmppath)
#                 return
#             for item in phone[digits[index]]:
#                 tmppath += item
#                 back(index + 1)
#                 tmppath = tmppath[:-1]
#         back(0)
#         return res