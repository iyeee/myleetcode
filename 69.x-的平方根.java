/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        int l=0,r=x,ans=-1;
        while(l<=r){
            int mid=(r-l)/2+l;
            if((long)mid*mid<=x){
                ans=mid;
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return ans;
    }
}
// @lc code=end

