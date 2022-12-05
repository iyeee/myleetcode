import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=1038 lang=java
 *
 * [1038] 从二叉搜索树到更大和树
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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        Deque<TreeNode> deque=new LinkedList<>();
        TreeNode node=root;
        while(!deque.isEmpty()||node!=null){
            while(node!=null){
                deque.push(node);
                node=node.right;
            }
            node=deque.pop();
            sum+=node.val;
            node.val=sum;
            node=node.left;
        }
        return root;
    }
}
// @lc code=end

// Solution1:
// 反序后序遍历
// class Solution {
//     int sum=0;
//     public TreeNode bstToGst(TreeNode root) {
//         if(root==null){
//             return null;
//         }
//         bstToGst(root.right);
//         sum+=root.val;
//         root.val=sum;
//         bstToGst(root.left);
//         return root;
//     }
// }

// class Solution {
//     int sum = 0;

//     public TreeNode bstToGst(TreeNode root) {
//         if (root != null) {
//             bstToGst(root.right);
//             sum += root.val;
//             root.val = sum;
//             bstToGst(root.left);
//         }
//         return root;
//     }
// }