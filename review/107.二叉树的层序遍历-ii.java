import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            res.add(0,list);
        }
        return res;
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public List<List<Integer>> levelOrderBottom(TreeNode root) {
//         List<List<Integer>> res=new LinkedList<>();
//         if(root==null){
//             return res;
//         }
//         Deque<TreeNode> deque=new ArrayDeque<>();
//         deque.offer(root);
//         while(!deque.isEmpty()){
//             int sz=deque.size();
//             List<Integer> list=new ArrayList<>();
//             for(int i=0;i<sz;i++){
//                 TreeNode node= deque.poll();
//                 list.add(node.val);
//                 if(node.left!=null) deque.offer(node.left);
//                 if(node.right!=null) deque.offer(node.right);
                
//             }
//             res.add(list);
//         }
//         Collections.reverse(res);
//         return res;
//     }
// }