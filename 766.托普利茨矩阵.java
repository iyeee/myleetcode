import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

/*
 * @lc app=leetcode.cn id=766 lang=java
 *
 * [766] 托普利茨矩阵
 */

// @lc code=start
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int[] ints=new int[n-1];
        for(int i=0;i<n-1;i++){
            ints[i]=matrix[0][i];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=ints[j-1]){
                    return false;
                }
                ints[j-1]=matrix[i][j-1];
            }
        }
        return true;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//         int m=matrix.length,n=matrix[0].length;
//         for(int i=0;i<n-1;i++){
//             int val=matrix[0][i];
//             for(int j=1;j<Math.min(m, n-i);j++){
//                 if(matrix[j][j+i]!=val){
//                     return false;
//                 }
//             }
//         }
//         for(int i=1;i<m-1;i++){
//             int val=matrix[i][0];
//             for(int j=1;j<Math.min(n, m-i);j++){
//                 if(matrix[j+i][j]!=val){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }

// 和官解一样，按格子读取
// Solution2:
// class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//         int m=matrix.length,n=matrix[0].length;
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                 if(matrix[i][j]!=matrix[i-1][j-1]){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }



// Solution3:
// 对于进阶问题一，一次最多只能将矩阵的一行加载到内存中，我们将每一行复制到一个连续数组中，
// 随后在读取下一行时，就与内存中此前保存的数组进行比较。
// 只能一行一行加入内存，复制到系统数组中
// class Solution {
//     public boolean isToeplitzMatrix(int[][] matrix) {
//         int m=matrix.length,n=matrix[0].length;
//         int[] ints=new int[n-1];
//         for(int i=0;i<n-1;i++){
//             ints[i]=matrix[0][i];
//         }
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                 if(matrix[i][j]!=ints[j-1]){
//                     return false;
//                 }
//                 ints[j-1]=matrix[i][j-1];
//             }
//         }
//         return true;
//     }
// }


// Solution4:
// 对于进阶问题二，一次只能将不完整的一行加载到内存中，我们将整个矩阵竖直切分成若干子矩阵，
// 并保证两个相邻的矩阵至少有一列或一行是重合的，然后判断每个子矩阵是否符合要求。
