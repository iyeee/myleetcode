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
    List<String> res=new LinkedList<>();
    String tmp="";
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<Integer> falseSet = new HashSet<>();
        help(s, wordDict,0, falseSet);
        return res;
    }
    void help(String s, List<String> wordDict, int start, Set<Integer> falseSet){
        if(dfs(s, wordDict, 0, falseSet)){
            res.add(tmp.substring(1));
            tmp="";
            falseSet.clear();
         
            help(s, wordDict, start, falseSet);
        }
    }

    boolean dfs(String s, List<String> wordDict, int start, Set<Integer> falseSet) {
        System.out.println(tmp);
        if (start == s.length()) {
            if(tmp.length()>0&&res.contains(tmp.substring(1))){
                return false;
            }else{
                return true;
            }
        }
        if (falseSet.contains(start)) {
            return false;
        }
        for (int j = start + 1; j <= s.length(); j++) {
            if (wordDict.contains(s.substring(start, j))) {
                if (dfs(s, wordDict, j, falseSet)) {
                    tmp=" "+s.substring(start,j)+tmp;
                    return true;
                }
            }
            falseSet.add(start);
        }
        return false;
    }
}
// @lc code=end
