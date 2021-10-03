#
# @lc app=leetcode.cn id=762 lang=python3
#
# [762] 二进制表示中质数个计算置位
#

# @lc code=start
class Solution:
    def countPrimeSetBits(self, left: int, right: int) -> int:
        primes=[2,3,5,7,11,13,17,19]
        return sum(bin(x).count('1') in primes for x in range(left,right+1))
# @lc code=end

# Solution1:
# class Solution:
#     def countPrimeSetBits(self, left: int, right: int) -> int:
#         def isPrime(num):
#             if num==1:
#                 return False
#             for n in range(2,num):
#                 if num%n==0:
#                     return False
#             return True
#         res=0
#         for num in range(left,right+1):
#             tmpStr=bin(num)
#             print(tmpStr)
#             if isPrime(tmpStr.count('1')):
#                 res+=1
#         return res



# Soluton2:
# class Solution:
# pow(2,19)=524288
#     def countPrimeSetBits(self, left: int, right: int) -> int:
#         primes=[2,3,5,7,11,13,17,19]
#         res=0
#         for num in range(left,right+1):
#             if bin(num).count('1') in primes:
#                 res+=1
#         return res

# class Solution:
#     def countPrimeSetBits(self, left: int, right: int) -> int:
#         primes=[2,3,5,7,11,13,17,19]
#         return sum(bin(x).count('1') in primes for x in range(left,right+1))