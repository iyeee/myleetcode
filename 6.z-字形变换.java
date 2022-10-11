import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> rows = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        boolean flag = false;
        int i=0;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if(i==0 ||i==numRows-1){
                flag=!flag;
            }
            if(flag){
                i++;
            }else{
                i--;
            }
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sBuilder:rows){
            res.append(sBuilder.toString());
        }
        return res.toString();
    }
}
// @lc code=end


// Solution1
// class Solution {
//     public String convert(String s, int numRows) {
//         if (numRows < 2) {
//             return s;
//         }
//         List<StringBuilder> rows = new LinkedList<>();
//         for (int i = 0; i < numRows; i++) {
//             rows.add(new StringBuilder());
//         }
//         boolean flag = false;
//         int i=0;
//         for (char c : s.toCharArray()) {
//             rows.get(i).append(c);
//             if(i==0 ||i==numRows-1){
//                 flag=!flag;
//             }
//             if(flag){
//                 i++;
//             }else{
//                 i--;
//             }
//         }
//         StringBuilder res=new StringBuilder();
//         for(StringBuilder sBuilder:rows){
//             res.append(sBuilder.toString());
//         }
//         return res.toString();
//     }
// }

// class Solution {
//     public String convert(String s, int numRows) {
//         if (numRows < 2) {
//             return s;
//         }
//         List<StringBuilder> rows = new LinkedList<>();
//         for (int i = 0; i < numRows; i++) {
//             rows.add(new StringBuilder());
//         }
//         int flag = -1;
//         int i=0;
//         for (char c : s.toCharArray()) {
//             rows.get(i).append(c);
//             if(i==0 ||i==numRows-1){
//                 flag=-flag;
//             }
//             i+=flag;
//         }
//         StringBuilder res=new StringBuilder();
//         for(StringBuilder sBuilder:rows){
//             res.append(sBuilder.toString());
//         }
//         return res.toString();
//     }
// }