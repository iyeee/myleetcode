import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

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
        Set<Node> visited=new HashSet<>();
        Node newNode=new Node(node.val,new ArrayList<>());
        Queue<Node> queue=new LinkedList<>();
        Queue<Node> newQueue=new LinkedList<>();
        queue.offer(node);
        newQueue.offer(newNode);
        while(!queue.isEmpty()){
            Node cur=queue.poll();
            visited.add(cur);
            Node newCur=newQueue.poll();
            if(cur!=null){
                for(Node n:cur.neighbors){
                    if(!visited.contains(n)){
                        queue.offer(n);
                    }
                    Node newNeighbor=new Node(n.val,new ArrayList<>());
                    newQueue.offer(newNeighbor);
                    newCur.neighbors.add(newNeighbor);
                }
            }
        }
        return newNode;
    }
}
// @lc code=end

