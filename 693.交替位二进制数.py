#
# @lc app=leetcode.cn id=693 lang=python3
#
# [693] 交替位二进制数
#

# @lc code=start
class Solution:
    def hasAlternatingBits(self, n: int) -> bool:
        pre=-1
        while n!=0:
            cur=n%2
            if pre==cur:
                return False
            n//=2
            pre=cur
        return True
# @lc code=end

