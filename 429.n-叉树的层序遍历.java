import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
           int sz=q.size();
           List<Integer> list=new ArrayList<>();
           for(int i=0;i<sz;i++){
            Node cur=q.poll();
            list.add(cur.val);
            if(cur!=null){
                for(Node n:cur.children){
                    q.add(n);
                }
            }
           }
           res.add(list);
        }        
        return res;
    }
}
// @lc code=end

