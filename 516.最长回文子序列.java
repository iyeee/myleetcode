/*
 * @lc app=leetcode.cn id=516 lang=java
 *
 * [516] 最长回文子序列
 */

// @lc code=start
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length();
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
        }
        for(int i=n-2;i>=0;i--){
            int pre=0;
            for(int j=i+1;j<n;j++){
                int tmp=dp[j];
                if(s.charAt(i)==s.charAt(j)){
                    dp[j]=pre+2;
                }else{
                    dp[j]=Integer.max(dp[j],dp[j-1]);
                }
                pre=tmp;
            }
        }
        return dp[n-1];
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int longestPalindromeSubseq(String s) {
//         int n=s.length();
//         int[][] dp=new int[n][n];
//         for(int i=0;i<n;i++){
//             dp[i][i]=1;
//             for(int j=0;j<i;j++){
//                 dp[i][j]=0;
//             }
//         }
//         for(int i=n-2;i>=0;i--){
//             for(int j=i+1;j<n;j++){
//                 if(s.charAt(i)==s.charAt(j)){
//                     dp[i][j]=dp[i+1][j-1]+2;
//                 }else{
//                     dp[i][j]=Integer.max(dp[i+1][j],dp[i][j-1]);
//                 }
//             }
//         }
//         return dp[0][n-1];
//     }
// }

// Solution2：
// 状态压缩
// class Solution {
//     public int longestPalindromeSubseq(String s) {
//         int n=s.length();
//         int[] dp=new int[n];
//         for(int i=0;i<n;i++){
//             dp[i]=1;
//         }
//         for(int i=n-2;i>=0;i--){
//             int pre=0;
//             for(int j=i+1;j<n;j++){
//                 int tmp=dp[j];
//                 if(s.charAt(i)==s.charAt(j)){
//                     dp[j]=pre+2;
//                 }else{
//                     dp[j]=Integer.max(dp[j],dp[j-1]);
//                 }
//                 pre=tmp;
//             }
//         }
//         return dp[n-1];
//     }
// }