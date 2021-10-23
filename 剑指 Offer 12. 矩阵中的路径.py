# Solution1:
class Solution:
    def exist(self, board, word):
        m,n=len(board),len(board[0])
        def dfs(s,row,line):
            if row<0 or line<0 or row>=m or line>=n or board[row][line]!=s[0]:
                return False
            if len(s)==1:
                return True
            board[row][line]=""
            res=dfs(s[1:],row-1,line) or dfs(s[1:],row+1,line) or dfs(s[1:],row,line-1) or dfs(s[1:],row,line+1)
            board[row][line]=s[0]
            return res
            

        for i in range(m):
            for j in range(n):
                if board[i][j]==word[0]:
                    if dfs(word,i,j):
                        return True
        return False
                
print(Solution().exist([["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]],
"ABCCED"))

# class Solution:
#     def exist(self, board, word):
#         m,n=len(board),len(board[0])
#         def dfs(s,row,line):
#             if row<0 or line<0 or row>=m or line>=n or board[row][line]=="":
#                 return False
#             if len(s)==1:
#                 if board[row][line]==s[0]:
#                     return True
#                 else:
#                     return False
#             elif board[row][line]!=s[0]:
#                 return False
#             k=board[row][line]
#             board[row][line]=""
#             res=dfs(s[1:],row-1,line) or dfs(s[1:],row+1,line) or dfs(s[1:],row,line-1) or dfs(s[1:],row,line+1)
#             board[row][line]=k
#             return res
            

#         for i in range(m):
#             for j in range(n):
#                 if board[i][j]==word[0]:
#                     if dfs(word,i,j):
#                         return True
#         return False 

#  class Solution:
# 题解
#     def exist(self, board: List[List[str]], word: str) -> bool:
#         def dfs(i, j, k):
            # if not 0 <= i < len(board) or not 0 <= j < len(board[0]) or board[i][j] != word[k]: return False
#             if k == len(word) - 1: return True
#             board[i][j] = ''
#             res = dfs(i + 1, j, k + 1) or dfs(i - 1, j, k + 1) or dfs(i, j + 1, k + 1) or dfs(i, j - 1, k + 1)
#             board[i][j] = word[k]
#             return res

#         for i in range(len(board)):
#             for j in range(len(board[0])):
#                 if dfs(i, j, 0): return True
#         return False
