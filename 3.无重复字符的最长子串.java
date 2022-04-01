import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.INPUT_STREAM;

/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        Map<Character,Integer> map=new HashMap<>();
        int maxLen=0,left=0;
   
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                left=Integer.max(left,map.get(ch));
            }
            map.put(ch, i+1);
            maxLen=Integer.max(maxLen,i-left+1);

        }
        return maxLen;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         String str="";
//         int maxLen=0;
//         for(int i=0;i<s.length();i++){
//             int index=str.indexOf(String.valueOf(s.charAt(i)));
//             if(index!=-1){
//                 str=str.substring(index+1);
//             }
//             str=str+s.charAt(i);
//             maxLen=Integer.max(maxLen,str.length());
//         }
//         return maxLen;
//     }
// }


// Solution2:
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s==null||s.length()==0){
//             return 0;
//         }
//         Map<Character,Integer> map=new HashMap<>();
//         int maxLen=0,left=0;
   
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(map.containsKey(ch)){
//                 left=Integer.max(left,map.get(ch));
//             }
//             map.put(ch, i+1);
//             maxLen=Integer.max(maxLen,i-left+1);

//         }
//         return maxLen;
//     }
// }