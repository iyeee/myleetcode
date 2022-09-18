import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> sWords=new HashSet<>(wordDict);
        int n=s.length();
        boolean[] dp=new boolean[n+1];
        dp[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(dp[j]&&sWords.contains(s.subSequence(j, i)))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
// @lc code=end

// Solution1: 记忆化搜索
// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         Set<Integer> falseSet=new HashSet<>();
//         return dfs(s,wordDict,0,falseSet);
//     }
//     boolean dfs(String s,List<String> wordDict,int start,Set<Integer> falseSet){
//         if(start==s.length()){
//             return true;
//         }
//         if(falseSet.contains(start)){
//             return false;
//         }
//         for(int j=start+1;j<=s.length();j++){
//             if(wordDict.contains(s.substring(start, j))){
//                 if(dfs(s, wordDict, j, falseSet)){
//                     return true;
//                 }
//             }
//             falseSet.add(start);
//         }
//         return false;
//     }
// }


// Solution2:
// dp本质还是穷举 只是用空间换时间 减少重复计算
// class Solution {
//     public boolean wordBreak(String s, List<String> wordDict) {
//         Set<String> sWords=new HashSet<>(wordDict);
//         int n=s.length();
//         boolean[] dp=new boolean[n+1];
//         dp[0]=true;
//         for(int i=1;i<=n;i++){
//             for(int j=0;j<i;j++){
//                 if(dp[j]&&sWords.contains(s.subSequence(j, i)))
//                 {
//                     dp[i]=true;
//                     break;
//                 }
//             }
//         }
//         return dp[n];
//     }
// }