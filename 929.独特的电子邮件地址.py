#
# @lc app=leetcode.cn id=929 lang=python3
#
# [929] 独特的电子邮件地址
#

# @lc code=start
class Solution:
    def numUniqueEmails(self, emails) -> int:
        s=set()
        for email in emails:
            l,r=email.split("@")
            if '+' in l:
                l=l[:l.find('+')]
            s.add(l.replace('.','')+'@'+r)
        return len(s)
# @lc code=end

# Solution1:
# class Solution:
#     def numUniqueEmails(self, emails) -> int:
#         s=set()
#         for email in emails:
#             strs=email.split("@")
#             strs[0]=strs[0].replace(".","")
#             index=strs[0].find("+")
#             if index!=-1:
#                 strs[0]=strs[0][0:index]
#             s.add(strs[0]+"@"+strs[1])
#         # print(s)
#         return len(s)

# 改进：
# class Solution:
#     def numUniqueEmails(self, emails) -> int:
#         s=set()
#         for email in emails:
#             l,r=email.split("@")
#             if '+' in l:
#                 l=l[:l.find('+')]
#             s.add(l.replace('.','')+'@'+r)
#         return len(s)