import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=52 lang=java
 *
 * [52] N皇后 II
 */

// @lc code=start
class Solution {
        Integer count=0;
    public int totalNQueens(int n) {
     
        char[][] borad=new char[n][n];
        for(char[] chs:borad){
            Arrays.fill(chs, '.');
        }
        dfs(borad,0);
        return count;
    }
    void dfs(char[][] board,int n){
        if(n==board.length){
            count++;
            return;
        }
        for(int i=0;i<board.length;i++){
            if(!check(board, n, i)){
                continue;
            }else{
                board[n][i]='Q';
                dfs(board, n+1);
                board[n][i]='.';
            }
        }
    }
    boolean check(char[][] board,int row,int column){
        int n=board.length;
        for(int i=0;i<row;i++){
            if(board[i][column]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=column-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=column+1;i>=0&&j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

