
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
        if(m==1&&n==1&&word.charAt(0)==board[0][0]){
            return true;
        }
        for(int i=0;i<m;i++){
            Arrays.fill(used[i], false);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,word,i,j,"",used)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(char[][] board, String word,int i,int j,String tmp,boolean[][] used){
        if(tmp.length()>word.length()){
            return false;
        }
        if(tmp.equals(word)){
            return true;
        }
        boolean f1=false,f2=false,f3=false,f4=false;
        if(i>1&&!used[i-1][j]){
            used[i][j]=true;
            f1=dfs(board, word, i-1, j, tmp+board[i][j],used);
            used[i][j]=false;
        }
        if(j>1&&!used[i][j-1]){
            used[i][j]=true;
            f2=dfs(board, word, i, j-1, tmp+board[i][j],used);
            used[i][j]=false;
        }
        if(i<board.length-1&&!used[i+1][j]){
            used[i][j]=true;
            f3=dfs(board, word, i+1, j, tmp+board[i][j],used);
            used[i][j]=false;
        }
        if(j<board[0].length-1&&!used[i][j+1]){
            used[i][j]=true;
            f4=dfs(board, word, i, j+1, tmp+board[i][j],used);
            used[i][j]=false;
        }
        return f1||f2||f3||f4;
    }
}
// @lc code=end

