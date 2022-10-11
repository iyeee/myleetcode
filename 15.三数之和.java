import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res=new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1,r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum>0){
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    List<Integer> arr=new LinkedList<>();
                    arr.add(nums[i]);
                    arr.add(nums[l]);
                    arr.add(nums[r]);
                    res.add(arr);
                    while(l<r&&nums[r-1]==nums[r]){
                        r--;
                    }
                    while(l<r&&nums[l+1]==nums[l]){
                        l++;
                    }
                    r--;
                    l++;
                }
            }
        }
        
        return res;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
        
//         Set<List<Integer>> set=new HashSet<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-2;i++){
//             int l=i+1,r=nums.length-1;
//             while(l<r){
//                 int sum=nums[i]+nums[l]+nums[r];
//                 if(sum>0){
//                     r--;
//                 }else if(sum<0){
//                     l++;
//                 }else{
//                     List<Integer> arr=new LinkedList<>();
//                     arr.add(nums[i]);
//                     arr.add(nums[l]);
//                     arr.add(nums[r]);
//                     set.add(arr);
//                     r--;
//                     l++;
//                 }
//             }
//         }
//         List<List<Integer>> res=new LinkedList<>(set);
//         return res;
//     }
// }

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
        
//         List<List<Integer>> res=new LinkedList<>();
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-2;i++){
//             if(i>0&&nums[i]==nums[i-1]){
//                 continue;
//             }
//             int l=i+1,r=nums.length-1;
//             while(l<r){
//                 int sum=nums[i]+nums[l]+nums[r];
//                 if(sum>0){
//                     r--;
//                 }else if(sum<0){
//                     l++;
//                 }else{
//                     List<Integer> arr=new LinkedList<>();
//                     arr.add(nums[i]);
//                     arr.add(nums[l]);
//                     arr.add(nums[r]);
//                     res.add(arr);
//                     while(l<r&&nums[r-1]==nums[r]){
//                         r--;
//                     }
//                     while(l<r&&nums[l+1]==nums[l]){
//                         l++;
//                     }
//                     r--;
//                     l++;
//                 }
//             }
//         }
        
//         return res;
//     }
// }