/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        for(int i=2;i<=n;i++){
            int curMax=0;
            for(int j=1;j<i;j++){
                curMax=Integer.max(curMax, Integer.max(j*(i-j), j*dp[i-j]));
            }
            dp[i]=curMax;
        }
        return dp[n];
    }
}
// @lc code=end  

// Solution1:
// class Solution {
//     public int integerBreak(int n) {
//         int[] dp=new int[n+1];
//         for(int i=2;i<=n;i++){
//             int curMax=0;
//             for(int j=1;j<i;j++){
//                 curMax=Integer.max(curMax, Integer.max(j*(i-j), j*dp[i-j]));
//             }
//             dp[i]=curMax;
//         }
//         return dp[n];
//     }
// }