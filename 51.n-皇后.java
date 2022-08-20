import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;;
/*
 * @lc app=leetcode.cn id=51 lang=java
 *
 * [51] N 皇后
 */

// @lc code=start
class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(board,0);
        return res;
    }
    void backtrack(char[][] board,int row){
        int n=board.length;
        if(row==n){
            res.add(charToList(board));
            return;
        }
        
        for(int col=0;col<n;col++){
            if(!isVaild(board, row, col)){
                continue;
            }
            board[row][col]='Q';
            backtrack(board, row+1);
            board[row][col]='.';
        }
        
    }
    boolean isVaild(char[][] board,int row,int column){
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
    List<String> charToList(char[][] board){
        List<String> list=new ArrayList<>();
        for(char[] chs:board){
            list.add(String.copyValueOf(chs));
        }
        return list;
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     List<List<String>> res=new ArrayList<>();
//     public List<List<String>> solveNQueens(int n) {
//         char[][] board=new char[n][n];
//         for(int i=0;i<n;i++){
//             Arrays.fill(board[i],'.');
//         }
//         backtrack(board,0);
//         return res;
//     }
//     void backtrack(char[][] board,int row){
//         int n=board.length;
//         if(row==n){
//             res.add(charToList(board));
//             return;
//         }
        
//         for(int col=0;col<n;col++){
//             if(!isVaild(board, row, col)){
//                 continue;
//             }
//             board[row][col]='Q';
//             backtrack(board, row+1);
//             board[row][col]='.';
//         }
        
//     }
//     boolean isVaild(char[][] board,int row,int column){
//         int n=board.length;
//         for(int i=0;i<row;i++){
//             if(board[i][column]=='Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1,j=column-1;i>=0&&j>=0;i--,j--){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         for(int i=row-1,j=column+1;i>=0&&j<n;i--,j++){
//             if(board[i][j]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     List<String> charToList(char[][] board){
//         List<String> list=new ArrayList<>();
//         for(char[] chs:board){
//             list.add(String.copyValueOf(chs));
//         }
//         return list;
//     }
// }