import java.util.HashMap;
import java.util.Map;


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
                    left=Integer.max(left,map.get(ch)+1);
                }
                map.put(ch, i);
                maxLen=Integer.max(maxLen, i-left+1);
            }
            return maxLen;
        }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s==null||s.length()==0){
//             return 0;
//         }
//         Map<Character,Integer> map=new HashMap<>();
//         int maxLen=0,left=0;
//         for(int i=0;i<s.length();i++){
//             if(map.containsKey(s.charAt(i))){
//                 left=Integer.max(left,map.get(s.charAt(i))+1);
//             }
//             map.put(s.charAt(i), i);
//             maxLen=Integer.max(maxLen, i-left+1);
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