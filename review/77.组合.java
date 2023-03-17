import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=77 lang=java
 *
 * [77] 组合
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>  res=new ArrayList<>();
        dfs(res,n,k,new ArrayList<>(),1);
        return res;
    }
    void dfs(List<List<Integer>>  res,int n,int k,List<Integer> list,int index){
        if(list.size()+(n-index+1)<k){
            return;
        }
        if(list.size()==k){
            res.add(new ArrayList<>(list));
        }
        for(int i=index;i<=n;i++){
            list.add(i);
            dfs(res, n, k, list, i+1);
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>>  res=new ArrayList<>();
//         dfs(res,n,k,new ArrayList<>(),1);
//         return res;
//     }
//     void dfs(List<List<Integer>>  res,int n,int k,List<Integer> list,int index){
//         if(list.size()==k){
//             res.add(new ArrayList<>(list));
//         }
//         for(int i=index;i<=n;i++){
//             list.add(i);
//             dfs(res, n, k, list, i+1);
//             list.remove(list.size()-1);
//         }
//     }
// }

// 加剪枝
// class Solution {
//     public List<List<Integer>> combine(int n, int k) {
//         List<List<Integer>>  res=new ArrayList<>();
//         dfs(res,n,k,new ArrayList<>(),1);
//         return res;
//     }
//     void dfs(List<List<Integer>>  res,int n,int k,List<Integer> list,int index){
//         if(list.size()+(n-index+1)<k){
//             return;
//         }
//         if(list.size()==k){
//             res.add(new ArrayList<>(list));
//         }
//         for(int i=index;i<=n;i++){
//             list.add(i);
//             dfs(res, n, k, list, i+1);
//             list.remove(list.size()-1);
//         }
//     }
// }