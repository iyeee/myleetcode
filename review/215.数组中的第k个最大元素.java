import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=215 lang=java
 *
 * [215] 数组中的第K个最大元素
 */

// @lc code=start
class Solution {
    private final static Random RANDOM=new Random(System.currentTimeMillis());
    public int findKthLargest(int[] nums, int k) {
        int len=nums.length;
        int target=len-k;
        int left=0;
        int right=len-1;
        while(true){
            int pivotIndex=partition(nums, left, right);
            if(pivotIndex==target){
                return nums[pivotIndex];
            }else if(pivotIndex<target){
                left=pivotIndex+1;
            }else{
                right=pivotIndex-1;
            }
        }
    }

    private int partition(int[] nums,int left,int right){
        int randomIndex=left+RANDOM.nextInt(right-left+1);
        swap(nums, left, randomIndex);
        int pivot=nums[left];
        int le=left+1;
        int ge=right;
        while(true){
            while(le<=ge&&nums[le]<pivot){
                le++;
            }
            while(le<=ge&&nums[ge]>pivot){
                ge--;
            }
            if(le>=ge){
                break;
            }
            swap(nums, le,ge);
            le++;
            ge--;
        }
        swap(nums, left, ge);
        return ge;
    }

    private void swap(int[] nums,int index1,int index2){
        int tmp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=tmp;
    }
}
// @lc code=end

// Solution1:
// Your runtime beats 20.06 % of java submissions
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((o1,o2)->o2-o1);
//         for(int n:nums){
//             priorityQueue.offer(n);
//         }
//         int res=0;
//         while(k--!=0){
//             res=priorityQueue.poll();
//         }
//         return res;
//     }
// }

// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
//         for(int n:nums){
//             priorityQueue.offer(n);
//             if(priorityQueue.size()>k){
//                 priorityQueue.poll();
//             }
//         }    
//         return priorityQueue.peek();
//     }
// }

// Solution2:
// Your runtime beats 55.26 % of java submissions
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         Arrays.sort(nums);
//         return nums[nums.length-k];
//     }
// }


// Solution3:
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int len=nums.length;
//         PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(k,(o1,o2)->o1-o2);
//         for(int i=0;i<k;i++){
//             priorityQueue.offer(nums[i]);
//         }
//         for(int i=k;i<nums.length;i++){
//             if(nums[i]>priorityQueue.peek()){
//                 priorityQueue.poll();
//                 priorityQueue.offer(nums[i]);
//             }
//         }
//         return priorityQueue.peek();
//     }
// }