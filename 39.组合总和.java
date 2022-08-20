import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,candidates,target,new ArrayList<>(),0,0);
        return res;
    }
    void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int sum,int index){
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            
            sum+=candidates[i];
            //剪枝
            if(sum>target){
                break;
            }
            list.add(candidates[i]);
            dfs(res, candidates, target, list,sum,i);
            sum-=candidates[i];
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> res=new ArrayList<>();
//         dfs(res,candidates,target,new ArrayList<>(),0,0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int sum,int index){
//         if(sum==target){
//             res.add(new ArrayList<>(list));
//             return;
//         }else if(sum>target){
//             return;
//         }
//         for(int i=index;i<candidates.length;i++){
//             sum+=candidates[i];
//             list.add(candidates[i]);
//             dfs(res, candidates, target, list,sum,i);
//             sum-=candidates[i];
//             list.remove(list.size()-1);
//         }
//     }
// }

// Solution2:
// 1加剪枝
// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> res=new ArrayList<>();
//         Arrays.sort(candidates);
//         dfs(res,candidates,target,new ArrayList<>(),0,0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int sum,int index){
//         if(sum==target){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         for(int i=index;i<candidates.length;i++){
            
//             sum+=candidates[i];
//             //剪枝
//             if(sum>target){
//                 break;
//             }
//             list.add(candidates[i]);
//             dfs(res, candidates, target, list,sum,i);
//             sum-=candidates[i];
//             list.remove(list.size()-1);
//         }
//     }
// }

// Solution3：
// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> res=new ArrayList<>();
//         //为剪枝排序
//         Arrays.sort(candidates);
//         dfs(res,candidates,target,new ArrayList<>(),0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int index){
//         if(target==0){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         for(int i=index;i<candidates.length;i++){
//             //剪枝
//             if(target-candidates[i]<0){
//                 break;
//             }
//             list.add(candidates[i]);
//             dfs(res, candidates, target-candidates[i], list,i);
//             list.remove(list.size()-1);
//         }
//     }
// }