import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(nums,res,new ArrayList<>());
        return res;
    }
    void dfs(int[] nums,List<List<Integer>> res,List<Integer> path)
    {
       if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
       }
       for(int n:nums){
            if(!path.contains(n)){
                path.add(n);
                dfs(nums, res, path);
                path.remove(path.size()-1);
            }
            
       }

    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         dfs(res,new ArrayList<>(),nums);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,List<Integer> list,int[] nums){
//         if(list.size()==nums.length){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         for(int n:nums){
//             if(!list.contains(n)){
//                 list.add(n);
//                 dfs(res,list,nums);
//                 list.remove(list.size()-1);
//             }
            
         
//         }

//     }
// }

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> res=new ArrayList<>();
//         dfs(res,new ArrayList<>(),nums);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,List<Integer> list,int[] nums){
//         if(list.size()==nums.length){
//             res.add(list);
//             return;
//         }
//         for(int n:nums){
//             if(!list.contains(n)){
//                 list.add(n);
//                 dfs(res,new ArrayList<>(list),nums);
//                 list.remove(list.size()-1);
//             }
            
         
//         }

//     }
// }