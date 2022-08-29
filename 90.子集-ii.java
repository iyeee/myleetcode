import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=90 lang=java
 *
 * [90] 子集 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        dfs(res,nums,0,new ArrayList<>());
        return res;
    }
    void dfs(List<List<Integer>> res,int[] nums,int index,List<Integer> path){
        res.add(new ArrayList<>(path));
        for(int i=index;i<nums.length;i++){
            if(i>index&&nums[i-1]==nums[i]){
                continue;
            }
            path.add(nums[i]);
            dfs(res, nums,i+1, path);
            path.remove(path.size()-1);
        }
    }
}
// @lc code=end

// Solution1：
// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         Arrays.sort(nums);
//         boolean[] usd=new boolean[nums.length]; 
//         dfs(res,nums,0,new ArrayList<>(),usd);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] nums,int index,List<Integer> path,boolean[] usd){
//         res.add(new ArrayList<>(path));
//         for(int i=index;i<nums.length;i++){
//             if(i>0&&nums[i-1]==nums[i]&&!usd[i-1]){
//                 continue;
//             }
//             path.add(nums[i]);
//             usd[i]=true;
//             dfs(res, nums,i+1, path,usd);
//             path.remove(path.size()-1);
//             usd[i]=false;
//         }
//     }
// }


// Solution2:
// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         Arrays.sort(nums);
//         dfs(res,nums,0,new ArrayList<>());
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] nums,int index,List<Integer> path){
//         res.add(new ArrayList<>(path));
//         for(int i=index;i<nums.length;i++){
//             if(i>index&&nums[i-1]==nums[i]){
//                 continue;
//             }
//             path.add(nums[i]);
//             dfs(res, nums,i+1, path);
//             path.remove(path.size()-1);
//         }
//     }
// }