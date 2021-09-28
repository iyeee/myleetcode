#
# @lc app=leetcode.cn id=415 lang=python3
#
# [415] 字符串相加
#

# @lc code=start
class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        sum=""
        i,j,carry=len(num1)-1,len(num2)-1,0
        while i>=0 or j>=0:
            n1=int(num1[i]) if i>=0 else 0
            n2=int(num2[j]) if j>=0 else 0
            tmpSum=n1+n2+carry
            sum=str(tmpSum%10)+sum
            carry=tmpSum//10
            i,j=i-1,j-1
        return '1'+sum if carry else sum       
# @lc code=end

# Solution1:
# class Solution:
#     def addStrings(self, num1: str, num2: str) -> str:
#         l1,l2,l3=list(num1),list(num2),[]
#         m,n=len(num1),len(num2)
#         carry=0
#         if m<=n:
#             while m<n:
#                 l1.insert(0,'0')
#                 m+=1
#         else:
#             while n<m:
#                 l2.insert(0,'0')
#                 n+=1
#         for n1,n2 in zip(l1[::-1],l2[::-1]):
#             num1,num2=int(n1),int(n2)
#             tmpSum=num1+num2+carry
#             l3.append(str((tmpSum)%10))
#             carry=tmpSum//10
#         if carry==1:
#             l3.append('1')
#         return "".join(l3[::-1])


# Solution2:
# class Solution:
#     def addStrings(self, num1: str, num2: str) -> str:
#         sum=""
#         i,j,carry=len(num1)-1,len(num2)-1,0
#         while i>=0 or j>=0:
#             n1=int(num1[i]) if i>=0 else 0
#             n2=int(num2[j]) if j>=0 else 0
#             tmpSum=n1+n2+carry
#             sum=str(tmpSum%10)+sum
#             carry=tmpSum//10
#             i,j=i-1,j-1
#         return '1'+sum if carry else sum  