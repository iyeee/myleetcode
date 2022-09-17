/*
 * @lc app=leetcode.cn id=413 lang=java
 *
 * [413] 等差数列划分
 */

// @lc code=start
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return 0;
        }
        int[] dp=new int[n];
        for(int i=2;i<n;i++){
            if(nums[i-1]*2==nums[i]+nums[i-2]){
                dp[i]=1+dp[i-1];
            }
        }
        int res=0;
        for(int i:dp){
            res+=i;
        }
        return res;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public int numberOfArithmeticSlices(int[] nums) {
//         int n=nums.length;
//         if(n<=2){
//             return 0;
//         }
//         int cur=0,sum=0;
//         for(int i=2;i<n;i++){
//             if(cur<2){
//                 if(nums[i-1]+nums[i-1]==nums[i]+nums[i-2]){
//                     cur=2;
//                     sum+=1;
//                 }
//             }else{
//                 if(nums[i-1]+nums[i-1]==nums[i]+nums[i-2]){
//                     sum+=cur;
//                     cur++;
//                 }else{
//                     cur=1;
//                 }
//             }
//         }
//         return sum;
//     }
// }


// Solution2 差分 + 计数
// class Solution {
//     public int numberOfArithmeticSlices(int[] nums) {
//         int n=nums.length;
//         if(n<=2){
//             return 0;
//         }
//         int sum=0,t=0,d=nums[1]-nums[0];
//         for(int i=2;i<n;i++){
//             if(nums[i]-nums[i-1]==d){
//                 t++;
//             }else{
//                 d=nums[i]-nums[i-1];
//                 t=0;
//             }
//             sum+=t;
//         }
//         return sum;
//     }
// }


// dp
// Solution3:
// class Solution {
//     public int numberOfArithmeticSlices(int[] nums) {
//         int n=nums.length;
//         if(n<=2){
//             return 0;
//         }
//         int[] dp=new int[n];
//         for(int i=2;i<n;i++){
//             if(nums[i-1]*2==nums[i]+nums[i-2]){
//                 dp[i]=1+dp[i-1];
//             }
//         }
//         int res=0;
//         for(int i:dp){
//             res+=i;
//         }
//         return res;
//     }
// }