import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> deque=new LinkedList<>();
        
        deque.offer(root.left);
        deque.offer(root.right);
        while(!deque.isEmpty()){
            TreeNode leftNode=deque.poll();
            TreeNode rightNode=deque.poll();
            if(leftNode==null&&rightNode==null){
                continue;
            }
            if(leftNode==null||rightNode==null||leftNode.val!=rightNode.val){
                return false;
            }
            deque.offer(leftNode.left);
            deque.offer(rightNode.right);
            deque.offer(leftNode.right);
            deque.offer(rightNode.left);
        }
        return true;
    }
}
// @lc code=end


// Solution
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if(root==null) return true;
//         return compare(root.left,root.right);
//     }
//     boolean compare(TreeNode left,TreeNode right){
//         if(left==null&&right==null) return true;
//         else if(left==null&&right!=null) return false;
//         else if(left!=null&&right==null) return false;
//         else if(left.val!=right.val) return false;
//         return compare(left.left, right.right)&&compare(left.right, right.left);
//     }
// }


// Solution2:
// 使用new ArrayDeque<>()报错
// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         Queue<TreeNode> deque=new LinkedList<>();
//         deque.offer(root.left);
//         deque.offer(root.right);
//         while(!deque.isEmpty()){
//             TreeNode leftNode=deque.poll();
//             TreeNode rightNode=deque.poll();
//             if(leftNode==null&&rightNode==null){
//                 continue;
//             }
//             if(leftNode==null||rightNode==null||leftNode.val!=rightNode.val){
//                 return false;
//             }
//             deque.offer(leftNode.left);
//             deque.offer(rightNode.right);
//             deque.offer(leftNode.right);
//             deque.offer(rightNode.left);
//         }
//         return true;
//     }
// }