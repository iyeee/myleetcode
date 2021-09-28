#
# @lc app=leetcode.cn id=448 lang=python3
#
# [448] 找到所有数组中消失的数字
#

# @lc code=start
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n=len(nums)
        for num in nums:
            index=(num-1)%n
            if nums[index]>n:
                continue
            else:
                nums[index]+=n
        ret=[i+1 for i,m in enumerate(nums) if m<=n]
        return ret

# @lc code=end


# Solution1:
# class Solution:
#     def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
#         l=[0]*len(nums)
#         res=[]
#         for n in nums:
#             l[n-1]+=1
#         for i,m in enumerate(l):
#             if m==0:
#                 res.append(i+1)
#         return res

# Solution2:
# 在原输入数组上修改，使空间复杂度为o(1)
# class Solution:
#     def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
#         n=len(nums)
#         for num in nums:
#             nums[(num-1)%10]+=n
#         ret=[i+1 for i,m in enumerate(nums) if m<=n]
#         return ret

# class Solution:
#     def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
#         n=len(nums)
#         for num in nums:
#             index=(num-1)%n
#             if nums[index]>n:
#                 continue
#             else:
#                 nums[index]+=n
#         ret=[i+1 for i,m in enumerate(nums) if m<=n]
#         return ret