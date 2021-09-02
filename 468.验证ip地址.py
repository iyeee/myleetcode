#
# @lc app=leetcode.cn id=468 lang=python3
#
# [468] 验证IP地址
#

# @lc code=start
class Solution:
    def validIPAddress(self, IP: str) -> str:
        if  IP.count('.')==3:
            strs=IP.split(".")
            for str in strs:
                sublen=len(str)
                if sublen==0 or sublen>=4 or not str.isdigit() or int(str)>=256 or str[0]=='0' and sublen!=1:
                    return 'Neither'
            return 'IPv4'
        elif IP.count(':')==7:
            strs1=IP.split(":")
            for str in strs1:
                sublen1=len(str)
                if sublen1==0 or sublen1>4 or not str.isalnum():
                    return 'Neither'
                for char in str:
                    if char.lower()>='g':
                        return 'Neither'
            return 'IPv6'
        else:
            return 'Neither'

# @lc code=end

# Solution1.1:
# class Solution:
#     def validIPAddress(self, IP: str) -> str:
#         lenth=len(IP)

#         if lenth<7 or lenth >39:
#             return 'Neither'
#         elif lenth <=15 and  IP.find(':')==-1:
#             strs=IP.split(".")
#             if len(strs)!=4:
#                 return 'Neither'
#             for i in range(4):
#                 sublen=len(strs[i])
            
#                 if sublen==0 or sublen>=4 or not strs[i].isdigit():
#                     return 'Neither'
#                 if sublen>1 and str(int(strs[i]))!=strs[i]:
#                     return 'Neither'
#                 if int(strs[i])>=256:
#                     return 'Neither'
#             return 'IPv4'
#         else:
#             strs1=IP.split(":")
#             if len(strs1)!=8:
#                 return 'Neither'
#             for i in range(8):
#                 sublen1=len(strs1[i])
#                 if sublen1==0 or sublen1>4 or not strs1[i].isalnum():
#                     return 'Neither'
#                 for char in strs1[i]:
#                     if char.lower()>='g':
#                         return 'Neither'
#             return 'IPv6'

# Solution1.2: 1.1改进版

# class Solution:
#     def validIPAddress(self, IP: str) -> str:
#         if  IP.count('.')==3:
#             strs=IP.split(".")
#             for str in strs:
#                 sublen=len(str)
#                 if sublen==0 or sublen>=4 or not str.isdigit() or int(str)>=256 or str[0]=='0' and sublen!=1:
#                     return 'Neither'
#             return 'IPv4'
#         elif IP.count(':')==7:
#             strs1=IP.split(":")
#             for str in strs1:
#                 sublen1=len(str)
#                 if sublen1==0 or sublen1>4 or not str.isalnum():
#                     return 'Neither'
#                 for char in str:
#                     if char.lower()>='g':
#                         return 'Neither'
#             return 'IPv6'
#         else:
#             return 'Neither'







# ?Solution2: 构建正则表达式：
# import re
# class Solution:
#     chunk_IPv4 = r'([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])'
#     patten_IPv4 = re.compile(r'^(' + chunk_IPv4 + r'\.){3}' + chunk_IPv4 + r'$')
    
#     chunk_IPv6 = r'([0-9a-fA-F]{1,4})'
#     patten_IPv6 = re.compile(r'^(' + chunk_IPv6 + r'\:){7}' + chunk_IPv6 + r'$')

#     def validIPAddress(self, IP: str) -> str:        
#         if '.' in IP:
#             return "IPv4" if self.patten_IPv4.match(IP) else "Neither" 
#         if ':' in IP:
#             return "IPv6" if self.patten_IPv6.match(IP) else "Neither" 
#         return "Neither"
