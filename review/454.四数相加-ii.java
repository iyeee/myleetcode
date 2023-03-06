import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int m:nums1){
            for(int n:nums2){
                int tmp=m+n;
                map.put(tmp, map.getOrDefault(tmp,0)+1);
            }
        }
        int res=0;
        for(int m:nums3){
            for(int n:nums4){
                int tmp=m+n;
                if(map.containsKey(-tmp)){
                    res+=map.get(-tmp);
                }
            }
        }
        return res;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int m:nums1){
//             for(int n:nums2){
//                 int tmp=m+n;
//                 map.put(tmp, map.getOrDefault(tmp,0)+1);
//             }
//         }
//         int res=0;
//         for(int m:nums3){
//             for(int n:nums4){
//                 int tmp=m+n;
//                 if(map.containsKey(-tmp)){
//                     res+=map.get(-tmp);
//                 }
//             }
//         }
//         return res;
//     }
// }