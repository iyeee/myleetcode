import java.rmi.server.RemoteStub;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=933 lang=java
 *
 * [933] 最近的请求次数
 */

// @lc code=start
class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue=new LinkedList<>();
    }
    public int ping(int t) {
        queue.add(t);
        while(queue.peek()<t-3000){
            queue.poll();
        }
        return queue.size(); 
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end


// Solution1:
// 超时
// class RecentCounter {
//     List<Integer> pinsList;
//     public RecentCounter() {
//         pinsList=new LinkedList<>();
//     }
    
//     public int ping(int t) {
//         pinsList.add(t);
//         int count=0;
//         for(int index=pinsList.size()-1;index>=0;index--){
//             if(pinsList.get(index)>=t-3000){
//                 count++;
//             }
//         }
//         return count;
//     }
// }


// solution2：
// 超时 68/68 cases passed(N/A) Time Limit Exceeded
// class RecentCounter {
//     Map<Integer,Integer> map;
//     int count;
//     int pre;
//     public RecentCounter() {
//         map=new HashMap<>();
//         count=0;
//     }
    
//     public int ping(int t) {
//         pre=count;
//         int l=0;
//         map.put(t, count++);
//         l=pre;
//         for(int i=t-3000;i<t;i++){
//             if(map.containsKey(i)){
//                 l=map.get(i);
//                 break;
//             }
//         }
//         return pre-l+1;
//     }
// }


// 用队列
// Solution3:
// class RecentCounter {
//     Queue<Integer> queue;
//     public RecentCounter() {
//         queue=new LinkedList<>();
//     }
//     public int ping(int t) {
//         queue.add(t);
//         while(queue.peek()<t-3000){
//             queue.poll();
//         }
//         return queue.size(); 
//     }
// }