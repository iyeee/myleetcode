/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树
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
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }

}
// @lc code=end

// Solution2:
// class Solution {
// int sum = 0;

// public TreeNode convertBST(TreeNode root) {
// Deque<TreeNode> deque = new LinkedList<>();
// TreeNode node = root;
// while (!deque.isEmpty() || node != null) {
// while (node != null) {
// deque.push(node);
// node = node.right;
// }
// node = deque.pop();
// sum += node.val;
// node.val = sum;
// node = node.left;
// }
// return root;
// }
// }