import java.time.Period;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> priorityQueue=new PriorityQueue<>((o1,o2)->o1[0]!=o2[0]?o2[0]-o1[0]:o2[1]-o1[1]);
        int len=nums.length;
        int[] res=new int[len-k+1];
        for(int i=0;i<k;i++){
            priorityQueue.offer(new int[]{nums[i],i});
        }
        res[0]=priorityQueue.peek()[0];
        for(int i=k;i<len;i++){
            priorityQueue.offer(new int[]{nums[i],i});
            while(priorityQueue.peek()[1]<=i-k){
                priorityQueue.poll();
            }
            res[i-k+1]=priorityQueue.peek()[0];
        }
        return res;
    }
}
// @lc code=end



// Wrong Solution1:
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((o1,o2)->o2-o1);
//         int len=nums.length;
//         int[] res=new int[len-k+1];
//         for(int i=0;i<k;i++){
//             priorityQueue.add(nums[i]);
            
//         }
//         for(int i=0;i<len-k;i++){
            
//             res[i]=priorityQueue.peek();
//             priorityQueue.remove(nums[i]);
//             priorityQueue.add(nums[i+k]);
//         }
//         res[len-k]=priorityQueue.peek();
//         return res;
//     }
// }