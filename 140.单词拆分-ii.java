import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=140 lang=java
 *
 * [140] 单词拆分 II
 */

// @lc code=start
class Solution {
    List<String> res = new LinkedList<>();
    Deque<String> tmp = new LinkedList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> words = new HashSet<>(wordDict);
        dfs(s, words, 0);
        return res;
    }

    void dfs(String s,Set<String> wSet,int start){
        if(start>=s.length()){
            res.add(String.join(" ",tmp));
            return;
        }
        for(int j=start+1;j<=s.length();j++){
            if(wSet.contains(s.substring(start, j))){
                tmp.add(s.substring(start, j));
                dfs(s, wSet, j);
                tmp.removeLast();
            }
        }
    }
}
// @lc code=end

// Solution1: 每次都从头搜起，慢
// class Solution {
// List<String> res=new LinkedList<>();
// Deque<String> tmp=new LinkedList<>();
// public List<String> wordBreak(String s, List<String> wordDict) {
// Set<String> words=new HashSet<>(wordDict);
// help(s, words,0);
// return res;
// }
// void help(String s, Set<String> wordDict, int start){
// if(dfs(s, wordDict, 0)){
// res.add(String.join(" ", tmp));
// tmp=new LinkedList<>();
// help(s, wordDict, start);
// }
// }

// boolean dfs(String s, Set<String> wordDict, int start) {
// if (start == s.length()) {
// if(tmp.size()>0&&res.contains(String.join(" ", tmp))){
// return false;
// }else{
// return true;
// }
// }
// for (int j = start + 1; j <= s.length(); j++) {
// if (wordDict.contains(s.substring(start, j))) {
// tmp.add(s.substring(start,j));
// if(dfs(s, wordDict, j)){
// return true;
// }
// tmp.removeLast();
// }

// }
// return false;
// }
// }


// Solution2: dfs
// class Solution {
//     List<String> res = new LinkedList<>();
//     Deque<String> tmp = new LinkedList<>();

//     public List<String> wordBreak(String s, List<String> wordDict) {
//         Set<String> words = new HashSet<>(wordDict);
//         dfs(s, words, 0);
//         return res;
//     }

//     void dfs(String s,Set<String> wSet,int start){
//         if(start>=s.length()){
//             res.add(String.join(" ",tmp));
//             return;
//         }
//         for(int j=start+1;j<=s.length();j++){
//             if(wSet.contains(s.substring(start, j))){
//                 tmp.add(s.substring(start, j));
//                 dfs(s, wSet, j);
//                 tmp.removeLast();
//             }
//         }
//     }
// }