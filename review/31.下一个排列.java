import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        if(len<=1){
            return;
        }
        int i=len-2,j=len-1;
        while(nums[i]>=nums[j]){
            i--;
            j--;
            if(i==-1){
                reserve(nums, 0, len-1);
                return;
            }
        }
        int k;
        for(k=len-1;k>i;k--){
            if(nums[k]>nums[i]){
                break;
            }
        }
        swap(nums, k, i);
        reserve(nums, j, len-1);
        return;
        
    }
    void reserve(int[] nums,int i,int j){
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }
}
// @lc code=end


// [j,end]必然倒数，因此无需排序，只需逆置
// Solution1:
// class Solution {
//     public void nextPermutation(int[] nums) {
//         int len=nums.length;
//         if(len==1){
//             return;
//         }
//         if(len==2){
//             swap(nums, 0, 1);
//             return;
//         }
//         int i=len-2,j=len-1;
//         while(nums[i]>=nums[j]){
//             i--;
//             j--;
//             if(i==-1){
//                 sort(nums, 0, len-1);
//                 return;
//             }
//         }
//         if(j==len-1){
//             swap(nums, i, j);
//             return;
//         }
//         for(int k=len-1;k>0;k--){
//             if(nums[k]>nums[i]){
//                 swap(nums, k, i);
//                 sort(nums, j, len-1);
//                 return;
//             }
//         }
        
//     }
//     void sort(int[] nums,int i,int j){
//         for(int m=i;m<j;m++){
//             int index=m;
//             for(int n=m+1;n<=j;n++){
//                 if(nums[n]<nums[index]){
//                     index=n;
//                 }
//                 swap(nums, index, m);
//             }
//         }
//     }
//     void swap(int[] nums,int i,int j){
//         int tmp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=tmp;
//     }
// }


// Solution2:
// class Solution {
//     public void nextPermutation(int[] nums) {
//         int len=nums.length;
//         if(len<=1){
//             return;
//         }
//         int i=len-2,j=len-1;
//         while(nums[i]>=nums[j]){
//             i--;
//             j--;
//             if(i==-1){
//                 reserve(nums, 0, len-1);
//                 return;
//             }
//         }
//         int k;
//         for(k=len-1;k>i;k--){
//             if(nums[k]>nums[i]){
//                 break;
//             }
//         }
//         swap(nums, k, i);
//         reserve(nums, j, len-1);
//         return;
        
//     }
//     void reserve(int[] nums,int i,int j){
//         while(i<j){
//             swap(nums, i, j);
//             i++;
//             j--;
//         }
//     }
//     void swap(int[] nums,int i,int j){
//         int tmp=nums[i];
//         nums[i]=nums[j];
//         nums[j]=tmp;
//     }
// }