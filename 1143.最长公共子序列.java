import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1143 lang=java
 *
 * [1143] 最长公共子序列
 */

// @lc code=start
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length(),n=text2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Integer.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         Map<String,Integer> map=new HashMap<>();
//         return dp(text1.length()-1,text2.length()-1,text1,text2,map);
//     }
//     int dp(int i,int j,String text1,String text2,Map<String,Integer> map){
//         if(i==-1||j==-1){
//             return 0;
//         }
//         String key=""+i+","+j;
//         if(map.containsKey(key)){
//             return map.get(key);
//         }
//         int res=0;
//         if(text1.charAt(i)==text2.charAt(j)){
//             res=1+dp(i-1, j-1, text1, text2,map);
//         }else{
//             res=Integer.max(dp(i-1, j, text1, text2,map), dp(i, j-1, text1, text2,map));
//         }
//         map.put(key, res);
//         return res;
//     }
// }

// Solution2:
// class Solution {
//     public int longestCommonSubsequence(String text1, String text2) {
//         int m=text1.length(),n=text2.length();
//         int[][] dp=new int[m+1][n+1];
//         for(int i=1;i<=m;i++){
//             for(int j=1;j<=n;j++){
//                 if(text1.charAt(i-1)==text2.charAt(j-1)){
//                     dp[i][j]=1+dp[i-1][j-1];
//                 }else{
//                     dp[i][j]=Integer.max(dp[i-1][j], dp[i][j-1]);
//                 }
//             }
//         }
//         return dp[m][n];
//     }
// }