/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        for(int i=0,j=len-1;i<j;i++,j--){
            char tmp=s[i];
            s[i]=s[j];
            s[j]=tmp;
        }

    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public void reverseString(char[] s) {
//         int len=s.length;
//         for(int i=0;i<len/2;i++){
//             char tmp=s[i];
//             s[i]=s[len-i-1];
//             s[len-i-1]=tmp;
//         }
//     }
// }