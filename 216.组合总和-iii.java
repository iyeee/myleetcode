import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=216 lang=java
 *
 * [216] 组合总和 III
 */

// @lc code=start
class Solution {
	List<List<Integer>> result = new ArrayList<>();
	LinkedList<Integer> path = new LinkedList<>();

	public List<List<Integer>> combinationSum3(int k, int n) {
		backTracking(n, k, 1, 0);
		return result;
	}

	private void backTracking(int targetSum, int k, int startIndex, int sum) {
		// 减枝
		if (sum > targetSum) {
			return;
		}

		if (path.size() == k) {
			if (sum == targetSum) result.add(new ArrayList<>(path));
			return;
		}
		
		// 减枝 9 - (k - path.size()) + 1
		for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
			path.add(i);
			sum += i;
			backTracking(targetSum, k, i + 1, sum);
			//回溯
			path.removeLast();
			//回溯
			sum -= i;
		}
	}
}

// @lc code=end

// Solution1:
// iyeee
// class Solution {
//     public List<List<Integer>> combinationSum3(int k, int n){ 
//     List<List<Integer>> res=new ArrayList<>();
//         dfs(res,n,k,new ArrayList<>(),0,0);
//         return res;
//     }
//     void dfs(List<List<Integer>> res,int n,int k,List<Integer> list,int index,int sum){
//         if(index==k){
//             if(sum==n){
//             res.add(new ArrayList<>(list));
//             }
//             return;
//         }
//         int i=1;
//         if(index>0){
//             i=list.get(index-1)+1;
//         }
//         for(;i<=9;i++){
//             list.add(i);
//             sum+=i;
//             dfs(res, n, k, list, index+1,sum);
//             list.remove(list.size()-1);
//             sum-=i;
//         }


//     }
// }





// Solution2:
// class Solution {
// 	List<List<Integer>> result = new ArrayList<>();
// 	LinkedList<Integer> path = new LinkedList<>();

// 	public List<List<Integer>> combinationSum3(int k, int n) {
// 		backTracking(n, k, 1, 0);
// 		return result;
// 	}

// 	private void backTracking(int targetSum, int k, int startIndex, int sum) {
// 		// 减枝
// 		if (sum > targetSum) {
// 			return;
// 		}

// 		if (path.size() == k) {
// 			if (sum == targetSum) result.add(new ArrayList<>(path));
// 			return;
// 		}
		
// 		// 减枝 9 - (k - path.size()) + 1
// 		for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
// 			path.add(i);
// 			sum += i;
// 			backTracking(targetSum, k, i + 1, sum);
// 			//回溯
// 			path.removeLast();
// 			//回溯
// 			sum -= i;
// 		}
// 	}
// }
