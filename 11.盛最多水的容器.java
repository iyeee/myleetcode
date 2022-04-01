/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int left=0,right=height.length-1,h=0;
        while(left<right){
            if(height[left]<height[right]){
                h=height[left++];
            }else{
                h=height[right--];
               
            }
            ans=Integer.max(ans, h*(right-left+1));
        }
        return ans;
    }
}
// @lc code=end

