import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        dfs(nums, res,new LinkedList<Integer>());   
        return res;
    }
    void dfs(int[] nums,List<List<Integer>> res,List<Integer> list){
        if(list.size()==nums.length){
            res.add(new LinkedList<>(list));
            return;
        }
        for(int n:nums){
            if(!list.contains(n)){
                list.add(n);
                dfs(nums, res, list);
                list.remove(list.size()-1);
            }
        }
    }
}
// @lc code=end

