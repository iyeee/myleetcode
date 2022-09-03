import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
    }
}
// @lc code=end

// Solution1:
// String作为k(String key=String.valueOf(i)+","+String.valueOf(j);)
// class Solution {
//     public boolean isMatch(String s, String p) {
//         Map<String,Boolean> map=new HashMap<>();
//         return dp(s,0,p,0,map);
//     }
//     boolean dp(String s,int i,String p,int j,Map<String,Boolean> memo){
//         int m=s.length(),n=p.length();
//         if(j==n){
//             return i==m;
//         }
//         if(i==m){
//             if((n-j)%2==1){
//                 return false;
//             }else{
//                 for(;j+1<n;j+=2){
//                     if(p.charAt(j+1)!='*'){
//                         return false;
//                     }
//                 }
//             }
//             return true;
//         }
//         String key=String.valueOf(i)+","+String.valueOf(j);
//         if(memo.containsKey(key)){
//             return memo.get(key);
//         }
//         boolean res=false;
//         if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
//             if(j<n-1&&p.charAt(j+1)=='*'){
//                 res=dp(s, i, p, j+2, memo)||dp(s, i+1, p, j, memo);
//             }else{
//                 res=dp(s, i+1, p, j+1, memo);
//             }
//         }else{
//             if(j<n-1&&p.charAt(j+1)=='*'){
//                 res=dp(s, i, p, j+2, memo);
//             }else{
//                 res=false;
//             }
//         }
//         memo.put(key, res);
//         return res;
//     }

// }


// Solution2: