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
        int pre=0,max=nums[0];
        for(int i=0;i<nums.length;i++){
            pre=Integer.max(nums[i],pre+nums[i]);
            max=Integer.max(max,pre);
        }
        return max;
    }
}
// @lc code=end


// Solution1:
// 贪心
//> 局部最优解：当前“连续和”为负数的时候立刻放弃
//> 全局最优解：选取最大“连续和”
// class Solution {
//     public int maxSubArray(int[] nums) {
//         if(nums==null||nums.length==0){
//             return 0;
//         }
//         int tmp=0,max=nums[0];
//         for(int i=0;i<nums.length;i++){
//             tmp+=nums[i];
//             max=Integer.max(max,tmp);
//             if(tmp<0){
//                 tmp=0;
//             }
//         }
//         return max;
//     }
// }


// Solution2：dp
// class Solution {
//     public int maxSubArray(int[] nums) {
//         if(nums==null||nums.length==0){
//             return 0;
//         }
//         int pre=0,max=nums[0];
//         for(int i=0;i<nums.length;i++){
//             pre=Integer.max(nums[i],pre+nums[i]);
//             max=Integer.max(max,pre);
//         }
//         return max;
//     }
// }