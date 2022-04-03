import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */
import java.util.List;

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return res;
        }
        Map<Character,String> map=new HashMap<>(){{
            put('2',"abc");
            put('3',"def");
            put('4',"ghi");
            put('5',"jkl");
            put('6',"mno");
            put('7',"pqrs");
            put('8',"tuv");
            put('9',"wxyz");
        }};
        dfs(res, 0, digits, map, new StringBuilder());
        return res;
    }
    void dfs(List<String> list,int index,String digits,Map<Character,String> map ,StringBuilder stringBuilder){
        if(stringBuilder.length()==digits.length()){
            list.add(stringBuilder.toString());
            return;
        }
        String str=map.get(digits.charAt(index));
        for(char ch:str.toCharArray()){
            stringBuilder.append(ch);
            dfs(list, index+1, digits, map, stringBuilder);
            stringBuilder.delete(index, index+1);
        }
    }
}
// @lc code=end



// Solution1:  回溯
// class Solution {
//     public List<String> letterCombinations(String digits) {
//         List<String> res=new ArrayList<>();
//         if(digits==null||digits.length()==0){
//             return res;
//         }
//         Map<Character,String> map=new HashMap<>(){{
//             put('2',"abc");
//             put('3',"def");
//             put('4',"ghi");
//             put('5',"jkl");
//             put('6',"mno");
//             put('7',"pqrs");
//             put('8',"tuv");
//             put('9',"wxyz");
//         }};
//         dfs(res, 0, digits, map, new StringBuilder());
//         return res;
//     }
//     void dfs(List<String> list,int index,String digits,Map<Character,String> map ,StringBuilder stringBuilder){
//         if(stringBuilder.length()==digits.length()){
//             list.add(stringBuilder.toString());
//             return;
//         }
//         String str=map.get(digits.charAt(index));
//         for(char ch:str.toCharArray()){
//             stringBuilder.append(ch);
//             dfs(list, index+1, digits, map, stringBuilder);
//             stringBuilder.delete(index, index+1);
//         }
//     }
// }