import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(res,n,k,1,new ArrayList<Integer>());
        return res;
    }
    void dfs(List<List<Integer>> res,int n,int k,int index,List<Integer> path){
        // System.out.println(path);
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=index;i<=n-(k-path.size())+1;i++){
            path.add(i);
            dfs(res, n, k, i+1, path);
            path.remove(path.size()-1);
        }
    }
}
// @lc code=end


// Solution1:
// 回溯+剪枝
// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>> res=new ArrayList<>();
//         dfs(res,n,k,1,new ArrayList<Integer>());
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int n,int k,int index,List<Integer> path){
//         // System.out.println(path);
//         if(path.size()==k){
//             res.add(new ArrayList<>(path));
//             return;
//         }
//         //剪枝
//         for(int i=index;i<=n-(k-path.size())+1;i++){
//             path.add(i);
//             dfs(res, n, k, i+1, path);
//             path.remove(path.size()-1);
//         }
//     }
// }