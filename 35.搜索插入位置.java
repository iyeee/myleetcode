/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(r-l)/2+l;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;

    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         int l=0,r=nums.length-1;
//         while(l<=r){
//             int mid=(r-l)/2+l;
//             if(nums[mid]==target){
//                 return mid;
//             }else if(nums[mid]<target){
//                 l=mid+1;
//             }else{
//                 r=mid-1;
//             }
//         }
//         return l;

//     }
// }