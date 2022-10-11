import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<nums.length-2;i++){
            int l=i+1,r=nums.length-1;
            while(l<r){
                sum=nums[i]+nums[l]+nums[r];
                if(Math.abs(sum-target)<Math.abs(res-target)){
                    res=sum;
                }
                if(sum>target){
                    r--;
                  
                }else if(sum<target){
                    l++;
                }else if(sum==target){
                    return target;
                }
            }
        }
        return res;
    }
}
// @lc code=end

// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int res=Integer.MAX_VALUE,sum=0;
//         for(int i=0;i<nums.length-2;i++){
//             int l=i+1,r=nums.length-1;
//             while(l<r){
//                 sum=nums[i]+nums[l]+nums[r];
//                 if(sum>target){
//                     r--;
//                     if(sum-target<Math.abs(res)){
//                         res=sum-target;
//                     }
//                 }else if(sum<target){
//                     l++;
//                     if(sum-target<Math.abs(res)){
//                         res=sum-target;
//                     }
//                 }else if(sum==target){
//                     return target;
//                 }
//             }
//         }
//         return res+target;
//     }
// }

// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         int res=Integer.MAX_VALUE,sum=0;
//         for(int i=0;i<nums.length-2;i++){
//             int l=i+1,r=nums.length-1;
//             while(l<r){
//                 sum=nums[i]+nums[l]+nums[r];
//                 if(Math.abs(sum-target)<Math.abs(res-target)){
//                     res=sum;
//                 }
//                 if(sum>target){
//                     r--;
                  
//                 }else if(sum<target){
//                     l++;
//                 }else if(sum==target){
//                     return target;
//                 }
//             }
//         }
//         return res;
//     }
// }