Solution1
# class Solution:
#     def maxValue(self, grid) -> int:
#         m,n=len(grid),len(grid[0])
#         for i in range(1,n):
#             grid[0][i]=grid[0][i-1]+grid[0][i]
#         for i in range(1,m):
#             grid[i][0]=grid[i-1][0]+grid[i][0]
#         for i in range(1,m):
#             for j in range(1,n):
#                 grid[i][j]=grid[i][j]+max(grid[i-1][j],grid[i][j-1])
#         return grid[-1][-1]