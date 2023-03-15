import java.util.*;
import java.util.Map.Entry;
/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */
// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((o1,o2)->o2[1]-o1[1]);
        Set<Entry<Integer, Integer>> entries=map.entrySet();
        for(Entry<Integer,Integer> entry:entries){
            priorityQueue.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        int[] res=new int[k];
        for(int j=0;j<k;j++){
            res[j]=priorityQueue.poll()[0];
        }
        return res;
    }
}
// @lc code=end

// Solution1：
// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int n:nums){
//             map.put(n, map.getOrDefault(n, 0)+1);
//         }
//         PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((o1,o2)->o2[1]-o1[1]);
//         for(Integer nInteger:map.keySet()){
//             priorityQueue.offer(new int[]{nInteger,map.get(nInteger)});
//         }
//         int[] res=new int[k];
//         for(int j=0;j<k;j++){
//             res[j]=priorityQueue.poll()[0];
//         }
//         return res;
//     }
// }