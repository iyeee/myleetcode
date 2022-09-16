/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][][] dp=new int[n][2][3];
        dp[0][0][0]=0;
        dp[0][1][1]=-prices[0];
        for(int i=1;i<n;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    if(k==2){
                        continue;
                    }
                    
                }
            }
        }
    }
}
// @lc code=end

