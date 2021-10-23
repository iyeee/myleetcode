# Solution1:
# dp
class Solution:
    def fib(self, n: int) -> int:
        if n==0:
            return 0
        if n==1:
            return 1
        pre,cur=0,1
        for i in range(2,n+1):
            tmp=cur
            cur+=pre
            pre=tmp
        if cur>=1000000007:
            return cur%1000000007
        else:
            return cur

# ？Soluition2:
# 矩阵快速幂
