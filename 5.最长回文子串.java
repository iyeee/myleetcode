/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    int max=0;
    String ans="";
    public String longestPalindrome(String s) {
        int n=s.length();
        dp(0,n-1,s);
        return ans;
    }
    int dp(int i,int j,String s){
        if(i<0||j>s.length()||i>j){
            return 0;
        }
        if(i==j){
            return 1;
        }
        int res=0;
        if(s.charAt(i)==s.charAt(j)){
            res=2+dp(i+1, j-1, s);
        }else{
            res=Integer.max(dp(i+1, j, s), dp(i, j-1, s));
        }
        if(res>=max){
            ans=s.substring(i, j+1);
            max=res;
        }
        return res;
    }
}
// @lc code=end

