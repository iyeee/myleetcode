/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        return height(root)>=0;
    }
    int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        if(leftHeight==-1||rightHeight==-1||Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }else{
            return 1+Integer.max(height(node.left),height(node.right));
        }
        
    }
}
// @lc code=end


// Solution1:
// 方法一：自顶向下的递归，因此对于同一个节点，函数 height 会被重复调用，导致时间复杂度较高。
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root==null){
//             return true;
//         }else{
//             return Math.abs(getHeight(root.left)-getHeight(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right);
//         }
//     }
//     int getHeight(TreeNode node){
//         if(node==null){
//             return 0;
//         }
//         return 1+Integer.max(getHeight(node.left), getHeight(node.right));
        
//     }
// }

// Solution2：
// 使用自底向上的做法，则对于每个节点，函数 height 只会被调用一次。