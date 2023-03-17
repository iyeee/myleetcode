import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new LinkedList<>();
        dfs("",root,res);
        return res;
    }
    void dfs(String str,TreeNode root,List<String> res){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            res.add(str+root.val);
            return;
        }
        String tmp=str;
        str=str+root.val+"->";
        dfs(str, root.left, res);
        dfs(str, root.right, res);
        str=tmp;
        
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<String> binaryTreePaths(TreeNode root) {
//         List<String> res=new LinkedList<>();
//         dfs("",root,res);
//         return res;
//     }
//     void dfs(String str,TreeNode root,List<String> res){
//         if(root==null){
//             return;
//         }
//         if(root.left==null&&root.right==null){
//             res.add(str+root.val);
//             return;
//         }
//         String tmp=str;
//         str=str+root.val+"->";
//         dfs(str, root.left, res);
//         dfs(str, root.right, res);
//         str=tmp;
        
//     }
// }