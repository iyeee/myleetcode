import java.util.HashMap;
import java.util.Map;;
/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] arr=new char[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:t.toCharArray()){
            arr[c-'a']--;
        }
        for(int n:arr){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         char[] arr=new char[26];
//         for(char c:s.toCharArray()){
//             arr[c-'a']++;
//         }
//         for(char c:t.toCharArray()){
//             arr[c-'a']--;
//         }
//         for(int n:arr){
//             if(n!=0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }