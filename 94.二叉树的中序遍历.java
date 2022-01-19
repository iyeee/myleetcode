import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.swing.border.EmptyBorder;
import javax.swing.tree.TreeNode;


/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
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
    List<Integer> list=new LinkedList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null||!stack.empty()){
            while(root!=null){
                stack.add(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root.val);
            root=root.right;
        } 
        return list;
    }
}

// @lc code=end

// Soluiton1 递归
// class Solution {
//     List<Integer> list=new LinkedList<Integer>();
//     public List<Integer> inorderTraversal(TreeNode root) {
//         dfs(root);
//         return list;
//     }
//     void dfs(TreeNode node){
//         if(node==null){
//             return;
//         }
//         dfs(node.left);
//         list.add(node.val);
//         dfs(node.right);
//     }
// }



// Solution2:
// class Solution {
//     List<Integer> list=new LinkedList<Integer>();
//     public List<Integer> inorderTraversal(TreeNode root) {
//         if(root==null){
//             return list;
//         }
//         Stack<TreeNode> stack=new Stack<>();
//         while(root!=null||!stack.empty()){
//             while(root!=null){
//                 stack.add(root);
//                 root=root.left;
//             }
//             root=stack.pop();
//             list.add(root.val);
//             root=root.right;  

//         }
//          return list;
//     }
// }