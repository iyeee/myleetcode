/*
 * @lc app=leetcode.cn id=376 lang=java
 *
 * [376] 摆动序列
 */

// @lc code=start
class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        if(nums.length<=1){
           return nums.length;
        }
        int res=1;   
        int pre=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<0&&pre>=0||pre<=0&&nums[i]-nums[i-1]>0){
                res++;
                pre=nums[i]-nums[i-1];
            }
        }
        return res;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public int wiggleMaxLength(int[] nums) {
        
//         if(nums.length<=1){
//            return nums.length;
//         }
//         int res=2;
//         int index=1;
//         while(nums[index]==nums[index-1]){
//             index++;
//             if(index==nums.length){
//                 return 1;
//             }
//         }
       
//         int pre=nums[index]-nums[index-1];
//         for(int i=index+1;i<nums.length;i++){
//             if(nums[i]-nums[i-1]<0&&pre>0||pre<0&&nums[i]-nums[i-1]>0){
//                 res++;
//                 pre=nums[i]-nums[i-1];
//             }
//         }
//         return res;
//     }
// }
// class Solution {
//     public int wiggleMaxLength(int[] nums) {
        
//         if(nums.length<=1){
//            return nums.length;
//         }
//         int res=1;   
//         int pre=0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]-nums[i-1]<0&&pre>=0||pre<=0&&nums[i]-nums[i-1]>0){
//                 res++;
//                 pre=nums[i]-nums[i-1];
//             }
//         }
//         return res;
//     }
// }