import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();
            dfs(res,nums,0,new ArrayList<>());
            return res;
        }
        void dfs(List<List<Integer>> res,int[] nums,int index,List<Integer> path){
            res.add(new ArrayList<>(path));
            for(int i=index;i<nums.length;i++){ 
                path.add(nums[i]);
                dfs(res, nums,i+1, path);
                path.remove(path.size()-1);
            }
        }   
    }
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         dfs(res,nums,0,new ArrayList<>());
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] nums,int index,List<Integer> path){
//         res.add(new ArrayList<>(path));
//         for(int i=index;i<nums.length;i++){
//             path.add(nums[i]);
//             dfs(res, nums,i+1, path);
//             path.remove(path.size()-1);
//         }
//     }
// }