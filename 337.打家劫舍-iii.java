import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
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
    private Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (map.containsKey(root)) {
            return map.get(root);
        }
        int do_it = root.val;
        if (root.left != null) {
            do_it += rob(root.left.left) + rob(root.left.right);
        }
        if (root.right != null) {
            do_it += rob(root.right.left) + rob(root.right.right);
            // }
            // int
            // do_it=root.val+(root.left==null?0:rob(root.left.left)+rob(root.left.right))
            // +(root.right==null?0:rob(root.right.left)+rob(root.right.right));
        }
        int not_do = rob(root.left) + rob(root.right);
        int res = Integer.max(do_it, not_do);
        map.put(root, res);
        return res;

    }
}
// @lc code=end

// Solution1:
// dp dfs
// class Solution {
// private Map<TreeNode,Integer> map=new HashMap<>();
// public int rob(TreeNode root) {
// if(root==null){
// return 0;
// }
// if(map.containsKey(root)){
// return map.get(root);
// }
// // int do_it=root.val;
// // if(root.left!=null){
// // do_it+=rob(root.left.left)+rob(root.left.right);
// // }
// // if(root.right!=null){
// // do_it+=rob(root.right.left)+rob(root.right.right);
// // }
// int
// do_it=root.val+(root.left==null?0:rob(root.left.left)+rob(root.left.right))
// +(root.right==null?0:rob(root.right.left)+rob(root.right.right));

// int not_do=rob(root.left)+rob(root.right);
// int res=Integer.max(do_it,not_do);
// map.put(root, res);

// return res;
// }
// }