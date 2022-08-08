import java.util.HashMap;
import java.util.Map;
/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
class Solution {
    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
    public int numTrees(int n) {
        if(n==0||n==1){
            return 1;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int count=0;
        for(int i=1;i<=n;i++){
            int left=numTrees(i-1);
            int right=numTrees(n-i);
            count+=left*right;
        }
        map.put(n,count);
        return count;
    }
}
// @lc code=end

