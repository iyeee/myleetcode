/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int cover=0;
        if(nums.length==1) return true;
        for(int i=0;i<=cover;i++){
            cover=Integer.max(cover, nums[i]+i);
            if(cover>=nums.length-1){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

// Solution:
// class Solution {
//     public boolean canJump(int[] nums) {
//         int cover=0;
//         if(nums.length==1) return true;
//         for(int i=0;i<=cover;i++){
//             cover=Integer.max(cover, nums[i]+i);
//             if(cover>=nums.length-1){
//                 return true;
//             }
//         }
//         return false;
//     }
// }