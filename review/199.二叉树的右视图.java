import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Deque<TreeNode> deque=new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int sz=deque.size();
            for(int i=0;i<sz;i++){
                TreeNode node= deque.poll();
                if(node.left!=null) deque.offer(node.left);
                if(node.right!=null) deque.offer(node.right);
                if(i==sz-1){
                    res.add(node.val);
                }
            }
        }
        return res;

    }
}
// @lc code=end

