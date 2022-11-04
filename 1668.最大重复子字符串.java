/*
 * @lc app=leetcode.cn id=1668 lang=java
 *
 * [1668] 最大重复子字符串
 */

// @lc code=start
class Solution {
    public int maxRepeating(String sequence, String word) {
      int count=0,res=0;
      while(true){
        if()
      }
    }
}
// @lc code=end



// class Solution {
//     public int maxRepeating(String sequence, String word) {
//         int count=0,res=0;
//         int len=word.length();
//         for(int i=0;i<sequence.length()-len+1;){
//             if(sequence.subSequence(i, i+len).equals(word)){
//                 count++;
//                 if(count>res){
//                     res=count;
//                 }
//                 i+=len;
//             }else{
//                 count=0;
//                 i++;
//             }

//         }
//         return res;
//     }
// }