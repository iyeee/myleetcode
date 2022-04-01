import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }else if(x<0||x%10==0){
            return false;
        }
        int reverseNum=0;
        while(reverseNum<x){
            reverseNum=reverseNum*10+x%10;
            x/=10;
        }
        return reverseNum==x||reverseNum/10==x;
        
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x==0){
//             return true;
//         }else if(x<0){
//             return false;
//         }
//         StringBuilder sBuilder=new StringBuilder(String.valueOf(x));
//         if(sBuilder.toString().equals(new StringBuilder(sBuilder).reverse().toString())){
//             return true;
//         }else{
//             return false;
//         }

//     }
// }

// Solution2:
// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x==0){
//             return true;
//         }else if(x<0){
//             return false;
//         }
//         List<Integer> list=new ArrayList<>();
//         while(x!=0){
//             list.add(x%10);
//             x/=10;
//         }
//         int len=list.size();
//         for(int i=0;i<len;i++){
//             if(list.get(i)!=list.get(len-i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

// Solution3:
// class Solution {
//     public boolean isPalindrome(int x) {
//         if(x==0){
//             return true;
//         }else if(x<0||x%10==0){
//             return false;
//         }
//         int reverseNum=0;
//         while(reverseNum<x){
//             reverseNum=reverseNum*10+x%10;
//             x/=10;
//         }
//         return reverseNum==x||reverseNum/10==x;
        
//     }
// }