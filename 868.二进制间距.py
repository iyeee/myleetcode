#
# @lc app=leetcode.cn id=868 lang=python3
#
# [868] 二进制间距
#

# @lc code=start
class Solution:
    def binaryGap(self, n: int) -> int:
        last=None
        ans=0
        num=bin(n)
        for i,n in enumerate(num[2:]):
            if n=='1':
                if last is not None:
                    ans=max(ans,i-last)
                last=i
        return ans
# @lc code=end

# Solution1:
# class Solution:
#     def binaryGap(self, n: int) -> int:
#         num=bin(n)
#         res,tmp=0,0
#         for n in num[2:]:
#             if n=='1':
#                 res=max(res,tmp)
#                 tmp=1
#             else:
#                 tmp+=1
#         return res

# class Solution:
#     def binaryGap(self, n: int) -> int:
#         last=None
#         ans=0
#         for i in range(32):
#             if (n>>i)&1:
#                 if last is not None:
#                     ans=max(ans,i-last)
#                 last=i

#         return ans


# Solution2:
# 记录索引：
# class Solution:
#     def binaryGap(self, n: int) -> int:
#         A=[i for i in range(32) if (n>>i)&1]
#         if len(A)<2:
#             return 0
#         print(A)
#         return max(A[i]-A[i-1] for i in range(1,len(A)))


# Solution3:
# 不转成bin一次遍历
# 记录上一个1的位置
# class Solution:
#     def binaryGap(self, n: int) -> int:
#         last=None
#         ans=0
#         for i in range(32):
#             if (n>>i)&1:
#                 if last is not None:
#                     ans=max(ans,i-last)
#                 last=i

#         return ans