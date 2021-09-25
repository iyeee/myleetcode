#
# @lc app=leetcode.cn id=35 lang=python3
#
# [35] 搜索插入位置
#

# @lc code=start
class Solution:
    def searchInsert(self, nums, target: int) -> int:
        left,right,mid=0,len(nums)-1,0
        while left<=right:
            mid=(right-left)//2+left
            if nums[mid]==target:
                return mid
            elif nums[mid]>target:
                right=mid-1
            else:
                left=mid+1
        return left  
# @lc code=end

print(Solution().searchInsert([1,3,5,6,7,9],8))


# Solution1:
# class Solution:
#     def searchInsert(self, nums, target: int) -> int:
#         left,right,mid=,len(nums)-1,0
#         while left<=right:
#             mid=(left+right)//2
#             if nums[mid]==target:
#                 return mid
#             elif nums[mid]>target:
#                 right=mid-1
#             else:
#                 left=mid+1
#         if nums[mid]<target:
#             return mid+1 
#         else:
#             return mid    

# 改进：
# class Solution:
#     def searchInsert(self, nums, target: int) -> int:
#         left,right,mid=0,len(nums)-1,0
#         while left<=right:
#             mid=(right-left)//2+left
#             if nums[mid]==target:
#                 return mid
#             elif nums[mid]>target:
#                 right=mid-1
#             else:
#                 left=mid+1
#         return left