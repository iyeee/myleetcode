#
# @lc app=leetcode.cn id=9 lang=python3
#
# [9] 回文数
#

# @lc code=start
class Solution:
    def isPalindrome(self, x: int) -> bool:
        cur=0
        if x < 0 or x%10==0 and x!=0:
            return False
        else:
            num = x
            while num!=0:
                cur=cur*10 +num%10
                num//=10   
            return cur==x
# @lc code=end

# Solution1：
# class Solution:
#     def isPalindrome(self, x: int) -> bool:
#         if x < 0:
#             return False
#         elif x == 0:
#             return True
#         else:
#             string = str(x)
#             lenth = len(string)
#             for i in range(lenth // 2):
#                 if string[i] != string[lenth - i - 1]:
#                     return False
#             return True


# Solution2:
# class Solution:
#     def isPalindrome(self, x: int) -> bool:
#         return str(x)==str(x)[::-1]

# Solution3:
# class Solution:
#     def isPalindrome(self, x: int) -> bool:
#         cur=0
#         if x < 0 or x%10==0 and x!=0:
#             return False
#         else:
#             num = x
#             while num!=0:
#                 cur=cur*10 +num%10
#                 num//=10   
#             return cur==x