# https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
# Solution1:
import collections
class Solution:
    def singleNumber(self, nums):
        mp=collections.Counter(nums)
        mp=dict(sorted(mp.items(),key=lambda x:x[1]))
        return next(iter(mp))

# ?Soluton2: