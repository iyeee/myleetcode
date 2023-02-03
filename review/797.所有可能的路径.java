import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=797 lang=java
 *
 * [797] 所有可能的路径
 */

// @lc code=start
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new LinkedList<>();
        List<Integer> list=new ArrayList<>(){{
            add(0);
        }};
        dfs(res,graph,list,0);
        return  res;
    }
    public void dfs(List<List<Integer>> res,int[][] graph,List<Integer> list,int index){
        if(index==graph.length-1){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i:graph[index]){
            list.add(i);
            dfs(res, graph, list, i);
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//         List<List<Integer>> res=new LinkedList<>();
//         List<Integer> list=new ArrayList<>(){{
//             add(0);
//         }};
//         dfs(res,graph,list,0);
//         return  res;
//     }
//     public void dfs(List<List<Integer>> res,int[][] graph,List<Integer> list,int index){
//         if(index==graph.length-1){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         for(int i:graph[index]){
//             list.add(i);
//             dfs(res, graph, list, i);
//             list.remove(list.size()-1);
//         }
//     }
// }