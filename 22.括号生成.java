import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        dfs(res,"",n,n);
        return res;
    }    
    void dfs(List<String> res,String str,int left,int right){
        if(left==0&&right==0){
            res.add(str);
            return;
        }
       if(left>0){
            dfs(res, str+"(", left-1, right);
       }
       if(right>left){
            dfs(res, str+")", left, right-1);
       }

    }
}
// @lc code=end
// Solution1:
// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> res=new ArrayList<>();
//         if(n==0){
//             return res;
//         }
//         dfs("",n,n,res);
//         return res;
//     }
//     void dfs(String str,int left,int right,List<String> res){
//         if(left==0&&right==0){
//             res.add(str);
//             return;
//         }
//         if(left>right){
//             return;
//         }
//         if(left>0){
//             dfs(str+"(",left-1,right,res);
//         }
//         if(right>0){
//             dfs(str+")",left,right-1,res);
//         }
//     }
// }


// Solution2:
// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> res=new ArrayList<>();
//         dfs(res,"",n,n);
//         return res;
//     }    
//     void dfs(List<String> res,String str,int left,int right){
//         if(left==0&&right==0){
//             res.add(str);
//             return;
//         }
//        if(left>0){
//             String tmp= str;
//             str+="(";
//             left--;
//             dfs(res, str, left, right);
//             left++;
//             str=tmp;
//        }
//        if(right>left){
//             String tmp=str;
//             str+=")";
//             right--;
//             dfs(res, str, left, right);
//             right++;
//             str=tmp;
//        }

//     }
// }

// class Solution {
//     public List<String> generateParenthesis(int n) {
//         List<String> res=new ArrayList<>();
//         dfs(res,"",n,n);
//         return res;
//     }    
//     void dfs(List<String> res,String str,int left,int right){
//         if(left==0&&right==0){
//             res.add(str);
//             return;
//         }
//        if(left>0){
//             dfs(res, str+"(", left-1, right);
//        }
//        if(right>left){
//             dfs(res, str+")", left, right-1);
//        }

//     }
// }