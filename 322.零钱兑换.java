import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        for(int i=0;i<amount+1;i++){
            dp[i]=amount+1;
        }
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
                if(i-coin>=0){
                    dp[i]=Integer.min(dp[i],1+dp[i-coin]);
                }
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         Map<Integer,Integer> map=new HashMap<>();
//         return dfs(coins,amount,map);
//     }
//     int dfs(int[] coins,int amount,Map<Integer,Integer> map){
//         if(map.containsKey(amount)){
//             return map.get(amount);
//         }
//         if(amount==0){
//             return 0;
//         }
//         if(amount<0){
//             return -1;
//         }
//         int res=Integer.MAX_VALUE;
//         for(int coin:coins){
//             int sub=dfs(coins, amount-coin, map);
//             if(sub==-1){
//                 continue;
//             }else{
//                 res=Integer.min(res, 1+sub);
//             }
//         }
//         res=res==Integer.MAX_VALUE?-1:res;
//         map.put(amount, res);
//         return res;
//     }
// }


// Solution2:
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int[] dp=new int[amount+1];
//         for(int i=0;i<amount+1;i++){
//             dp[i]=-1;
//         }
//         dp[0]=0;
//         for(int i=1;i<=amount;i++){
//             int res=Integer.MAX_VALUE;
//             for(int coin:coins){
//                 if(i-coin>=0&&dp[i-coin]!=-1){
//                     res=Integer.min(res,1+dp[i-coin]);
//                     dp[i]=res==Integer.MAX_VALUE?-1:res;
//                 }
//             }
//         }
//         return dp[amount];
//     }
// }



// Solution3:
// 初始化amout+1 因为永远达不到amount+1
// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int[] dp=new int[amount+1];
//         for(int i=0;i<amount+1;i++){
//             dp[i]=amount+1;
//         }
//         dp[0]=0;
//         for(int i=1;i<=amount;i++){
//             for(int coin:coins){
//                 if(i-coin>=0){
//                     dp[i]=Integer.min(dp[i],1+dp[i-coin]);
//                 }
//             }
//         }
//         return dp[amount]==amount+1?-1:dp[amount];
//     }
// }