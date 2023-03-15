import java.util.stack;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> stack=new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node =stack.pop();
            res.add(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return res; 
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         List<Integer> res=new LinkedList<>();
//         dfs(root,res);
//         return res;
//     }
//     void dfs(TreeNode root,List<Integer> res){
//         if(root==null){
//             return;
//         }

//         res.add(root.val);
//         if(root.left!=null){
//             dfs(root.left, res);
//         }
//         if(root!=null){
//             dfs(root.right, res);
//         }
//     }
// }