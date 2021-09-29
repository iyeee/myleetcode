#
# @lc app=leetcode.cn id=566 lang=python3
#
# [566] 重塑矩阵
#

# @lc code=start
class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        m,n=len(mat),len(mat[0])
        if m*n!=r*c:
            return mat
        res=[[0]*c for _ in range(r)]
        for i in range(m*n):
            res[i//c][i%c]=mat[i//n][i%n]
        return res
# @lc code=end

# Solution1:
# class Solution:
#     def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
#         m,n=len(mat),len(mat[0])
#         res,tmp=[],[]
#         num=0
#         if m*n!=r*c:
#             return mat
#         for i in range(m):
#             for j in range(n):
#                 tmp.append(mat[i][j])
#                 num+=1
#                 if num==c:
#                     res.append(tmp)
#                     num=0
#                     tmp=[]
#         return res

# 官解较慢
# class Solution:
#     def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
#         m,n=len(mat),len(mat[0])
#         if m*n!=r*c:
#             return mat
#         res=[[0]*c for _ in range(r)]
#         for i in range(m*n):
#             res[i//c][i%c]=mat[i//n][i%n]
#         return res