import java.util.Arrays;
/*
 * @lc app=leetcode.cn id=72 lang=java
 *
 * [72] 编辑距离
 */

// @lc code=start
class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()+1][word2.length()+1];
        for(int i=1;i<=word1.length();i++){
            dp[i][0]=i;
        }
        for(int j=1;j<=word2.length();j++){
            dp[0][j]=j;   
        }
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=1+Integer.min(dp[i-1][j], Integer.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int minDistance(String word1, String word2) {
//        int[][] memo=new int[word1.length()][word2.length()];
//        for(int[] ints:memo){
//             Arrays.fill(ints, -1);
//        }
//        return dfs(word1.length()-1, word2.length()-1, word1, word2,memo);
//     }
//     int dfs(int i,int j,String s1,String s2,int[][] memo){
//         if(i==-1){
//             return j+1;
//         }
//         if(j==-1){
//             return i+1;
//         }
//         if(memo[i][j]!=-1){
//             return memo[i][j];
//         }
//         int tmp=0;
//         if(s1.charAt(i)==s2.charAt(j)){
//             tmp=dfs(i-1, j-1, s1, s2, memo);
//         }else{
//             tmp=1+Integer.min(dfs(i, j-1, s1, s2,memo), Integer.min(dfs(i-1, j, s1, s2,memo), dfs(i-1, j-1, s1, s2,memo)));

//         }
//         memo[i][j]=tmp;
//         return tmp;
//     }
// }

// Solution2：
// class Solution {
//     public int minDistance(String word1, String word2) {
//         int[][] dp=new int[word1.length()+1][word2.length()+1];
//         for(int i=1;i<=word1.length();i++){
//             dp[i][0]=i;
//         }
//         for(int j=1;j<=word2.length();j++){
//             dp[0][j]=j;   
//         }
//         for(int i=1;i<=word1.length();i++){
//             for(int j=1;j<=word2.length();j++){
//                 if(word1.charAt(i-1)==word2.charAt(j-1)){
//                     dp[i][j]=dp[i-1][j-1];
//                 }else{
//                     dp[i][j]=1+Integer.min(dp[i-1][j], Integer.min(dp[i][j-1], dp[i-1][j-1]));
//                 }
//             }
//         }
//         return dp[word1.length()][word2.length()];
//     }
// }      
                    
