import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==1){
            return cost[0];
        }
        if(cost.length==2){
            return Integer.min(cost[0],cost[1]);
        }
        int[] dp=new int[cost.length];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<cost.length;i++){
            dp[i]=Integer.min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[cost.length-1];
    }
}
// @lc code=end

