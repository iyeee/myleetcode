/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        String str="";
        if(x<0){
            str=String.valueOf(x).substring(1);
        }else{
            str=String.valueOf(x);
        }
        StringBuilder resStr=new StringBuilder(str).reverse();
        if(resStr.charAt(0)=='0'){
            resStr.deleteCharAt(0);
        }
        if(resStr.length()==10){
            if(resStr.compareTo(new StringBuilder("2147483647"))>=0){
                return 0;
            }
        }
        if(x<0){
            return Integer.parseInt("-"+resStr.toString());
        }else{
            return Integer.parseInt(resStr.toString());
        }
    }
}
// @lc code=end


// 2020  用了Long
// Solution1:
// class Solution {
//     public int reverse(int x) {
//         int flag=x>=0?1:-1;
//         char[] strx=String.valueOf((long)x*flag).toCharArray();
//         for(int i=0;i<strx.length/2;i++){
//             Character ch=strx[i];
//             strx[i]=strx[strx.length-i-1];
//             strx[strx.length-i-1]=ch;
//         }
//         long slove= Long.parseLong(new String(strx));
//         if(slove<=Integer.MAX_VALUE&&slove>=Integer.MIN_VALUE){
//             return flag*(int)slove;
//         }else{
//             return 0;
//         }
//     }
// }


// 用字符串  较慢
// Solution2:
// class Solution {
//     public int reverse(int x) {
//         if(x==0){
//             return 0;
//         }
//         String str="";
//         if(x<0){
//             str=String.valueOf(x).substring(1);
//         }else{
//             str=String.valueOf(x);
//         }
//         StringBuilder resStr=new StringBuilder(str).reverse();
//         if(resStr.charAt(0)=='0'){
//             resStr.deleteCharAt(0);
//         }
//         if(resStr.length()==10){
//             if(resStr.compareTo(new StringBuilder("2147483647"))>=0){
//                 return 0;
//             }
//         }
//         if(x<0){
//             return Integer.parseInt("-"+resStr.toString());
//         }else{
//             return Integer.parseInt(resStr.toString());
//         }
//     }
// }