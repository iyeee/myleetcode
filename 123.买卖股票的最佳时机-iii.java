/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[0], sell2 = 0;
        for (int i = 1; i < n; ++i) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}
// @lc code=end

// Solution1: 超时
// class Solution {
// public int maxProfit(int[] prices) {
// return dp(prices,0,0,0);
// }
// int dp(int[] prices,int i,int hasStock,int counts){
// if(i>=prices.length||(hasStock==0&&counts>=2)){
// return 0;
// }
// if(hasStock>0){
// return Integer.max(dp(prices, i+1,0, counts)+prices[i], dp(prices, i+1, 1,
// counts));
// }
// return Integer.max(dp(prices, i+1, 1, counts+1)-prices[i], dp(prices, i+1,0,
// counts));
// }
// }

// Solution2: dp
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n=prices.length;
//         int[][][] dp=new int[n+1][2][3];
//         for(int i=n-1;i>=0;i--){
//             for(int j=1;j>=0;j--){
//                 for(int k=2;k>=0;k--){
//                     if(k==2&&j==0){
//                         continue;
//                     }
//                     if(j>0){
//                         dp[i][j][k]=Integer.max(dp[i+1][0][k]+prices[i], dp[i+1][1][k]);
//                     }else{
//                         dp[i][j][k]=Integer.max(dp[i+1][1][k+1]-prices[i], dp[i+1][0][k]);
//                     }
//                 }
//             }
//         }
//         return dp[0][0][0];
//     }
// }

// Solution3:
// class Solution {
//     public int maxProfit(int[] prices) {
//         if (prices == null || prices.length <= 1)
//             return 0;
//         int[][][] dp = new int[prices.length][2][3];
//         int MIN_VALUE = Integer.MIN_VALUE / 2;// 因为最小值再减去1就是最大值Integer.MIN_VALUE-1=Integer.MAX_VALUE
//         // 初始化
//         dp[0][0][0] = 0;// 第一天休息
//         dp[0][0][1] = dp[0][1][1] = MIN_VALUE;// 不可能
//         dp[0][0][2] = dp[0][1][2] = MIN_VALUE;// 不可能
//         dp[0][1][0] = -prices[0];// 买股票
//         for (int i = 1; i < prices.length; i++) {
//             dp[i][0][0] = 0;
//             dp[i][0][1] = Math.max(dp[i - 1][1][0] + prices[i], dp[i - 1][0][1]);
//             dp[i][0][2] = Math.max(dp[i - 1][1][1] + prices[i], dp[i - 1][0][2]);
//             dp[i][1][0] = Math.max(dp[i - 1][0][0] - prices[i], dp[i - 1][1][0]);
//             dp[i][1][1] = Math.max(dp[i - 1][0][1] - prices[i], dp[i - 1][1][1]);
//             dp[i][1][2] = MIN_VALUE;
//         }
//         return Math.max(0, Math.max(dp[prices.length - 1][0][1], dp[prices.length - 1][0][2]));
//     }
// }

// Solution4 官解
// class Solution {
//     public int maxProfit(int[] prices) {
//         int n = prices.length;
//         int buy1 = -prices[0], sell1 = 0;
//         int buy2 = -prices[0], sell2 = 0;
//         for (int i = 1; i < n; ++i) {
//             buy1 = Math.max(buy1, -prices[i]);
//             sell1 = Math.max(sell1, buy1 + prices[i]);
//             buy2 = Math.max(buy2, sell1 - prices[i]);
//             sell2 = Math.max(sell2, buy2 + prices[i]);
//         }
//         return sell2;
//     }
// }