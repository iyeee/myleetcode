import java.util.Deque;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new LinkedList<>();
        if(root==null){
            return res;
        }
        Deque<Node> deque=new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int sz=deque.size();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<sz;i++){
                Node node= deque.poll();
                list.add(node.val);
                for(Node child:node.children){
                    deque.offer(child);
                }      
                
            }
            res.add(list);
        }
        return res;
    }
}
// @lc code=end

