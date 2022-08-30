import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid,int i,int j){
       if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]!='1'){
        return;
       }
       grid[i][j]='0';
       dfs(grid, i+1, j);
       dfs(grid, i-1, j);
       dfs(grid, i, j+1);
       dfs(grid, i, j-1);
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public int numIslands(char[][] grid) {
//         int count=0;
//         int m=grid.length,n=grid[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 if(grid[i][j]=='1'){
//                     count++;
//                     inject(grid,i,j);
//                 }
//             }
//         }
//         return count;
//     }
//     void inject(char[][] grid,int i,int j){
//         int[] dx={0,0,1,-1};
//         int[] dy={1,-1,0,0};
//         int m=grid.length,n=grid[0].length;
//         Queue<int[]> queue=new LinkedList<>();
//         queue.add(new int[]{i,j});
//         grid[i][j]='0';
//         while(!queue.isEmpty()){
//             int[] point=queue.poll();
//             int x=point[0],y=point[1];
//             for(int k=0;k<4;k++){
//                 int newX=x+dx[k];
//                 int newY=y+dy[k];
//                 if(newX<0||newX>=m||newY<0||newY>=n||grid[newX][newY]!='1'){
//                     continue;
//                 }
//                 grid[newX][newY]='0';
//                 queue.add(new int[]{newX,newY});
//             }
//         }
//     }
// }