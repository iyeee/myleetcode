/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        for(char c:magazine.toCharArray()){
            arr[c-'a']++;
        }
        for(char c:ransomNote.toCharArray()){
            arr[c-'a']--;
        }
        for(int n:arr){
            if(n<0){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         int[] arr=new int[26];
//         for(char c:magazine.toCharArray()){
//             arr[c-'a']++;
//         }
//         for(char c:ransomNote.toCharArray()){
//             arr[c-'a']--;
//         }
//         for(int n:arr){
//             if(n<0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }