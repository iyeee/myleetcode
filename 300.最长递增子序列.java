import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长递增子序列
 */
// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Integer.max(dp[j]+1, dp[i]);
                }
            }
            max=Integer.max(dp[i],max);
        }
        return max;
    }
}
// @lc code=end

