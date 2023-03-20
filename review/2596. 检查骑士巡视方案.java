class Solution {
    public boolean checkValidGrid(int[][] grid) {
       return dfs(grid, 0, 0, 0);
    }
    boolean  dfs(int[][] grid,int index,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid.length||index!=grid[i][j]){
            return false;
        }
        if(grid[i][j]==index&&index==grid.length*grid.length-1){
            return true;
        }
        boolean flag=false;
        int[][] direction = new int[][]{{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        for(int[] arr:direction){
            flag|=dfs(grid, index+1, i+arr[0], j+arr[1]);
        }
        return flag;

    }
}


// Solution1:
// class Solution {
//     public boolean checkValidGrid(int[][] grid) {
//        return dfs(grid, 0, 0, 0);
//     }
//     boolean  dfs(int[][] grid,int index,int i,int j){
//         System.out.println(i+" "+j);
//         if(i<0||i>=grid.length||j<0||j>=grid.length||index!=grid[i][j]){
//             return false;
//         }
//         if(grid[i][j]==index&&index==grid.length*grid.length-1){
//             return true;
//         }
//         boolean flag1=dfs(grid, index+1, i-1, j-2);
//         boolean flag2=dfs(grid, index+1, i-2, j-1);
//         boolean flag3=dfs(grid, index+1, i-1, j+2);
//         boolean flag4=dfs(grid, index+1, i-2, j+1);
//         boolean flag5=dfs(grid, index+1, i+1, j-2);
//         boolean flag6=dfs(grid, index+1, i+2, j+1);
//         boolean flag7=dfs(grid, index+1, i+1, j+2);
//         boolean flag8=dfs(grid, index+1, i+2, j-1);
//         return flag1||flag2||flag3||flag4||flag5||flag6||flag7||flag8;

//     }
// }
