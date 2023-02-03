/*
 * @lc app=leetcode.cn id=1768 lang=java
 *
 * [1768] 交替合并字符串
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder=new StringBuilder();
        int l1=word1.length(),l2=word2.length();
        int index1=0,index2=0;
        while(index1<l1||index2<l2){
            if(index1<l1){
                stringBuilder.append(word1.charAt(index1++));
            }
            if(index2<l2){
                stringBuilder.append(word2.charAt(index2++));
            }
        }
        return stringBuilder.toString();
    }
}
// @lc code=end
// Solution1： my
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder stringBuilder=new StringBuilder();
//         int l1=word1.length(),l2=word2.length(),l3=l1+l2;
//         int index1=0,index2=0;
//         while(index1+index2<l3){
//             if(index1<l1 && index2<l2){
//                 stringBuilder.append(word1.charAt(index1++));
//                 stringBuilder.append(word2.charAt(index2++));
//             }else if(index1<l1){
//                 stringBuilder.append(word1.charAt(index1++));
//             }else{
//                 stringBuilder.append(word2.charAt(index2++));
//             }

//         }
//         return stringBuilder.toString();
//     }
// }

// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder stringBuilder=new StringBuilder();
//         int l1=word1.length(),l2=word2.length();
//         int index1=0,index2=0;
//         while(index1<l1||index2<l2){
//             if(index1<l1 && index2<l2){
//                 stringBuilder.append(word1.charAt(index1++));
//                 stringBuilder.append(word2.charAt(index2++));
//             }else if(index1<l1){
//                 stringBuilder.append(word1.charAt(index1++));
//             }else{
//                 stringBuilder.append(word2.charAt(index2++));
//             }

//         }
//         return stringBuilder.toString();
//     }
// }


// Solution2:
// class Solution {
//     public String mergeAlternately(String word1, String word2) {
//         StringBuilder stringBuilder=new StringBuilder();
//         int l1=word1.length(),l2=word2.length();
//         int index1=0,index2=0;
//         while(index1<l1||index2<l2){
//             if(index1<l1){
//                 stringBuilder.append(word1.charAt(index1++));
//             }
//             if(index2<l2){
//                 stringBuilder.append(word2.charAt(index2++));
//             }
//         }
//         return stringBuilder.toString();
//     }
// }