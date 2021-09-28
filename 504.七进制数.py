#
# @lc app=leetcode.cn id=504 lang=python3
#
# [504] 七进制数
#

# @lc code=start
class Solution:
    def convertToBase7(self, num: int) -> str:
        if num==0:
            return "0"
        res=""
        f=""
        if num<0:
            num=-num
            f="-"
        while num!=0:
            res=str(num%7)+res
            num//=7
        return f+res
# @lc code=end


# Solution1:
# class Solution:
#     def convertToBase7(self, num: int) -> str:
#         if num==0:
#             return "0"
#         res=""
#         f=""
#         if num<0:
#             num=-num
#             f="-"
#         while num!=0:
#             res=str(num%7)+res
#             num//=7
#         return f+res