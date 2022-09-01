import java.util.Arrays;
import java.util.Comparator;

/*
 * @lc app=leetcode.cn id=354 lang=java
 *
 * [354] 俄罗斯套娃信封问题
 */

// @lc code=start
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes,new Comparator<int[]>() {
            public int compare(int[] a,int[] b){
                return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
            }
        });
        int piles=0,n=envelopes.length;
        int[] top=new int[n];
        for(int i=0;i<n;i++){
            int poker=envelopes[i][1];
            int left=0,right=piles;
            while(left<right){
                int mid=left+(right-left)/2;
                if(top[mid]>=poker){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }
            if(left==piles){
                piles++;
            }
            top[left]=poker;
        }
        return piles;
    }
}
// @lc code=end



// Solution1:
// O(n^2) dp超时
// class Solution {
//     public int maxEnvelopes(int[][] envelopes) {
//         Arrays.sort(envelopes,new Comparator<int[]>() {
//             public int compare(int[] a,int[] b){
//                 return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
//             }
//         });
//         int[] dp=new int[envelopes.length];
//         int max=0;
//         for(int i=0;i<envelopes.length;i++){
//             dp[i]=1;
//             for(int j=0;j<i;j++){
//                 if(envelopes[i][1]>envelopes[j][1]){
//                     dp[i]=Integer.max(dp[i], dp[j]+1);
//                 }
//             }
//             max=Integer.max(max, dp[i]);
//         }
//         return max;
//     }
// }

// Solution2：
// class Solution {
//     public int maxEnvelopes(int[][] envelopes) {
//         Arrays.sort(envelopes,new Comparator<int[]>() {
//             public int compare(int[] a,int[] b){
//                 return a[0]==b[0]?b[1]-a[1]:a[0]-b[0];
//             }
//         });
//         int piles=0,n=envelopes.length;
//         int[] top=new int[n];
//         for(int i=0;i<n;i++){
//             int poker=envelopes[i][1];
//             int left=0,right=piles;
//             while(left<right){
//                 int mid=left+(right-left)/2;
//                 if(top[mid]>=poker){
//                     right=mid;
//                 }else{
//                     left=mid+1;
//                 }
//             }
//             if(left==piles){
//                 piles++;
//             }
//             top[left]=poker;
//         }
//         return piles;
//     }
// }