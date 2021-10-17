#
# @lc app=leetcode.cn id=1551 lang=python3
#
# [1551] 使数组中所有元素相等的最小操作数
#

# @lc code=start
class Solution:
    def minOperations(self, n: int) -> int:
        res=sum(i for i in range(1,n,2) )
        res=n*(n//2)-res
        return res


# @lc code=end

# Solution1:
# class Solution:
#     def minOperations(self, n: int) -> int:
#         res=0
#         for i in range(1,n,2):
#             res+=i
#         res=n*(n//2)-res
#         return res

# class Solution:
#     def minOperations(self, n: int) -> int:
#         res=sum(i for i in range(1,n,2) )
#         res=n*(n//2)-res
#         return res


# class Solution:
#     def minOperations(self, n: int) -> int:
#         return sum(x - n for i in range(n) if (x := 2 * i + 1) > n)

# 作者：LeetCode-Solution
# 链接：https://leetcode-cn.com/problems/minimum-operations-to-make-array-equal/solution/shi-shu-zu-zhong-suo-you-yuan-su-xiang-deng-de-z-4/
# 来源：力扣（LeetCode）
# 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


# 数学方法推导 
# Solution2:
# class Solution:
#     def minOperations(self, n: int) -> int:
#         return n*n//4
            