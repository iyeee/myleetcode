#
# @lc app=leetcode.cn id=386 lang=python3
#
# [386] 字典序排数
#

# @lc code=start
class Solution:
    def lexicalOrder(self, n: int) -> List[int]:

# @lc code=end

# class Solution:
#     def lexicalOrder(self, n: int) -> List[int]:
#         list=[]
#         for i in range(1,n+1):
#             list.append(str(i))
#         list.sort()
#         for i,x in enumerate(list):
#             list[i]=int(x)
#         return list

# dfs
# class Solution:
#     def lexicalOrder(self, n: int) -> List[int]:
#         res=[]
#         def dfs(num):
#             if num>n:
#                 return
#             res.append(num)
#             for x in range(num*10,num*10+10):
#                 dfs(x)
#         for x in range(1,10):
#             dfs(x)
#         return res


# !Solution3:
# 迭代