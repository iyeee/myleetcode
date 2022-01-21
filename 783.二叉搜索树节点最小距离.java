import java.util.Stack;

import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=783 lang=java
 *
 * [783] 二叉搜索树节点最小距离
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
    public int minDiffInBST(TreeNode root) {
        int min=Integer.MAX_VALUE;
        int pre=-1;
        Stack<TreeNode> stack=new Stack<>();
        while(!stack.empty()||root!=null){
            while(root!=null){
                stack.add(root);
                root=root.left;
            }
            root=stack.pop();
            if(pre==-1){
                pre=root.val;
            }else{
                min=Math.min(min, root.val-pre); 
                pre=root.val;                
            }
            root=root.right;
        }
        return min;
    }
}
// @lc code=end

// Solution1:
// 递归
// class Solution {
//     int pre;
//     int min;
//     public int minDiffInBST(TreeNode root) {
//         pre=-1;
//         min=Integer.MAX_VALUE;
//         dfs(root);
//         return min;
//     }
//     void dfs(TreeNode node){
//         if(node==null){
//             return;
//         }
//         dfs(node.left);
//         if(pre==-1){
//             pre=node.val;
//         }else{
//             min=Math.min(min,node.val-pre);
//             pre=node.val;
//         }
//         dfs(node.right);
    
//     }
// }



// Soluiton2
// 迭代
// class Solution {
//     public int minDiffInBST(TreeNode root) {
//         int min=Integer.MAX_VALUE;
//         int pre=-1;
//         Stack<TreeNode> stack=new Stack<>();
//         while(!stack.empty()||root!=null){
//             while(root!=null){
//                 stack.add(root);
//                 root=root.left;
//             }
//             root=stack.pop();
//             if(pre==-1){
//                 pre=root.val;
//             }else{
//                 min=Math.min(min, root.val-pre); 
//                 pre=root.val;                
//             }
//             root=root.right;
//         }
//         return min;
//     }
// }