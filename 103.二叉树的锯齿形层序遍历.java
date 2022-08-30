import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = true;
        while (!queue.isEmpty()) {
            int sz = queue.size();
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < sz; i++) {
                TreeNode node = queue.poll();
                if(flag){
                    deque.offerLast(node.val);
                }else{
                    deque.offerFirst(node.val);
                }
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            flag = !flag;
            res.add(new LinkedList<>(deque));
        }
        return res;
    }
}
// @lc code=end

// Solution1:
// 反转list
// class Solution {
// public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
// List<List<Integer>> res = new LinkedList<>();
// if (root == null) {
// return res;
// }
// Queue<TreeNode> queue = new LinkedList<>();
// queue.offer(root);
// boolean even = false;
// while (!queue.isEmpty()) {
// int sz = queue.size();
// List<Integer> list = new LinkedList<>();

// for (int i = 0; i < sz; i++) {
// TreeNode node = queue.poll();
// list.add(node.val);
// if(node.left!=null){
// queue.offer(node.left);
// }
// if(node.right!=null){
// queue.offer(node.right);
// }
// }
// if(even){
// Collections.reverse(list);
// }
// even = !even;
// res.add(list);
// }
// return res;
// }
// }

// Solution2:
// Deque双端队列
// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         List<List<Integer>> res = new LinkedList<>();
//         if (root == null) {
//             return res;
//         }
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
//         boolean flag = true;
//         while (!queue.isEmpty()) {
//             int sz = queue.size();
//             Deque<Integer> deque = new LinkedList<>();

//             for (int i = 0; i < sz; i++) {
//                 TreeNode node = queue.poll();
//                 if(flag){
//                     deque.offerLast(node.val);
//                 }else{
//                     deque.offerFirst(node.val);
//                 }
//                 if(node.left!=null){
//                     queue.offer(node.left);
//                 }
//                 if(node.right!=null){
//                     queue.offer(node.right);
//                 }
//             }
//             flag = !flag;
//             res.add(new LinkedList<>(deque));
//         }
//         return res;
//     }
// }