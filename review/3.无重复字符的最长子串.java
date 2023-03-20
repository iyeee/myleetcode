import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;


/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int curLen=0;
        int maxLen=0;
        Queue<Character> queue=new LinkedList<>();
        for(char c:s.toCharArray()){
            if(!queue.contains(c)){
                curLen++;
                if(curLen>maxLen){
                    maxLen=curLen;
                }
                queue.offer(c);
            }else{
                while(queue.peek()!=c){
                    queue.poll();
                }
                queue.poll();
                curLen=queue.size();
            }
        }     
        return maxLen;
    }
}
// @lc code=end

