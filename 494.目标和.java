import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        if(sum<target||(sum+target)%2==1){
            return 0;
        }
        return subsets(nums,Math.abs((sum+target)/2));
    }
    int subsets(int[] nums,int sum){
        int[] dp=new int[sum+1];
        dp[0]=1;
        for(int num:nums){
            for(int j=sum;j>=num;j--){
                dp[j]+=dp[j-num];
            }
            System.out.println(Arrays.toString(dp));
        }

        return dp[sum];
    }
}
// @lc code=end

// Solution1:
// 回溯
// class Solution {
//     int result=0;
//     public int findTargetSumWays(int[] nums, int target) {
//         dp(nums,0,target);
//         return result;
//     }
//     void dp(int[] nums,int index,int rest){
//         if(index==nums.length){
//             if(rest==0){
//                 result++;
//             }
//             return;
//         }
//         dp(nums, index+1, rest-nums[index]);
//         dp(nums, index+1, rest+nums[index]);
//     }
// }

// Solution2：
// 消除重叠子问题
// class Solution {
//     Map<String,Integer> map=new HashMap<>();
//     public int findTargetSumWays(int[] nums, int target) {
//         return  dp(nums,0,target);
//     }
//     int dp(int[] nums,int index,int rest){
//         if(index==nums.length){
//             if(rest==0){
//                 return 1;
//             }
//             return 0;
//         }
//         String key=index+","+rest;
//         if(map.containsKey(key)){
//             return map.get(key);
//         }
//         int res=dp(nums, index+1, rest-nums[index])+dp(nums, index+1, rest+nums[index]);
//         map.put(key, res);
//         return res;
//     }
// }

// Solution3：
// dp 转换成子集背包问题
// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         int sum=0;
//         for(int n:nums){
//             sum+=n;
//         }
//         if(sum<target||(sum+target)%2==1){
//             return 0;
//         }
//         return subsets(nums,Math.abs((sum+target)/2));
//     }
//     int subsets(int[] nums,int sum){
//         int n=nums.length;
//         int[][] dp=new int[n+1][sum+1];
//         for(int i=0;i<=n;i++){
//             dp[i][0]=1;
//         }
//         for(int i=1;i<=n;i++){
//             for(int j=0;j<=sum;j++){
//                 if(j>=nums[i-1]){
//                     dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
// }

// 状态压缩
// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         int sum=0;
//         for(int n:nums){
//             sum+=n;
//         }
//         if(sum<target||(sum+target)%2==1){
//             return 0;
//         }
//         return subsets(nums,Math.abs((sum+target)/2));
//     }
//     int subsets(int[] nums,int sum){
//         int n=nums.length;
//         int[][] dp=new int[n+1][sum+1];
//         for(int i=0;i<=n;i++){
//             dp[i][0]=1;
//         }
//         for(int i=1;i<=n;i++){
//             for(int j=0;j<=sum;j++){
//                 if(j>=nums[i-1]){
//                     dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
// }


// class Solution {
//     public int findTargetSumWays(int[] nums, int target) {
//         int sum=0;
//         for(int n:nums){
//             sum+=n;
//         }
//         if(sum<target||(sum+target)%2==1){
//             return 0;
//         }
//         return subsets(nums,Math.abs((sum+target)/2));
//     }
//     int subsets(int[] nums,int sum){
//         int n=nums.length;
//         int[][] dp=new int[n+1][sum+1];
//         for(int i=0;i<=n;i++){
//             dp[i][0]=1;
//         }
//         for(int i=1;i<=n;i++){
//             for(int j=0;j<=sum;j++){
//                 if(j>=nums[i-1]){
//                     dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
//                 }else{
//                     dp[i][j]=dp[i-1][j];
//                 }
//             }
//         }
//         return dp[n][sum];
//     }
// }