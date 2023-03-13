import java.util.ArrayDeque;
import java.util.Deque;

/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        int ans=0;
        Deque<String> stack=new ArrayDeque<>();
        for(String s:tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int var1=Integer.parseInt(stack.pop());
                int var2=Integer.parseInt(stack.pop());
                if(s.equals("+")){
                   ans=var1+var2;
                }else if(s.equals("-")){
                   ans=var2-var1;
                }else if(s.equals("/")){
                    ans=var2/var1;
                }else if(s.equals("*")){
                    ans=var1*var2;
                }
                stack.push(String.valueOf(ans)); 
            }else{
                stack.push(s);
            }
            // System.out.println(stack);
        }
        return Integer.parseInt(stack.pop());
    }
    
}
// // @lc code=end



// Solution1:
// class Solution {
//     public int evalRPN(String[] tokens) {
//         int ans=0;
//         Deque<String> stack=new ArrayDeque<>();
//         for(String s:tokens){
//             if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
//                 int var1=Integer.parseInt(stack.pop());
//                 int var2=Integer.parseInt(stack.pop());
//                 if(s.equals("+")){
//                    ans=var1+var2;
//                 }else if(s.equals("-")){
//                    ans=var2-var1;
//                 }else if(s.equals("/")){
//                     ans=var2/var1;
//                 }else if(s.equals("*")){
//                     ans=var1*var2;
//                 }
//                 stack.push(String.valueOf(ans)); 
//             }else{
//                 stack.push(s);
//             }
//             // System.out.println(stack);
//         }
//         return Integer.parseInt(stack.pop());
//     }
    
// }