import java.util.Arrays;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 */

// @lc code=start
class Solution {
    public int[] sortArray(int[] nums) {
        for(int i=1;i<nums.length;i++){
            int insertNum=nums[i];
            int j=i-1;
            while(j>=0&&nums[j]>insertNum){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=insertNum;
        }
        return nums;
    }
}
// @lc code=end

// 快排
// class Solution {
//     public static final Random RANDOM=new Random(System.currentTimeMillis());
//     public int[] sortArray(int[] nums) {
//         quickSort(nums, 0, nums.length-1);
//         return nums;
//     }
//     static void  quickSort(int[] arr,int left,int right){
//         if(left>right){
//             return;
//         }
//         int index=RANDOM.nextInt(right-left+1)+left;
//         swap(arr, index, left);
//         int tmp=arr[left];
//         int i=left,j=right;
//         while(i<j){
//             while(arr[j]>=tmp&&i<j){
//                 j--;
//             }
//             while(arr[i]<=tmp&&i<j){
//                 i++;
//             }
//             if(i<j){
//                 swap(arr, i, j);
//             }
//         }
//         arr[left]=arr[i];
//         arr[i]=tmp;
//         quickSort(arr, left, i-1);
//         quickSort(arr, i+1, right);
//     }
//     static void swap(int[] nums, int index1, int index2) {
//         int temp = nums[index1];
//         nums[index1] = nums[index2];
//         nums[index2] = temp;
//     }
// }

// 冒泡
// Solution2:
// class Solution {
    
//     public int[] sortArray(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             boolean flag=false;
//             for(int j=0;j<nums.length-i-1;j++){
//                 if(nums[j]>nums[j+1]){
//                     swap(nums, j, j+1);
//                     flag=true;
//                 }
//             }
//             if(!flag)break;
//         }
//         return nums;
//     }
//     private void swap(int[] nums, int index1, int index2) {
//         int temp = nums[index1];
//         nums[index1] = nums[index2];
//         nums[index2] = temp;
//     }
// }

// Solution3:
// class Solution {
//     public int[] sortArray(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int min=nums[i];
//             int index=i;
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[j]<min){
//                     min=nums[j];
//                     index=j;
//                 }           
//             }
//             swap(nums, i, index);
//         }
//         return nums;
//     }
//     private void swap(int[] nums, int index1, int index2) {
//         int temp = nums[index1];
//         nums[index1] = nums[index2];
//         nums[index2] = temp;
//     }
// }


// Solution4：
// 插排
// class Solution {
//     public int[] sortArray(int[] nums) {
//         for(int i=1;i<nums.length;i++){
//             int insertNum=nums[i];
//             int j=i-1;
//             while(j>=0&&nums[j]>insertNum){
//                 nums[j+1]=nums[j];
//                 j--;
//             }
//             nums[j+1]=insertNum;
//         }
//         return nums;
//     }
// }