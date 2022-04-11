/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int p=1,q=2,r=3;
        for(int i=3;i<n;i++){
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
// @lc code=end


// dp
// Solution1:
// class Solution {
//     public int climbStairs(int n) {
//         if(n<=3){
//             return n;
//         }
//         int[] arr=new int[n];
//         arr[1]=2;
//         arr[2]=3;
//         for(int i=3;i<n;i++){
//             arr[i]=arr[i-1]+arr[i-2];
//         }
//         return arr[n-1];
//     }
// }

// 优化 不需要开辟数组
// class Solution {
//     public int climbStairs(int n) {
//         int p=0,q=0,r=1;
//         for(int i=1;i<=n;i++){
//             p=q;
//             q=r;
//             r=p+q;
//         }
//         return r;
//     }
// }