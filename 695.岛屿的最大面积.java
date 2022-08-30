/*
 * @lc app=leetcode.cn id=695 lang=java
 *
 * [695] 岛屿的最大面积
 */

// @lc code=start
class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    max=Integer.max(max, dfs(grid,i,j));
                }
            }
        }
        return max;
    }
    public int  dfs(int[][] grid,int i,int j){
        if(i<0||j<0 || i>=grid.length || j>= grid[0].length|| grid[i][j]==0) return 0;
        grid[i][j]=0;
        int sum=1;
        sum+=dfs(grid, i-1, j);
        sum+=dfs(grid, i+1, j);
        sum+=dfs(grid, i, j-1);
        sum+=dfs(grid, i, j+1);
        return sum;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int maxAreaOfIsland(int[][] grid) {
//         int m=grid.length,n=grid[0].length;
//         int max=0;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(grid[i][j]==1){
//                     max=Integer.max(max, dfs(grid,i,j));
//                 }
//             }
//         }
//         return max;
//     }
//     public int  dfs(int[][] grid,int i,int j){
//         if(i<0||j<0 || i>=grid.length || j>= grid[0].length|| grid[i][j]==0) return 0;
//         grid[i][j]=0;
//         return 1+dfs(grid, i-1, j)+dfs(grid, i+1, j)+dfs(grid, i, j-1)+dfs(grid, i, j+1);
//     }
// }