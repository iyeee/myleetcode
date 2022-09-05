import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=518 lang=java
 *
 * [518] 零钱兑换 II
 */

// @lc code=start
class Solution {
    public int change(int amount, int[] coins) {
        int m=coins.length;
        int[] dp=new int[amount+1];
        for(int i=0;i<=m;i++){
            dp[0]=1;
        }
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]+=dp[i-coin];
            }
            System.out.println(Arrays.toString(dp));
        }
        return dp[amount];
    }
}
// @lc code=end


// Solution1：
// 完全背包问题 压缩
// class Solution {
//     public int change(int amount, int[] coins) {
//         int m=coins.length;
//         int n=amount;
//         int[][] dp=new int[m+1][n+1];
//         for(int i=0;i<=m;i++){
//             dp[i][0]=1;
//         }
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=n;j++){
//                 if(j-coins[i-1]>=0){
//                     dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[m][n];
//     }
// }


//  Solution2: dp+状态压缩
// class Solution {
//     public int change(int amount, int[] coins) {
//         int m=coins.length;
//         int[] dp=new int[amount+1];
//         for(int i=0;i<=m;i++){
//             dp[0]=1;
//         }
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=amount;j++){
//                 if(j-coins[i-1]>=0){
//                     dp[j]=dp[j]+dp[j-coins[i-1]];
//                 }
//             }
//         }
//         return dp[amount];
//     }
// }

// class Solution {
//     public int change(int amount, int[] coins) {
//         int m=coins.length;
//         int[] dp=new int[amount+1];
//         for(int i=0;i<=m;i++){
//             dp[0]=1;
//         }
//         for(int i=1;i<=m;i++){
//             for(int j=coins[i-1];j<=amount;j++){
//                 dp[j]=dp[j]+dp[j-coins[i-1]];
//             }
//         }
//         return dp[amount];
//     }
// }


// Solution3:
// ???????????
// class Solution {
//     public int change(int amount, int[] coins) {
//         int m=coins.length;
//         int[] dp=new int[amount+1];
//         for(int i=0;i<=m;i++){
//             dp[0]=1;
//         }
//         for(int coin:coins){
//             for(int i=coin;i<=amount;i++){
//                 dp[i]+=dp[i-coin];
//             }
//         }
//         return dp[amount];
//     }
// }