/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
      if(nums==null||nums.length==0){
        return 0;
      }
      int len=nums.length;
      int max=nums[0];
      int[] dp=new int[len];
      dp[0]=nums[0];
      for(int i=1;i<len;i++){
        dp[i]=Integer.max(nums[i],nums[i]+dp[i-1]);
        max=Integer.max(max,dp[i]);
      }
      return max;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max=nums[0];
//         int pre=0;
//         for(int n:nums){
//             int tmp=pre+n;
//             if(tmp>max){
//                 max=tmp;
//             }
//             if(tmp>0){
//                 pre=tmp;
//             }else{
//                 pre=0;
//             }
//         }
//         return max;
//     }
// }


// Solution2:
// class Solution {
//     public int maxSubArray(int[] nums) {
//       int len=nums.length;
//       int max=nums[0];
//       int[] dp=new int[len];
//       dp[0]=nums[0];
//       for(int i=1;i<len;i++){
//         dp[i]=Integer.max(nums[i],nums[i]+dp[i-1]);
//         max=Integer.max(max,dp[i]);
//       }
//       return max;
//     }
// }