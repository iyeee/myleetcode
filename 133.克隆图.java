import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
/*
 * @lc app=leetcode.cn id=133 lang=java
 *
 * [133] 克隆图
 */
// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        Map<Node,Node> visited=new HashMap<>();
        Node newNode=new Node(node.val,new ArrayList<>());
        visited.put(node, newNode);
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node cur=queue.poll();
            for(Node nei:cur.neighbors){
                if(!visited.containsKey(nei)){
                    queue.add(nei);
                    visited.put(nei, new Node(nei.val,new ArrayList<>()));
                }
                visited.get(cur).neighbors.add(visited.get(nei));
            }
        }
        return visited.get(node);
    }
}
// @lc code=end
