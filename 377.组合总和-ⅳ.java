/*
 * @lc app=leetcode.cn id=377 lang=java
 *
 * [377] 组合总和 Ⅳ
 */

// @lc code=start
class Solution{
    public int combinationSum4(int[] nums, int target){
        int[] dp=new int[target+1];
        dp[0]=1;
        for(int i=1;i<target+1;i++){

            for(int n:nums){
                if(i>=n){
                dp[i]+=dp[i-n];
                }
            }
        }
        return dp[target];
    }
}
// @lc code=end

