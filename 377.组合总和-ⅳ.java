import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=377 lang=java
 *
 * [377] 组合总和 Ⅳ
 */

// @lc code=start
class Solution{
    Integer count;
    public int combinationSum4(int[] nums, int target){
        count=0;
        Map<Integer,Integer> map=new HashMap<>();
        dfs(map,nums,target,0,new ArrayList<>());
        return count;
    }   
    void dfs(Map<Integer,Integer> map,int[] nums,int target,int sum,List<Integer> path){
        if(sum>target){
            return;
        }else if(sum==target){
            count++;
            return;
        }
        for(int n:nums){
            sum+=n;
            path.add(n);
            dfs(nums, target, sum, path);
            sum-=n;
            path.remove(path.size()-1);
        }
    }
}
// @lc code=end

