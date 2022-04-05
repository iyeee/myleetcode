/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length(),n=needle.length();
        for(int i=0;i<=m-n;i++){
            boolean flag=true;
            for(int j=0;j<n;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    flag=false;      
                    break;
                }   
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public int strStr(String haystack, String needle) {
//         return haystack.indexOf(needle);
//     }
// }


// Solution2:
// class Solution {
//     public int strStr(String haystack, String needle) {
//         int m=haystack.length(),n=needle.length();
//         for(int i=0;i<=m-n;i++){
//             boolean flag=true;
//             for(int j=0;j<n;j++){
//                 if(haystack.charAt(i+j)!=needle.charAt(j)){
//                     flag=false;      
//                     break;
//                 }   
//             }
//             if(flag){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }