
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
        public boolean exist(char[][] board, String word) {
            int m=board.length,n=board[0].length;
            boolean[][] used=new boolean[m][n];
            for(int i=0;i<m;i++){
                Arrays.fill(used[i], false);
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==word.charAt(0)){
                        if(dfs(board, word, i, j, 0, used)){
                        return true;
                        }
                    }
                }  
            }
            return false;
        }
        boolean dfs(char[][] board, String word,int i,int j,int index,boolean[][] used){

            if(index==word.length()){
                return true;
            }
            if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
                return false;
            }
            if(word.charAt(index)!=board[i][j]){
                return false;
            }
            char t=board[i][j];
            board[i][j]='0';
            boolean res=dfs(board, word, i-1, j, index+1,used)
            ||dfs(board, word, i, j-1,index+1 ,used)
            ||dfs(board, word, i+1, j,index+1,used)
            ||dfs(board, word, i, j+1, index+1,used);
            board[i][j]=t;
            return res;
        }
    }
// @lc code=end

// Soulution1:  wrong
// class Solution {
//     public boolean exist(char[][] board, String word) {
//         int m=board.length,n=board[0].length;
//         boolean[][] used=new boolean[m][n];
//         for(int i=0;i<m;i++){
//             Arrays.fill(used[i], false);
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(dfs(board, word, i, j, "", used)){
//                     return true;
//                 }
//             }  
//         }
//         return false;
//     }
//     boolean dfs(char[][] board, String word,int i,int j,String tmp,boolean[][] used){
//         if(tmp.length()>word.length()){
//             return false;
//         }
//         if(tmp.equals(word)){
//             return true;
//         }
//         boolean f1=false,f2=false,f3=false,f4=false;
//         if (i < 0 || j < 0 || i >= board.length || j >= board[i].length) {
//             return false;
//         }
//         used[i][j]=true;
//         f1=dfs(board, word, i-1, j, tmp+board[i][j],used);
//         used[i][j]=false;
//         used[i][j]=true;
//         f2=dfs(board, word, i, j-1, tmp+board[i][j],used);
//         used[i][j]=false;
//         used[i][j]=true;
//         f3=dfs(board, word, i+1, j, tmp+board[i][j],used);
//         used[i][j]=false;
//         used[i][j]=true;
//         f4=dfs(board, word, i, j+1, tmp+board[i][j],used);
//         used[i][j]=false;
//         return f1||f2||f3||f4;
//     }
// }