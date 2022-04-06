/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        int m=a.length()-1,n=b.length()-1;
        StringBuilder stringBuilder=new StringBuilder();
        int carry=0;
        while(m>=0&&n>=0){
            int sum=carry;
            sum+=a.charAt(m--)-'0';
            sum+=b.charAt(n--)-'0';
            carry=sum/2;
            stringBuilder.append(sum%2);
        }
        while(m>=0){
            int sum=carry+a.charAt(m--)-'0';
            carry=sum/2;
            stringBuilder.append(sum%2);
        }
        while(n>=0){
            int sum=carry+b.charAt(n--)-'0';
            carry=sum/2;
            stringBuilder.append(sum%2);
        }
        if(carry==1){
            stringBuilder.append(1);
        }
        return stringBuilder.reverse().toString();
    }
}
// @lc code=end

//严重错误 溢出
// Solution1:
// class Solution {
//     public String addBinary(String a, String b) {
//         return  Integer.toString((Integer.valueOf(a,2)+Integer.valueOf(b,2)),2);
//     }
// }

// 补全两个字符串至一样长
// Solution2：
// class Solution {
//     public String addBinary(String a, String b) {
//         int m=a.length(),n=b.length();
//         int carry=0;
//         StringBuilder stringBuilder=new StringBuilder();
//         if(m<n){
//             for(int i=0;i<n-m;i++){
//                 stringBuilder.append(0);
//             }
//             a=stringBuilder.toString()+a;
//         }else{
//             for(int i=0;i<m-n;i++){
//                 stringBuilder.append(0);
//             }
//             b=stringBuilder.toString()+b;
//         }
//         StringBuilder stringBuilder2=new StringBuilder();
//         for(int i=Math.max(m, n)-1;i>=0;i--){
//            int sum=a.charAt(i)-'0'+b.charAt(i)-'0'+carry;
//             stringBuilder2.append(sum%2);
//             carry=sum/2;
//         }
//         if(carry==1){
//             stringBuilder2.append(1);
//         }
//         return stringBuilder2.reverse().toString();
//     }
// }





// Solution3:
// class Solution {
//     public String addBinary(String a, String b) {
//         int m=a.length()-1,n=b.length()-1;
//         StringBuilder stringBuilder=new StringBuilder();
//         int carry=0;
//         while(m>=0&&n>=0){
//             int sum=carry;
//             sum+=a.charAt(m--)-'0';
//             sum+=b.charAt(n--)-'0';
//             carry=sum/2;
//             stringBuilder.append(sum%2);
//         }
//         while(m>=0){
//             int sum=carry+a.charAt(m--)-'0';
//             carry=sum/2;
//             stringBuilder.append(sum%2);
//         }
//         while(n>=0){
//             int sum=carry+b.charAt(n--)-'0';
//             carry=sum/2;
//             stringBuilder.append(sum%2);
//         }
//         if(carry==1){
//             stringBuilder.append(1);
//         }
//         return stringBuilder.reverse().toString();
//     }
// }