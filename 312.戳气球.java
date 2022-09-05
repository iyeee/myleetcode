import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=312 lang=java
 *
 * [312] 戳气球
 */

// @lc code=start
class Solution {
    int res = 0;

    public int maxCoins(int[] nums) {
        int n=nums.length;
        int[] points=new int[n+2];
        points[0]=points[n+1]=1;
        for(int i=1;i<=n;i++){
            points[i]=nums[i-1];
        }
        int[][] dp=new int[n+2][n+2];
        for(int i=n;i>=0;i--){
            for(int j=i+1;j<n+2;j++){
                for(int k=i+1;k<j;k++){
                    dp[i][j]=Integer.max(dp[i][j],dp[i][k]+dp[k][j]+points[i]*points[j]*points[k]);
                }
            }
        }
        return dp[0][n+1];
    }
}
// @lc code=end


// Solution1:
// 回溯  超时
// class Solution {
//     int res = 0;

//     public int maxCoins(int[] nums) {
//         List<Integer> list = new ArrayList<>();
//         for (int n : nums) {
//             list.add(n);
//         }
//         backtrack(nums, 0, list);
//         return res;
//     }

//     void backtrack(int[] nums, int score, List<Integer> list) {
//         if (list.isEmpty()) {
//             res = Integer.max(res, score);
//             return; 
//         }
//         for (int i = 0; i < list.size(); i++) {
//             int tmp1=i==0?1:list.get(i-1);
//             int tmp3=i==list.size()-1?1:list.get(i+1);
//             int point = tmp1 * list.get(i) * tmp3;
//             int tmp = list.get(i);
//             list.remove(i);
//             score += point;
//             backtrack(nums, score, list);
//             score -= point;
//             list.add(i, tmp);
//         }
//     }
// }


// Solution2:
// dp
// class Solution {
//     int res = 0;

//     public int maxCoins(int[] nums) {
//         int n=nums.length;
//         int[] points=new int[n+2];
//         points[0]=points[n+1]=1;
//         for(int i=1;i<=n;i++){
//             points[i]=nums[i-1];
//         }
//         int[][] dp=new int[n+2][n+2];
//         for(int i=n;i>=0;i--){
//             for(int j=i+1;j<n+2;j++){
//                 for(int k=i+1;k<j;k++){
//                     dp[i][j]=Integer.max(dp[i][j],dp[i][k]+dp[k][j]+points[i]*points[j]*points[k]);
//                 }
//             }
//         }
//         return dp[0][n+1];
//     }
// }