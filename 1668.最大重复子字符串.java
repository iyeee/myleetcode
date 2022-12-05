/*
 * @lc app=leetcode.cn id=1668 lang=java
 *
 * [1668] 最大重复子字符串
 */

// @lc code=start
class Solution {
    public int maxRepeating(String sequence, String word) {
        int m=sequence.length(),n=word.length();
        int res=0;
        if(m<n){
          return 0;
        }
        int[] dp=new int[m+1];
        for(int i=n;i<=m;i++){
          if(sequence.substring(i-n, i).equals(word)){
              dp[i]=dp[i-n]+1;
              res=Integer.max(dp[i],res);
          }
        }
        return res;
    }
}
// @lc code=end







// Solution1:
// class Solution {
//   public int maxRepeating(String sequence, String word) {
//     int res=0;
//     StringBuilder stringBuilder=new StringBuilder(word);
//     while(sequence.contains(stringBuilder)){
//       res++;
//       stringBuilder.append(word);
//     }
//     return res;

//   }
// }


// Solution2:
// class Solution {
//   public int maxRepeating(String sequence, String word) {
//       int m=sequence.length(),n=word.length();
//       int res=0;
//       if(m<n){
//         return 0;
//       }
//       int[] dp=new int[m+1];
//       for(int i=n;i<=m;i++){
//         if(i<n){
//           continue;
//         }
//         if(sequence.substring(i-n, i).equals(word)){
//             dp[i]=dp[i-n]+1;
//             res=Integer.max(dp[i],res);
//         }
//       }
//       return res;
//   }
// }



// woring
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