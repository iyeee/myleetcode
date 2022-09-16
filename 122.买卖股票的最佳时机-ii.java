import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp1=0;
        int dp2=-prices[0];
        for(int i=1;i<n;i++){
            dp1=Integer.max(dp2+prices[i],dp1);
            dp2=Integer.max(dp2,dp1-prices[i]);
        }
        return dp1;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int maxProfit(int[] prices) {
//         int sum=0;
//         for(int i=0;i<prices.length-1;i++){
//             if(prices[i+1]>prices[i]){
//                 sum+=(prices[i+1]-prices[i]);
//             }
//         }
//         return sum;
//     }
// }


// Solution2:
// dp
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n=prices.length;
//         int[][] dp=new int[n][2];
//         dp[0][0]=0;
//         dp[0][1]=-prices[0];
//         for(int i=1;i<n;i++){
//             dp[i][0]=Integer.max(dp[i-1][1]+prices[i],dp[i-1][0]);
//             dp[i][1]=Integer.max(dp[i-1][1],dp[i-1][0]-prices[i]);
//         }
//         System.out.println(Arrays.deepToString(dp));
//         return dp[n-1][0];
//     }
// }


// 状态压缩
// class Solution {

//     public int maxProfit(int[] prices) {
//         int n=prices.length;
//         int dp1=0;
//         int dp2=-prices[0];
//         for(int i=1;i<n;i++){
//             dp1=Integer.max(dp2+prices[i],dp1);
//             dp2=Integer.max(dp2,dp1-prices[i]);
//         }
//         return dp1;
//     }
// }