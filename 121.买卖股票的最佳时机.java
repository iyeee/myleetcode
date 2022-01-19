/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
    int min=Integer.MAX_VALUE,res=0;
    for(int i=0;i<prices.length;i++){
        min=Math.min(min,prices[i]);
        res=Math.max(res, prices[i]-min);
    }     
    return res;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public int maxProfit(int[] prices) {
//     int min=Integer.MAX_VALUE,res=0;
//     for(int i=0;i<prices.length;i++){
//         min=Math.min(min,prices[i]);
//         res=Math.max(res, prices[i]-min);
//     }     
//     return res;
//     }
// }