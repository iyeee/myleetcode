import java.util.*;;
/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start
class Solution {

    List<List<Integer>> list=new ArrayList<>(); 
    int[] visited;
    boolean flag=true;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        visited=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<Integer>());
        }
        for(int info[]:prerequisites){
            list.get(info[1]).add(info[0]);
        }
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                dfs(i);
            }
        }
        return flag;
    }
    public void dfs(int v){
        visited[v]=1;
        for(int w:list.get(v)){
            if(visited[w]==0){
                dfs(w);
                if(!flag){
                    return;
                }
            }else if(visited[w]==1){
                flag=false;
                return;
            }
        }
        visited[v]=2;
    }
}
// @lc code=end

