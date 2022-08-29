import java.util.LinkedList;
import java.util.Queue;
/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
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
    public int maxDepth(Node root) {
        if(root==null){
            return 0;
        }
        int maxDepth=0;
        for(Node n:root.children){
            maxDepth=Integer.max(maxDepth(n),maxDepth);
        }
        return maxDepth+1;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int maxDepth(Node root) {
//         if(root==null){
//             return 0;
//         }
//         int maxH=0;
//         Queue<Node> queue=new LinkedList<>();
//         queue.offer(root);
//         while(!queue.isEmpty()){
//             int sz=queue.size();
//             for(int i=0;i<sz;i++){
//                 Node node=queue.poll();
//                 if(node!=null){
//                     for(Node n:node.children){
//                         queue.offer(n);
//                     }
//                 }
//             }   
//             maxH++;
//         }
//         return maxH;
//     }
// }