/*
 * @lc app=leetcode.cn id=2138 lang=java
 *
 * [2138] 将字符串拆分为若干长度为 k 的组
 */

// @lc code=start
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len=s.length();
        int n=len/k;
        if(n*k!=len){
            n++;
            for(int i=0;i<n*k-len;i++){
                s+=fill;
            }
        }   
        String[] strings=new String[n];
        for(int i=0;i<n;i++){
            int tmp=i*k;
            strings[i]=s.substring(tmp, tmp+k);
        }
        return strings;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public String[] divideString(String s, int k, char fill) {
//         int len=s.length();
//         int n=len/k;
//         if(n*k!=len){
//             n++;
//             for(int i=0;i<n*k-len;i++){
//                 s+=fill;
//             }
//         }   
//         String[] strings=new String[n];
//         int index=0;
//         for(int i=0;i<n;i++){
//             StringBuilder stringBuilder=new StringBuilder();
//             for(int j=0;j<k;j++){
//                 stringBuilder.append(s.charAt(index++));
//             }
//             strings[i]=stringBuilder.toString();
//         }
//         return strings;
//     }
// }

// Solution2:
// class Solution {
//     public String[] divideString(String s, int k, char fill) {
//         int len=s.length();
//         int n=len/k;
//         if(n*k!=len){
//             n++;
//             for(int i=0;i<n*k-len;i++){
//                 s+=fill;
//             }
//         }   
//         String[] strings=new String[n];
//         int index=0;
//         for(int i=0;i<n;i++){
//             StringBuilder stringBuilder=new StringBuilder();
//             for(int j=0;j<k;j++){
//                 stringBuilder.append(s.charAt(index++));
//             }
//             strings[i]=stringBuilder.toString();
//         }
//         return strings;
//     }
// }