import java.util.Deque;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Deque<Character> stack=new LinkedList<>();
        for(Character ch:s.toCharArray()){
            if(ch=='{'||ch=='['||ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character ch2=stack.pop();
                if(ch=='}'&&ch2!='{'||ch==']'&&ch2!='['||ch==')'&&ch2!='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public boolean isValid(String s) {
//         if(s.length()%2!=0){
//             return false;
//         }
//         Deque<Character> stack=new LinkedList<>();
//         for(Character ch:s.toCharArray()){
//             if(ch=='{'||ch=='['||ch=='('){
//                 stack.push(ch);
//             }else{
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 Character ch2=stack.pop();
//                 if(ch=='}'&&ch2!='{'||ch==']'&&ch2!='['||ch==')'&&ch2!='('){
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }