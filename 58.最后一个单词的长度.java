/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        int index=s.length()-1;
        int len=0;
        while(s.charAt(index)==' '){
            index--;
        }
        while(index>=0&&s.charAt(index)!=' '){
            len++;
            index--;
        }
        return len;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] strings=s.split(" ");
//         return strings[strings.length-1].length();
//     }
// }



// Solution2:
// class Solution {
//     public int lengthOfLastWord(String s) {
//         int len=0;
//         boolean flag=false;
//         for(int i=s.length()-1;i>=0;i--){
//             if(s.charAt(i)==' '){
//                 if(flag){
//                     return len;
//                 }else{
//                     continue;
//                 }
//             }else{
//                 flag=true;
//             }
//             len++;
//         }
//         return len;
//     }
// }


// Solution3:
// class Solution {
//     public int lengthOfLastWord(String s) {
//         int index=s.length()-1;
//         int len=0;
//         while(s.charAt(index)==' '){
//             index--;
//         }
//         while(index>=0&&s.charAt(index)!=' '){
//             len++;
//             index--;
//         }
//         return len;
//     }
// }
