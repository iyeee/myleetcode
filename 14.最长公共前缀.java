/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        StringBuilder prefix=new StringBuilder();
        int index=0;    
        while(index<strs[0].length()){
        for(int i=0;i<strs.length-1;i++){
            if(strs[i].length()<=index||strs[i+1].length()<=index||strs[i].charAt(index)!=strs[i+1].charAt(index)){
                return prefix.toString();
            }
        }
        prefix.append(strs[0].charAt(index++));
    }
        return prefix.toString();
    }
       
}
// @lc code=end

// Soltion1:
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length==0){
//             return "";
//         }
//         StringBuilder prefix=new StringBuilder();
//         int index=0;    
//         while(index<strs[0].length()){
//         for(int i=0;i<strs.length-1;i++){
//             if(strs[i].length()<=index||strs[i+1].length()<=index||strs[i].charAt(index)!=strs[i+1].charAt(index)){
//                 return prefix.toString();
//             }
//         }
//         prefix.append(strs[0].charAt(index++));
//     }
//         return prefix.toString();
//     }
       
// }



// Solution2: 官解纵向
// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0) {
//             return "";
//         }
//         int length = strs[0].length();
//         int count = strs.length;
//         for (int i = 0; i < length; i++) {
//             char c = strs[0].charAt(i);
//             for (int j = 1; j < count; j++) {
//                 if (i == strs[j].length() || strs[j].charAt(i) != c) {
//                     return strs[0].substring(0, i);
//                 }
//             }
//         }
//         return strs[0];
//     }
// }
