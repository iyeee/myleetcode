import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=897 lang=java
 *
 * [897] 递增顺序搜索树
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
    TreeNode pre,newRoot;
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return newRoot;
    }
    void dfs(TreeNode node){
        if(node==null){
            return;
        }
        dfs(node.left);
        if(pre==null){
            newRoot=pre=node;

        }else{
            node.left=null;
            pre.right=node;
            pre=node;
        }

        dfs(node.right);
    }
}

// @lc code=end


// Solution1:
// class Solution {
//     TreeNode pre,newRoot;
//     public TreeNode increasingBST(TreeNode root) {
//         dfs(root);
//         return newRoot;
//     }
//     void dfs(TreeNode node){
//         if(node==null){
//             return;
//         }
//         dfs(node.left);
//         if(pre==null){
//             newRoot=pre=node;

//         }else{
//             node.left=null;
//             pre.right=node;
//             pre=node;
//         }

//         dfs(node.right);
//     }
// }



// Solution2:
// class Solution {
//     private  TreeNode resNode;
//     public TreeNode increasingBST(TreeNode root) {
//         TreeNode dummyNode=new TreeNode(-1);
//         resNode=dummyNode;    
//         inorder(root);
//         return dummyNode.right;
//     }
//     public void inorder(TreeNode node){
//         if(node==null){
//             return;
//         }
//         inorder(node.left);         
//         resNode.right=node;
//         node.left=null;
//         resNode=node;
//         inorder(node.right);
//     }
// }