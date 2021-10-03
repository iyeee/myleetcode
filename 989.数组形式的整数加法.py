#
# @lc app=leetcode.cn id=989 lang=python3
#
# [989] 数组形式的整数加法
#

# @lc code=start
class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        res=[]
        carry,i=0,len(num)-1
        while i>=0 or k!=0:
            x=num[i] if i>=0 else 0
            y=k%10
            sum=x+y+carry
            res.append(sum%10)
            carry=sum//10
            i-=1
            k//=10
        if carry==1:
            res.append(1)
        return res[::-1]
# @lc code=end


# Solution1:
# class Solution:
#     def addToArrayForm(self, num: List[int], k: int) -> List[int]:
#         num1=0
#         for n in num:
#             num1=num1*10+n
#         sum=num1+k
#         res=[]
#         if sum==0:
#             return [0]
#         while sum!=0:
#             res.append(sum%10)
#             sum//=10
#         return res[::-1]



# Solution2:
# class Solution:
#     def addToArrayForm(self, num: List[int], k: int) -> List[int]:
#         res=[]
#         carry,i=0,len(num)-1
#         while i>=0 or k!=0:
#             x=num[i] if i>=0 else 0
#             y=k%10
#             sum=x+y+carry
#             res.append(sum%10)
#             carry=sum//10
#             i-=1
#             k//=10
#         if carry==1:
#             res.append(1)
#         return res[::-1]