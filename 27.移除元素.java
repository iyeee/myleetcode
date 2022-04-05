/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int left=0,right=nums.length-1;
        while(left<=right){
            if(nums[left]!=val){
                left++;
            }else{
                nums[left]=nums[right];
                right--;
            }
        }
        return left;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         if(nums.length==0){
//             return 0;
//         }
//         int index=0;
//         for(int n:nums){
//             if(n!=val){
//                 nums[index++]=n;
//             }
//         }
//         return index;
//     }
// }

// Solution2:
// class Solution {
//     public int removeElement(int[] nums, int val) {
//         if(nums.length==0){
//             return 0;
//         }
//         int left=0,right=nums.length-1;
//         while(left<=right){
//             if(nums[left]!=val){
//                 left++;
//             }else{
//                 nums[left]=nums[right];
//                 right--;
//             }
//         }
//         return left;
//     }
// }