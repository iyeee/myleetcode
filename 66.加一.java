import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]+=1;
                return digits;
            }
        }
        int[] newArr=new int[digits.length+1];
        newArr[0]=1;
        return newArr;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int[] plusOne(int[] digits) {
//         for(int i=digits.length-1;i>=0;i--){
//             if(digits[i]==9){
//                 digits[i]=0;
//             }else{
//                 digits[i]+=1;
//                 return digits;
//             }
//         }
//         int[] newArr=new int[digits.length+1];
//         newArr[0]=1;
//         return newArr;
//     }
// }