import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=1047 lang=java
 *
 * [1047] 删除字符串中的所有相邻重复项
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack=new ArrayDeque<>();
        StringBuilder stringBuilder=new StringBuilder();
        for(char c:s.toCharArray()){
            if(stack.isEmpty()||stack.peek()!=c){
                stack.push(c);
                stringBuilder.append(c);
            }else{
                stack.pop();
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
        return stringBuilder.toString();
    }
}
// @lc code=end


Solution1:

