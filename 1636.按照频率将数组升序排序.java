import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 */

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> list = new LinkedList<>();
        for (int num : nums) {
            list.add(num);
        }
        Collections.sort(list, ((a, b) -> {
            int cnt1 = map.get(a), cnt2 = map.get(b);
            return cnt1 != cnt2 ? cnt1 - cnt2 : b - a;
        }));
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}
// @lc code=end
