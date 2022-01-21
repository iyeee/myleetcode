import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=938 lang=java
 *
 * [938] 二叉搜索树的范围和
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


// @lc code=end


// Solution1:
// class Solution {
//     int sum;
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         sum=0;
//         dfs(root,low,high);
//         return sum;
//     }
//     void dfs(TreeNode node,int low,int high){
//         if(node==null){
//             return;
//         }
//         if(node.val>=low&&node.val<=high){
//             sum+=node.val;
//         }
//         if(node.val>=low){
//         dfs(node.left,low,high);
//         }
//         if(node.val<=high){
//         dfs(node.right,low,high);
//         }

//     }

// }


// 官解
// Solution2:
// class Solution {
//     public int rangeSumBST(TreeNode root, int low, int high) {
//         if (root == null) {
//             return 0;
//         }
//         if (root.val > high) {
//             return rangeSumBST(root.left, low, high);
//         }
//         if (root.val < low) {
//             return rangeSumBST(root.right, low, high);
//         }
//         return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
//     }
// }
