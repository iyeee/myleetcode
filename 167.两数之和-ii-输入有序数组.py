#
# @lc app=leetcode.cn id=167 lang=python3
#
# [167] 两数之和 II - 输入有序数组
#

# @lc code=start
class Solution:
    def twoSum(self, numbers, target: int):
        low,high=0,len(numbers)-1
        while low<high:
            if numbers[low]+numbers[high]==target:
                return [low+1,high+1]
            elif numbers[low]+numbers[high]>target:
                high-=1
            else:
                low+=1
# @lc code=end

# Solution1:
# 暴力法
# class Solution:
#     def twoSum(self, numbers: List[int], target: int) -> List[int]:
#         for i in range(len(numbers)-1):
#             for j in range(i+1,len(numbers)):
#                 if numbers[i]+numbers[j]==target:
#                     return [i+1,j+1]
#                 elif numbers[i]+numbers[j]>target:
#                     break

# Solution2：
# 固定一个数的二分法
# 有序用二分 log(n)
# class Solution:
#     def twoSum(self, numbers, target: int):
#         for i in range(len(numbers)-1):
#             findNum=target-numbers[i]
#             left,right,mid=i+1,len(numbers)-1,0
#             while left<=right:
#                 mid=(right-left)//2+left
#                 if findNum==numbers[mid]:
#                     return [i+1,mid+1]
#                 elif findNum>numbers[mid]:
#                     left=mid+1
#                 else:
#                     right=mid-1
#         return [-1,-1]

# Solution3:
# 双指针法
# class Solution:
#     def twoSum(self, numbers, target: int):
#         low,high=0,len(numbers)-1
#         while low<high:
#             if numbers[low]+numbers[high]==target:
#                 return [low+1,high+1]
#             elif numbers[low]+numbers[high]>target:
#                 high-=1
#             else:
#                 low+=1