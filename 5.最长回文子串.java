/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) {
            return s;
        }
        int start = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            int[] odd = centerSpread(i, i, s);
            int[] even = centerSpread(i, i + 1, s);
            int[] max = odd[1] > even[1] ? odd : even;
            if (max[1] > maxLen) {
                start = max[0];
                maxLen = max[1];
            }
        }
        return s.substring(start, maxLen + start);
    }

    int[] centerSpread(int l, int r, String s) {
        int len = s.length();
        while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return new int[] { l + 1, r - l - 1 };
    }
}
// @lc code=end

// Solution1: dp
// class Solution {
// public String longestPalindrome(String s) {
// int n=s.length();
// if(n<2){
// return s;
// }
// boolean[][] dp=new boolean[n][n];
// for(int i=0;i<n;i++){
// dp[i][i]=true;
// }
// int start=0,maxLen=0;
// for(int i=n-1;i>=0;i--){
// for(int j=i+1;j<n;j++){
// if(s.charAt(i)==s.charAt(j)){
// if(j-i<3){
// dp[i][j]=true;
// }else{
// dp[i][j]=dp[i+1][j-1];
// }
// if(j-i>maxLen&&dp[i][j]){
// maxLen=j-i;
// start=i;
// }
// }else{
// dp[i][j]=false;
// }
// }
// }
// return s.substring(start, start+maxLen+1);
// }
// }

// Solution2: 中心拓展
// class Solution {
// public String longestPalindrome(String s) {
// int n=s.length();
// if(n<2){
// return s;
// }
// int start=0,maxLen=0;
// for(int i=0;i<n;i++){
// int[] odd=centerSpread(i, i, s);
// int[] even=centerSpread(i, i+1, s);
// int[] max=odd[1]>even[1]?odd:even;
// if(max[1]>maxLen){
// start=max[0];
// maxLen=max[1];
// }
// }
// return s.substring(start, maxLen+start);
// }

// int[] centerSpread(int l,int r,String s){
// int len=s.length();
// while(l>=0&&r<len&&s.charAt(l)==s.charAt(r)){
// l--;
// r++;
// }
// return new int[]{l+1,r-l-1};
// }
// }