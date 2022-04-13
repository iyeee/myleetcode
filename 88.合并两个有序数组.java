import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,index=m+n-1;
        while(i>=0&&j>=0){
            // System.out.println(i+" "+j+" "+index);
            if(nums1[i]>=nums2[j]){
                nums1[index--]=nums1[i--];
            }else{
                nums1[index--]=nums2[j--];
            }
           
        }
        while(j>=0){
            nums1[index--]=nums2[j--];
        }
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i=m-1,j=n-1,index=m+n-1;
//         while(i>=0&&j>=0){
//             // System.out.println(i+" "+j+" "+index);
//             if(nums1[i]>=nums2[j]){
//                 nums1[index--]=nums1[i--];
//             }else{
//                 nums1[index--]=nums2[j--];
//             }
           
//         }
//         while(j>=0){
//             nums1[index--]=nums2[j--];
//         }
//     }
// }