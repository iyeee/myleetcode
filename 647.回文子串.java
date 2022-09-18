/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                int l=i;
                int r=l+j;
                while(l>=0&&r<n&&s.charAt(l--)==s.charAt(r++)){
                        count++;
                    }
                }
            }
        return count;
    }
}

// @lc code=end


// Solution1: dp
// class Solution {
//     public int countSubstrings(String s) {
//         int n=s.length();
//         boolean[][] dp=new boolean[n][n];
//         int count=0;
//         for(int i=0;i<n;i++){
//             dp[i][i]=true;
//             count++;
//         }
//         for(int i=n-2;i>=0;i--){
//             for(int j=i+1;j<n;j++){
//                 if(s.charAt(i)==s.charAt(j)){
//                     if(j-i<3){
//                         dp[i][j]=true;
//                     }else{
//                         dp[i][j]=dp[i+1][j-1];
//                     }
//                     if(dp[i][j]){
//                         count++;
//                     }
//             }
//             }
//         }
//         return count;
//     }
// }



// class Solution {
//     public int countSubstrings(String s) {
//         int n=s.length();
//         boolean[][] dp=new boolean[n][n];
//         int count=0;
//         for(int i=0;i<n;i++){
//             dp[i][i]=true;
//             count++;
//         }
//         for(int i=n-2;i>=0;i--){
//             for(int j=i+1;j<n;j++){
//                 if(s.charAt(i)==s.charAt(j)&&(dp[i+1][j-1]||j-i<3)){
//                     count++;
//                     dp[i][j]=true;
//                 }
//             }
//         }
//         return count;
//     }
// }

// 中心拓展法
// Solution2:
// class Solution {
//     public int countSubstrings(String s) {
//         int n=s.length();
//         int count=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<2;j++){
//                 int l=i;
//                 int r=l+j;
//                 while(l>=0&&r<n&&s.charAt(l--)==s.charAt(r++)){
//                         count++;
//                     }
//                 }
//             }
//         return count;
//     }
// }