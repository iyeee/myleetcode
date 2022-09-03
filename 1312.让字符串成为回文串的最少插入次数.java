import java.util.Arrays;


/*
 * @lc app=leetcode.cn id=1312 lang=java
 *
 * [1312] 让字符串成为回文串的最少插入次数
 */

// @lc code=start
class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] memo = new int[n][n];
        for (int[] ints : memo) {
            Arrays.fill(ints, 0);
        }
        return dfs(s, 0, n - 1, memo);
    }

    int dfs(String s, int i, int j, int[][] memo) {
        if (i >= j) {
            return 0;
        }
        int tmp = 0;
        if (memo[i][j] != 0) {
            return memo[i][j];
        } else {
            if (s.charAt(i) == s.charAt(j)) {
                tmp = dfs(s, i + 1, j - 1, memo);
            } else {
                tmp = 1 + Integer.min(dfs(s, i + 1, j, memo), dfs(s, i, j - 1, memo));
            }
        }
        memo[i][j] = tmp;
        return tmp;
    }
}
// @lc code=end

// Solution1:
// class Solution {
// public int minInsertions(String s) {
// int n=s.length();
// int[][] dp=new int[n][n];
// for(int[] ints:dp){
// Arrays.fill(ints, 0);
// }
// for(int i=n-2;i>=0;i--){
// for(int j=i+1;j<n;j++){
// if(s.charAt(i)==s.charAt(j)){
// dp[i][j]=dp[i+1][j-1];
// }else{
// dp[i][j]=1+Integer.min(dp[i+1][j], dp[i][j-1]);
// }
// }
// }
// return dp[0][n-1];
// }
// }