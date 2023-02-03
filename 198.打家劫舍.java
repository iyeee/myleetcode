
/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int dp_i=0,dp_i_1=0,dp_i_2=0;
        for(int n:nums){
            dp_i=Integer.max(dp_i_1, dp_i_2+n);
            dp_i_2=dp_i_1;
            dp_i_1=dp_i;
        }
        return dp_i;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int rob(int[] nums) {
//         Map<Integer,Integer> map=new HashMap<>();
//         return dp(nums,0,map);
//     }
//     int dp(int[] nums,int start,Map<Integer,Integer> map){
//         if(start>=nums.length){
//             return 0;
//         }
//         if(map.containsKey(start)){
//             return map.get(start);
//         }
//         int res=Integer.max(dp(nums, start+1,map), nums[start]+dp(nums, start+2,map));
//         map.put(start, res);
//         return res;
//     }
// }

// class Solution {
//     public int rob(int[] nums) {
//         Map<Integer,Integer> map=new HashMap<>();
//         int n=nums.length;
//         return dp(nums,n,map);
//     }
//     int dp(int[] nums,int end,Map<Integer,Integer> map){
//         if(end<=0){
//             return 0;
//         }
//         if(map.containsKey(end)){
//             return map.get(end);
//         }
//         int res=Integer.max(dp(nums, end-1,map), nums[end-1]+dp(nums, end-2,map));
//         map.put(end, res);
//         return res;
//     }
// }


// Solution2:
// class Solution {
//     public int rob(int[] nums) {
//         int[] dp=new int[nums.length+2];
//         dp[nums.length]=0;
//         for(int i=nums.length-1;i>=0;i--){
//             dp[i]=Integer.max(dp[i+1], nums[i]+dp[i+2]);
//         }
//         return dp[0];
//     }
// }

// 状态压缩
// class Solution {
//     public int rob(int[] nums) {
//         int dp_i_1=0,dp_i_2=0;
//         int dp_i=0;
//         for(int i=nums.length-1;i>=0;i--){
//             dp_i=Integer.max(dp_i_1, nums[i]+dp_i_2);
//             dp_i_2=dp_i_1;
//             dp_i_1=dp_i;
//         }
//         return dp_i;
//     }
// }

// class Solution {
//     public int rob(int[] nums) {
//         int dp_i=0,dp_i_1=0,dp_i_2=0;
//         for(int i=0;i<nums.length;i++){
//             dp_i=Integer.max(dp_i_1, dp_i_2+nums[i]);
//             dp_i_2=dp_i_1;
//             dp_i_1=dp_i;
//         }
//         return dp_i;
//     }