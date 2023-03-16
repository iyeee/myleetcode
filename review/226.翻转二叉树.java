import java.util.*;

import javax.swing.tree.TreeNode;;
/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        Deque<TreeNode> stack=new ArrayDeque<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            TreeNode tmp=node.left;
            node.left=node.right;
            node.right=tmp;
            if(node.left!=null) stack.push(node.left);
            if(node.right!=null) stack.push(node.right);
            
        }
        return root;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root==null){
//             return root;
//         }
//         TreeNode tmp=root.left;
//         root.left=root.right;
//         root.right=tmp;
//         invertTree(root.right);
//         invertTree(root.left);
//         return root;
//     }
// }


// Solution2:
// class Solution {
//     public TreeNode invertTree(TreeNode root) {
//         if(root==null){
//             return root;
//         }
//         Deque<TreeNode> stack=new ArrayDeque<>();
//         stack.push(root);
//         while(!stack.isEmpty()){
//             TreeNode node=stack.pop();
//             TreeNode tmp=node.left;
//             node.left=node.right;
//             node.right=tmp;
//             if(node.left!=null) stack.push(node.left);
//             if(node.right!=null) stack.push(node.right);
            
//         }
//         return root;
//     }
// }
