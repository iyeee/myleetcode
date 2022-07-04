import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=1302 lang=java
 *
 * [1302] 层数最深叶子节点的和
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
    private int total=0;
    private int maxDep=-1;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root,0);
        return total;
    }
    void dfs(TreeNode treeNode,int dep){
        if(treeNode==null){
            return;
        }
        if(dep>maxDep){
            maxDep=dep;
            total=treeNode.val;
        }else if(dep==maxDep){
            total+=treeNode.val;
        }
        dfs(treeNode.left,dep+1);
        dfs(treeNode.right, dep+1);
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int deepestLeavesSum(TreeNode root) {
//         Queue<TreeNode> queue=new LinkedList<>();
//         int res=0;
//         queue.offer(root);
//         while(!queue.isEmpty()){
//             res=0;
//             int size=queue.size();
//             for(int i=0;i<size;i++){
//                 TreeNode treeNode=queue.poll();
//                 res+=treeNode.val;
//                 if(treeNode.left!=null){
//                     queue.offer(treeNode.left);
//                 }
//                 if(treeNode.right!=null){
//                     queue.offer(treeNode.right);
//                 }
//             }
//             System.out.println(res);
//         }
//         return res;
//     }
// }



// Solution2:
// class Solution {
//     private int total=0;
//     private int maxDep=-1;
//     public int deepestLeavesSum(TreeNode root) {
//         dfs(root,0);
//         return total;
//     }
//     void dfs(TreeNode treeNode,int dep){
//         if(treeNode==null){
//             return;
//         }
//         if(dep>maxDep){
//             maxDep=dep;
//             total=treeNode.val;
//         }else if(dep==maxDep){
//             total+=treeNode.val;
//         }
//         dfs(treeNode.left,dep+1);
//         dfs(treeNode.right, dep+1);
//     }
// }