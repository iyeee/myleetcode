#
# @lc app=leetcode.cn id=67 lang=python3
#
# [67] 二进制求和
#

# @lc code=start

# @lc code=end
print(Solution().addBinary("111","1010"))

# solution1:
# class Solution:
#     def addBinary(self, a: str, b: str) -> str:
#         num1=int(a,2)
#         num2=int(b,2)
#         sum=bin(num1+num2)
#         return str(sum)[2:]
# class Solution:
#     def addBinary(self, a, b) -> str:
#         return '{:b}'.format(int(a, 2) + int(b, 2))

# Solution2:模拟
# class Solution:
#     def addBinary(self, a: str, b: str) -> str:
#         ans=''
#         carry,lenth1,lenth2=0,len(a),len(b)
#         if lenth1<=lenth2:
#             a=(lenth2-lenth1)*'0'+a
#             lenth1=lenth2
#         else:
#             b=(lenth1-lenth2)*'0'+b
#             lenth2=lenth1
#         for i in range(lenth1-1,-1,-1):
#             # 法一
#             tmp=int(a[i])^int(b[i])^carry
#             ans+=str(tmp)
#             # if (int(a[i])+int(b[i])+carry)>=2:
#             #     carry=1
#             # else:
#             #     carry=0
#             carry=(int(a[i])+int(b[i])+carry)//2
#             #法二
#             # tmp=int(a[i])+int(b[i])+carry
#             # ans+=str(tmp%2)
#             # carry=tmp//2
#         if carry==1:
#             ans+=str(carry)
#         return ans[::-1]


# ?solution3:
# class Solution:
#     def addBinary(self, a, b) -> str:
#         x, y = int(a, 2), int(b, 2)
#         while y:
#             answer = x ^ y
#             carry = (x & y) << 1
#             x, y = answer, carry
#         return bin(x)[2:]

