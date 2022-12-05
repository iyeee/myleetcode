import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new LinkedList<>();
        dfs(n,n,res,"");
        return res;
    }
    void dfs(int left,int right,List<String> list,String str){
        // System.out.println(left+" "+right+" "+str);
        if(left==0&&right==0){
            list.add(str);
            return;
        }
        if(right<left){
            return;
        }
        if(left>0){
            dfs(left-1, right, list, str+"(");
        }
        if(right>0){
            dfs(left,right-1, list, str+")");
        }
    }
}
// @lc code=end

// S2.1:
// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> res=new LinkedList<>();
//         dfs(n,n,res,"");
//         return res;
//     }
//     void dfs(int left,int right,List<String> list,String str){
//         // System.out.println(left+" "+right+" "+str);
//         if(left==0&&right==0){
//             list.add(str);
//             return;
//         }
//         if(right<left){
//             return;
//         }
//         if(left>0){
//             dfs(--left, right, list, str+"(");
//             left++;
//         }
//         if(right>0){
//             dfs(left,--right, list, str+")");
//             right++;
//         }
//     }
// }
// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> res=new LinkedList<>();
//         dfs(n,n,res,"");
//         return res;
//     }
//     void dfs(int left,int right,List<String> list,String str){
//         // System.out.println(left+" "+right+" "+str);
//         if(left==0&&right==0){
//             list.add(str);
//             return;
//         }
//         if(right<left){
//             return;
//         }
//         if(left>0){
//             dfs(left-1, right, list, str+"(");
//         }
//         if(right>0){
//             dfs(left,right-1, list, str+")");
//         }
//     }
// }