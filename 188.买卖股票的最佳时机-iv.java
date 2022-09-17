import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k,int[] prices) {
        int n = prices.length;  
        int[] buy=new int[k];
        int[] sell=new int[k];
        Arrays.fill(buy,-prices[0]);
        for (int i = 1; i < n; ++i) {
            for(int j=0;j<k;j++){
                if(j==0){
                    buy[j]=Integer.max(buy[j], -prices[i]);
                }else{
                    buy[j]=Integer.max(buy[j], sell[j-1]-prices[i]);
                }
                sell[j]=Integer.max(sell[j],buy[j]+prices[i]);
            }
        }
        return sell[k-1];
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int maxProfit(int k,int[] prices) {
//         int n=prices.length;
//         int[][][] dp=new int[n+1][2][k+1];
//         for(int i=n-1;i>=0;i--){
//             for(int j=1;j>=0;j--){
//                 for(int l=k;l>=0;l--){
//                     if(l==k&&j==0){
//                         continue;
//                     }
//                     if(j>0){
//                         dp[i][j][l]=Integer.max(dp[i+1][0][l]+prices[i], dp[i+1][1][l]);
//                     }else{
//                         dp[i][j][l]=Integer.max(dp[i+1][1][l+1]-prices[i], dp[i+1][0][l]);
//                     }
//                 }
//             }
//         }
//         return dp[0][0][0];
//     }
// }


// Solution2:
// class Solution {
//     public int maxProfit(int k,int[] prices) {
//         int n = prices.length;  
//         int[] buy=new int[k];
//         int[] sell=new int[k];
//         Arrays.fill(buy,-prices[0]);
//         for (int i = 1; i < n; ++i) {
//             for(int j=0;j<k;j++){
//                 if(j==0){
//                     buy[j]=Integer.max(buy[j], -prices[i]);
//                 }else{
//                     buy[j]=Integer.max(buy[j], sell[j-1]-prices[i]);
//                 }
//                 sell[j]=Integer.max(sell[j],buy[j]+prices[i]);
//             }
//         }
//         return sell[k-1];
//     }
// }