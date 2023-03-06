import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> resSet=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            if(set1.contains(n)){
                resSet.add(n);
            }
        }
        return resSet.stream().mapToInt(x->x).toArray();
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> set1=new HashSet<>();
//         Set<Integer> set2=new HashSet<>();
//         for(int n:nums1){
//             set1.add(n);
//         }
//         for(int n:nums2){
//             set2.add(n);
//         }
//         List<Integer> res=new LinkedList<>();
//         Iterator<Integer> iterator=set1.iterator();
//         while(iterator.hasNext()){
//             Integer next = iterator.next();
//             if(set2.contains(next)){
//                 res.add(next);
//             }
//         }
//         return res.stream().mapToInt(Integer::intValue).toArray();
//     }
// }

// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> set1=new HashSet<>();
//         Set<Integer> resSet=new HashSet<>();
//         for(int n:nums1){
//             set1.add(n);
//         }
//         for(int n:nums2){
//             if(set1.contains(n)){
//                 resSet.add(n);
//             }
//         }
//         return resSet.stream().mapToInt(x->x).toArray();
//     }
// }