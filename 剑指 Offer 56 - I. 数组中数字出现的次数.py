# https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
# Solution1:
# import collections
# class Solution(object):
#     def singleNumbers(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: List[int]
#         """
#         count = collections.Counter(nums)
#         res = []
#         for num, c in count.items():
#             if c == 1:
#                 res.append(num)
#         return res

# Solution2:
# import collections
# class Solution:
#     def singleNumbers(self, nums):
#         mp=collections.Counter(nums)
#         mp=dict(sorted(mp.items(),key=lambda x:x[1]))
#         l=list(mp.keys())
#         return [l[0],l[1]]

# ?Solution3: