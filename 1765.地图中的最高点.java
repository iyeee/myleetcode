import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1765 lang=java
 *
 * [1765] 地图中的最高点
 */

// @lc code=start
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int[] dx={0,0,1,-1};
        int[] dy={1,-1,0,0};
        int m=isWater.length,n=isWater[0].length;
        int[][] res=new int[m][n];
        Queue<int[]> queue=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    res[i][j]=0;
                    queue.offer(new int[]{i,j});
                }else{
                    res[i][j]=-1;
                }
            }
        }
        int[] point=null;
        while(!queue.isEmpty()){
            point=queue.poll();
            int x=point[0],y=point[1];
            for(int i=0;i<4;i++){
                int newX=x+dx[i];
                int newY=y+dy[i];
                if(newX<0||newX>=m||newY<0||newY>=n||res[newX][newY]!=-1){
                    continue;
                }
                queue.offer(new int[]{newX,newY});
                res[newX][newY]=res[x][y]+1;
            }
        }
        return res;
    }
}
// @lc code=end

