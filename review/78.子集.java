import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        dfs(res,nums,new ArrayList<>(),0);
        return res;
    }
    void dfs(List<List<Integer>> res,int[] nums,List<Integer> list,int index){
        res.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            list.add(nums[i]);
            dfs(res, nums, list,i+1);
            list.remove(list.size()-1);
        }
    }

}
// @lc code=end

// Solution1：
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> res=new LinkedList<>();
//         dfs(res,nums,new ArrayList<>(),0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] nums,List<Integer> list,int index){
//         if(index==nums.length){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         dfs(res, nums, list,index+1);
//         list.add(nums[index]);
//         dfs(res, nums, list,index+1);
//         list.remove(list.size()-1);
//     }

// }


// Solution2:
// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> res=new LinkedList<>();
//         dfs(res,nums,new ArrayList<>(),0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] nums,List<Integer> list,int index){
//         res.add(new ArrayList<>(list));
//         for(int i=index;i<nums.length;i++){
//             list.add(nums[i]);
//             dfs(res, nums, list,i+1);
//             list.remove(list.size()-1);
//         }
//     }
// }