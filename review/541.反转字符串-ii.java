/*
 * @lc app=leetcode.cn id=541 lang=java
 *
 * [541] 反转字符串 II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public String reverseStr(String s, int k) {
//         int len=s.length();
//         StringBuilder stringBuilder=new StringBuilder();
//         for(int i=0;i<len;i+=2*k){
//             for(int j= Integer.min(i+k-1,len-1);j>=i;j--){
//                 stringBuilder.append(s.charAt(j));                
//             }
//             for(int ii=i+k;ii<i+2*k&&ii<=len-1;ii++){    
//                 stringBuilder.append(s.charAt(ii));
//             }
//         }
//         return stringBuilder.toString();
//     }
// }


// Solution2:
// class Solution {
//     public String reverseStr(String s, int k) {
//         int len=s.length();
//         char[] arr=s.toCharArray();
//         for(int i=0;i<len;i+=2*k){
//             for(int m=Integer.min(len-1, i+k-1),n=i;m>n;m--,n++){
//                 char tmp=arr[m];
//                 arr[m]=arr[n];
//                 arr[n]=tmp;
//             }
//         }
//         return new String(arr);
//     }
// }