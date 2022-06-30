/*
 * @lc app=leetcode.cn id=1175 lang=java
 *
 * [1175] 质数排列
 */

// @lc code=start
class Solution {
    static final int MOD=(int)1e9+7;
    public int numPrimeArrangements(int n) {    
        int num=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                num++;
            }
        }
        return (int)(fac(num)*fac(n-num)%MOD);
    }
    boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    long fac(int n){
        long res=1;
        for(int i=1;i<=n;i++){
            res*=i;
            res%=MOD;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().numPrimeArrangements(100));
    }
}
// @lc code=end

