#
# @lc app=leetcode.cn id=1 lang=python3
#
# [1] 两数之和
#

# @lc code=start
class Solution:
    def twoSum(self, nums, target):
        dic={}
        for i in range(len(nums)):
            if nums[i] in dic.keys():
                return [dic[nums[i]],i]
            dic.update({target-nums[i]:i})
        return []
# @lc code=end




# Solution1:
class Solution:
    def twoSum(self, nums, target):
        dic={}
        for i in range(len(nums)):
            if nums[i] in dic.keys():
                return [dic[nums[i]],i]
            dic.update({target-nums[i]:i})
        return []