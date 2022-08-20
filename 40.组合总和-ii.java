import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=40 lang=java
 *
 * [40] 组合总和 II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        //为剪枝排序
        Arrays.sort(candidates);
        dfs(res,candidates,target,new ArrayList<>(),0);
        return res;
    }
    void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int index){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            //剪枝
            if(target-candidates[i]<0){
                break;
            }
            if(i>index&&candidates[i]==candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            dfs(res, candidates, target-candidates[i], list,i+1);
            list.remove(list.size()-1);
        }
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> res=new ArrayList<>();
//         //为剪枝排序
//         Arrays.sort(candidates);
//         boolean[] used=new boolean[candidates.length];
//         dfs(res,candidates,target,new ArrayList<>(),-1,used);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int index,boolean[] used){
//         if(target==0){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         for(int i=index+1;i<candidates.length;i++){
//             //剪枝
//             if(target-candidates[i]<0){
//                 break;
//             }
//             if(i>0&&candidates[i]==candidates[i-1]&&!used[i-1]){
//                 continue;
//             }
//             list.add(candidates[i]);
//             used[i]=true;
//             dfs(res, candidates, target-candidates[i], list,i,used);
//             list.remove(list.size()-1);
//         }
//     }
// }


//Solution2：
// class Solution {
//     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//         List<List<Integer>> res=new ArrayList<>();
//         //为剪枝排序
//         Arrays.sort(candidates);
//         dfs(res,candidates,target,new ArrayList<>(),0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int[] candidates,int target,List<Integer> list,int index){
//         if(target==0){
//             res.add(new ArrayList<>(list));
//             return;
//         }
//         for(int i=index;i<candidates.length;i++){
//             //剪枝
//             if(target-candidates[i]<0){
//                 break;
//             }
//             if(i>0&&candidates[i]==candidates[i-1]&&i>index){
//                 continue;
//             }
//             list.add(candidates[i]);
//             dfs(res, candidates, target-candidates[i], list,i+1);
//             list.remove(list.size()-1);
//         }
//     }
// }