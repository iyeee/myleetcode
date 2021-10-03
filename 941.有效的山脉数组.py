#
# @lc app=leetcode.cn id=941 lang=python3
#
# [941] 有效的山脉数组
#

# @lc code=start
class Solution:
    def validMountainArray(self, arr) -> bool:
        N=len(arr)
        i=0
        while i<N-1 and arr[i+1]>arr[i]:
            i+=1
        if i==0 or i==N-1:
            return False
        while i<N-1 and arr[i]>arr[i+1]:
            i+=1
        return i==N-1
        
# @lc code=end

# Solution1:
# class Solution:
#     def validMountainArray(self, arr) -> bool:
#         m,index=-1,-1
#         for i,x in enumerate(arr):
#             if x>m:
#                 index=i
#                 m=x
#         if index==0 or index==len(arr)-1:
#             return False
#         for i in range(0,index):
#             if arr[i+1]<=arr[i]:
#                 return False
#         for i in range(index,len(arr)-1):
#             if arr[i]<=arr[i+1]:
#                 return False
#         return True


# Solution2:
# class Solution:
#     def validMountainArray(self, arr) -> bool:
#         N=len(arr)
#         i=0
#         while i<N-1 and arr[i+1]>arr[i]:
#             i+=1
#         if i==0 or i==N-1:
#             return False
#         while i<N-1 and arr[i]>arr[i+1]:
#             i+=1
#         return i==N-1