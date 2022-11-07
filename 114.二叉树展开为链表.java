
/*
 * @lc app=leetcode.cn id=114 lang=java
 *
 * [114] 二叉树展开为链表
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
    private TreeNode last=null;
    public void flatten(TreeNode root) {
        if(root==null) {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right=last;
        root.left=null;
        last=root;
      }
}
// @lc code=end

// Solution1:
// class Solution {
//     TreeNode pre=new TreeNode();
//     public void flatten(TreeNode root) {
//         if(root==null){
//             return;
//         }
//         pre.right=root;
//         pre.left=null;
//         pre=root;
//         TreeNode temp=root.right;
//         flatten(root.left);
//         flatten(temp);
//     }

// }



// Solution2
// 右左根
// class Solution {
//     private TreeNode last=null;
//     public void flatten(TreeNode root) {
//         if(root==null) {
//             return;
//         }
//         flatten(root.right);
//         flatten(root.left);
//         root.right=last;
//         root.left=null;
//         last=root;
//       }
// }