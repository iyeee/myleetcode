/*
 * @lc app=leetcode.cn id=278 lang=java
 *
 * [278] 第一个错误的版本
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,r=n;
        while(l<=r){
            int mid=((r-l)>>1)+l;
            if(l==r){
                return l;
            }
            if(super.isBadVersion(mid)){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
// @lc code=end


// Solution1:
// 很慢
// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         if(super.isBadVersion(1)){
//             return 1;
//         }

//         int l=2,r=n;
//         while(l<=r){
//             int mid=(r-l)/2+l;
//             if(!super.isBadVersion(mid-1)&&super.isBadVersion(mid)){
//                 return mid;
//             }else if(super.isBadVersion(mid-1)){
//                 r=mid-1;
//             }else{
//                 l=mid+1;
//             }
//         }
//         return -1;
//     }
// }


// Solution2:
// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int l=1,r=n;
//         while(l<r){
//             int mid=(r-l)/2+l;
//             if(super.isBadVersion(mid)){
//                 r=mid;
//             }else{
//                 l=mid+1;
//             }
//         }
//         return l;
//     }
// }

// 1.除以2改成>>
// 2.可把循环条件改成l<=r,l==r时return
// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int l=1,r=n;
//         while(l<=r){
//             int mid=(r-l)>>1+l;
//             if(l==r){
//                 return l;
//             }
//             if(super.isBadVersion(mid)){
//                 r=mid;
//             }else{
//                 l=mid+1;
//             }
//         }
//         return l;
//     }
// }