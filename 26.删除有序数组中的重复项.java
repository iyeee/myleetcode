/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除有序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int index=0,pre=Integer.MIN_VALUE;
        for(int n:nums){
            if(n!=pre){
                nums[index++]=n;
                pre=n;
            }
        }
        return index;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         int index=0,pre=Integer.MIN_VALUE;
//         for(int n:nums){
//             if(n!=pre){
//                 nums[index++]=n;
//                 pre=n;
//             }
//         }
//         return index;
//     }
// }