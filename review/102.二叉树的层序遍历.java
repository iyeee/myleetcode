import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 */

import javax.swing.tree.TreeNode;

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> deque=new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int sz=deque.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<sz;i++){
                TreeNode node= deque.poll();
                list.add(node.val);
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
            }
            res.add(list);
        }
        return res;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> res=new LinkedList<>();
//         if(root==null){
//             return res;
//         }
//         List<Integer> list=new LinkedList<>();
//         Queue<TreeNode> queue=new LinkedList<>();
//         queue.add(root);
//         while (!queue.isEmpty()) {
//             int sz=queue.size();
//             for(int i=0;i<sz;i++){
//                 TreeNode node=queue.remove();
//                 list.add(node.val);
//                 if(node.left!=null){
//                     queue.add(node.left);
//                 }
//                 if(node.right!=null){
//                     queue.add(node.right);
//                 }
//             }
//             res.add(new LinkedList<>(list));
//             list.clear();
//         }
//         return res;
//     }
// }