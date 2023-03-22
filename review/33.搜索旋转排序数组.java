import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        List<Integer> list=new LinkedList<>();
        list.stream().filter((n)->n%2==0);
        System.out.println(list);
        
    }
}
// @lc code=end

