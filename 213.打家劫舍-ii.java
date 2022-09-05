/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int dp_i=0,dp_i_1=0,dp_i_2=0,dp_ii=0;
        for(int i=0;i<nums.length-1;i++){
            dp_i=Integer.max(dp_i_1, dp_i_2+nums[i]);
            dp_i_2=dp_i_1;
            dp_i_1=dp_i;
        }
        dp_i_1=0;
        dp_i_2=0;
        for(int i=1;i<nums.length;i++){
            dp_ii=Integer.max(dp_i_1, dp_i_2+nums[i]);
            dp_i_2=dp_i_1;
            dp_i_1=dp_ii;
        }
        return Integer.max(dp_i, dp_ii);
    }
}
// @lc code=end


// Solution1
// class Solution {
//     public int rob(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         if(nums.length==1){
//             return nums[0];
//         }
//         int dp_i=0,dp_i_1=0,dp_i_2=0,dp_ii=0;
//         for(int i=0;i<nums.length-1;i++){
//             dp_i=Integer.max(dp_i_1, dp_i_2+nums[i]);
//             dp_i_2=dp_i_1;
//             dp_i_1=dp_i;
//         }
//         dp_i_1=0;
//         dp_i_2=0;
//         for(int i=1;i<nums.length;i++){
//             dp_ii=Integer.max(dp_i_1, dp_i_2+nums[i]);
//             dp_i_2=dp_i_1;
//             dp_i_1=dp_ii;
//         }
//         return Integer.max(dp_i, dp_ii);
//     }
// }