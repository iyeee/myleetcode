

/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
//为了防止溢出，改用除法判断
class Solution {
    public int mySqrt(int x) {
        if(x==1){
            return 1;
        }
        int l=1,r=x;
        int mid=0;
        while(l<=r){
            mid=(r-l)/2+l;
            int tmp=x/mid;
            if(tmp==mid){
                return mid;
            }else if(tmp>mid){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return l;
    }
}

// @lc code=end


// solution1:
// import java.lang.Math;
// class Solution {
//     public int mySqrt(int x) {
//         return (int)Math.sqrt(x);
//     }
// }

//solution2:
// class Solution {
//     public int mySqrt(int x) {
//         if(x==1){
//             return 1;
//         }else if(x==2147483647){
//             return 46340;
//         }
//         int l=1,r=x;
//         int mid=0;
//         while(l<=r){
//             mid=(r-l)/2+l;
//             long tmp=(long)mid*mid;
//             if(tmp==x){
//                 return mid;
//             }else if(tmp<x){
//                 l=mid+1;
//             }else{
//                 r=mid-1;
//             }
//         }
//         return mid*mid>x?mid-1:mid;
//     }
// }

// solution3:
// 为了防止溢出，改用除法判断
// 向下取整，因此返回r
// class Solution {
//     public int mySqrt(int x) {
//         if(x==1){
//             return 1;
//         }
//         int l=1,r=x;
//         int mid=0;
//         while(l<=r){
//             mid=(r-l)/2+l;
//             int tmp=x/mid;
//             if(tmp==mid){
//                 return mid;
//             }else if(tmp>mid){
//                 l=mid+1;
//             }else{
//                 r=mid-1;
//             }
//         }
//         return l;
//     }
// }


// 官解
// solution4：
// class Solution {
//     public int mySqrt(int x) {
//         int l = 0, r = x, ans = -1;
//         while (l <= r) {
//             int mid = l + (r - l) / 2;
//             if ((long) mid * mid <= x) {
//                 ans = mid;
//                 l = mid + 1;
//             } else {
//                 r = mid - 1;
//             }
//         }
//         return ans;
//     }
// }