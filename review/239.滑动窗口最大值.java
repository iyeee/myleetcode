import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((o1,o2)->o2-o1);
        int len=nums.length;
        int[] res=new int[len-k+1];
        for(int i=0;i<k;i++){
            priorityQueue.add(nums[i]);
            
        }
        int index=1;
        for(int i=0;i<len-k;i++){
            
            res[i]=priorityQueue.peek();
            if(nums[i+k]==res[i]){
                if(index==0){
                    index=2;
                }else{
                    index++;
                }
            }
            priorityQueue.add(nums[i+k]);
            while(index--!=0&&nums[i]==res[i]){
                priorityQueue.remove();
            }
           
        }
        res[len-k]=priorityQueue.peek();
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