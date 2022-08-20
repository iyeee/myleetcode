import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new LinkedList<>();
        boolean[] used=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            used[i]=false;
        }
        Arrays.sort(nums);
        dfs(res,new ArrayList<>(),nums,used);
        return res;
    }
    void dfs(List<List<Integer>> res,List<Integer> list,int[] nums,boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;

        }
        for(int i=0;i<nums.length;i++){
            if(used[i]||i>0&&nums[i-1]==nums[i]&&!used[i-1]){
               continue;
            }else{
                list.add(nums[i]);
                used[i]=true;
                dfs(res, list, nums,used);
                list.remove(list.size()-1);
                used[i]=false;
            }
        }
    }
}
// @lc code=end


// Solution1:
// 直接contains，慢（5%）
// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         List<List<Integer>> res=new LinkedList<>();
//         boolean[] used=new boolean[nums.length];
//         for(int i=0;i<nums.length;i++){
//             used[i]=false;
//         }
//         dfs(res,new ArrayList<>(),nums,used);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,List<Integer> list,int[] nums,boolean[] used){
//         if(list.size()==nums.length){
//             if(!res.contains(list)){
//             res.add(new ArrayList<>(list));
//             }
//             return;

//         }
//         for(int i=0;i<nums.length;i++){
//             if(!used[i]){
//                 list.add(nums[i]);
//                 used[i]=true;
//                 dfs(res, list, nums,used);
//                 list.remove(list.size()-1);
//                 used[i]=false;
//             }
//         }
//     }
// }

// Solution2：

// if(used[i]||i>0&&nums[i-1]==nums[i]&&!used[i-1]) 来去重


// class Solution {
//     public List<List<Integer>> permuteUnique(int[] nums) {
//         List<List<Integer>> res=new LinkedList<>();
//         boolean[] used=new boolean[nums.length];
//         for(int i=0;i<nums.length;i++){
//             used[i]=false;
//         }
//         Arrays.sort(nums);
//         dfs(res,new ArrayList<>(),nums,used);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,List<Integer> list,int[] nums,boolean[] used){
//         if(list.size()==nums.length){
//             res.add(new ArrayList<>(list));
//             return;

//         }
//         for(int i=0;i<nums.length;i++){
//             if(used[i]||i>0&&nums[i-1]==nums[i]&&!used[i-1]){
//                continue;
//             }else{
//                 list.add(nums[i]);
//                 used[i]=true;
//                 dfs(res, list, nums,used);
//                 list.remove(list.size()-1);
//                 used[i]=false;
//             }
//         }
//     }
// }