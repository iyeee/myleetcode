import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] tmp=str.toCharArray();
            Arrays.sort(tmp);
            String strTmp=new String(tmp);
            List<String> list=map.getOrDefault(strTmp,new LinkedList<String>());
            list.add(str);
            map.put(strTmp, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> res=new LinkedList<>();
//         Map<String,List<String>> map=new HashMap<>();
//         for(String str:strs){
//             char[] tmp=str.toCharArray();
//             Arrays.sort(tmp);
//             String strTmp=new String(tmp);
//             if(!map.containsKey(strTmp)){
//                 List<String> strings=new LinkedList<>();
//                 strings.add(str);
//                 map.put(strTmp,strings);
//                 res.add(strings);
//             }else{
//                 List<String> strings=map.get(strTmp);
//                 strings.add(str);
//             }
//         }
//         return res;
//     }
// }


// //改进
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String,List<String>> map=new HashMap<>();
//         for(String str:strs){
//             char[] tmp=str.toCharArray();
//             Arrays.sort(tmp);
//             String strTmp=new String(tmp);
//             List<String> list=map.getOrDefault(strTmp,new LinkedList<String>());
//             list.add(str);
//             map.put(strTmp, list);
//         }
//         return new ArrayList<List<String>>(map.values());
//     }
// }