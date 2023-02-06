import java.util.ArrayList;
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
        dfs(candidates,res,target,new ArrayList<>(),0);
        return res;
    }
    public void dfs(int[] candidates,List<List<Integer>> res,int target,List<Integer> list,int index){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(target-candidates[i]<0){
                break;
            }
            list.add(candidates[i]);
            dfs(candidates, res, target-candidates[i], list, i);
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end

