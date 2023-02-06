import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=39 lang=java
 *
 * [39] 组合总和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new LinkedList<>();
        Arrays.sort(candidates);
        dfs(res,candidates,target,new ArrayList<>(),0);
        return res;
    }
    void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int index){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(target-candidates[i]<0){
                break;
            }
            list.add(candidates[i]);
            dfs(res, candidates, target-candidates[i], list, i);
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         List<List<Integer>> res=new LinkedList<>();
//         dfs(res,candidates,target,new ArrayList<>(),0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int index){
//         if(target==0){
//             res.add(new ArrayList<>(list));
//             return;
//         }else if(target<0){
//             return;
//         }
//         for(int i=index;i<candidates.length;i++){
//             list.add(candidates[i]);
//             dfs(res, candidates, target-candidates[i], list, i);
//             list.remove(list.size()-1);
//         }
//     }
// }

// 剪枝
// Solution2:
