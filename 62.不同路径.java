import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=62 lang=java
 *
 * [62] 不同路径
 */

// @lc code=start

class Solution {
    public int uniquePaths(int m, int n) {
        int[] cur=new int[n];
        Arrays.fill(cur, 1);
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                cur[j]+=cur[j-1];
            }
        }
        return cur[n-1];
    }
}
// @lc code=end



// Solution1:
//C(m-1,m+n-2)
// class Solution {
//     public int uniquePaths(int m, int n) {
//         long res=1;
//         for(int x=n,y=1;y<m;x++,y++){
//             res=res*x/y;
//         }
//         return (int)res;
//     }
// }

// class Solution {
//     public int uniquePaths(int m, int n) {
//         int min=Integer.min(m, n);
//         if(min<=1){
//             return min;
//         }
//         long res=1L;
//         int n1=min-1;
//         int n2=m+n-2;
//         for(int i=0;i<n1;i++){
//             res=res*(n2-i)/(i+1);
//         }
//         return (int)res;
//     }
// }

// dp
// Solution2:
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[][] arrs=new int[m][n];
//         for(int i=0;i<n;i++){
//             arrs[0][i]=1;
//         }
//         for(int i=0;i<m;i++){
//             arrs[i][0]=1;
//         }
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                 arrs[i][j]=arrs[i][j-1]+arrs[i-1][j];
//             }
//         }
//         return arrs[m-1][n-1];

//     }
// }

// dp+状态压缩
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[] cur=new int[n];
//         Arrays.fill(cur, 1);
//         for(int i=1;i<m;i++){
//             for(int j=1;j<n;j++){
//                 cur[j]+=cur[j-1];
//             }
//         }
//         return cur[n-1];
//     }
// }