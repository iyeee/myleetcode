import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return res;
        }
        Map<Character,String> map=new HashMap<>(){{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz"); 
        }};
        dfs(map,digits,res,"",0);
        return res;
    }
    void dfs(Map<Character,String> map,String digits, List<String> res,String tmp,int index){
        if(tmp.length()==digits.length()){
            res.add(tmp);
            return;
        }
            for(Character c:map.get(digits.charAt(index)).toCharArray()){
                String origin=tmp;
                tmp+=c;
                dfs(map, digits, res, tmp, index+1);
                tmp=origin;
            }
        }
}
// @lc code=end

