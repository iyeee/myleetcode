/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] fn=new int[n+1];
        fn[0]=0;
        fn[1]=1;
        for(int i=2;i<=n;i++){
            fn[i]=fn[i-1]+fn[i-2];
        }
        return fn[n];
    }
}
// @lc code=end

