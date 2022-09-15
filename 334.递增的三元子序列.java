import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=334 lang=java
 *
 * [334] 递增的三元子序列
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
       int n=nums.length;
       if(n<=2){
            return false;
       }
       int first=nums[0],second=Integer.MAX_VALUE;
       for(int i=1;i<n;i++){
        int cur=nums[i];
        if(cur>second){
            return true;
        }else if(cur>first){
            second=cur;
        }else{
            first=cur;
        }
       }
       return false;
    }
}
// @lc code=end


// Solution1:超时
// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int n=nums.length;
//         int[] dp=new int[n];
//         Arrays.fill(dp,1);
//         int max=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 if(nums[i]>nums[j]){
//                     dp[i]=Integer.max(dp[j]+1, dp[i]);
//                 }
//             }
//             max=Integer.max(dp[i],max);
//         }
//         return max>=3;
//     }
// }


// Solution2：超时
// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int n=nums.length;
//         boolean[] f=new boolean[n];
//         Arrays.fill(f, false);
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i;j++){
//                 if(nums[i]>nums[j]){
//                     if(f[j]){
//                         return true;
//                     }
                        // f[i]=true
//                 }
//             }
//         }
//         return false;
//     }
// }

// Solution3:贪心
// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//        int n=nums.length;
//        if(n<=2){
//             return false;
//        }
//        int first=nums[0],second=Integer.MAX_VALUE;
//        for(int i=1;i<n;i++){
//         int cur=nums[i];
//         if(cur>second){
//             return true;
//         }else if(cur>first){
//             second=cur;
//         }else{
//             first=cur;
//         }
//        }
//        return false;
//     }
// }