import java.util.Deque;
import java.util.LinkedList;
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存
 */

// @lc code=start
class LRUCache {
    Deque<Pair> deque;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        deque=new LinkedList<>();
    }
    
    public int get(int key) {
        for(int k:deque){
            if(k==key){
                return ;
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(get)
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

