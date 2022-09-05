

/*
 * @lc app=leetcode.cn id=887 lang=java
 *
 * [887] 鸡蛋掉落
 */

// @lc code=start
class Solution {
    public int superEggDrop(int K, int N) {
        int[][] dp=new int[K+1][N+1];
        int m=0;
        while(dp[K][m]<N){
            m++;
            for(int k=1;k<=K;k++){
                dp[k][m]=dp[k][m-1]+dp[k-1][m-1]+1;
            }
        }
        return m;
    }
}
// @lc code=end



// Solution1:
// dp+线性搜索 超时   当前拥有鸡蛋数k,需要测试的楼层数n
// class Solution {
//     public int superEggDrop(int k, int n) {
//         Map<String,Integer> map=new HashMap<>();
//         return dfs(k, n, map);
//     }
//     int dfs(int k,int n,Map<String,Integer> map){
//         if(k==1){
//             return n;
//         }
//         if(n==0){
//             return 0;
//         }
//         String key=String.valueOf(k)+","+String.valueOf(n);
//         if(map.containsKey(key)){
//             return map.get(key);
//         }
//         int res=Integer.MAX_VALUE;
//         for(int i=1;i<=n;i++){
//             res=Integer.min(res, Integer.max(dfs(k, n-i, map), dfs(k-1, i-1, map))+1);
//         }
//         map.put(key, res);
//         return res;
//     }
// }


// Solution2：
// dp+二分搜索   当前拥有鸡蛋数k,需要测试的楼层数n
// class Solution {
//     public int superEggDrop(int k, int n) {
//         Map<String,Integer> map=new HashMap<>();
//         return dfs(k, n, map);
//     }
//     int dfs(int k,int n,Map<String,Integer> map){
//         if(k==1){
//             return n;
//         }
//         if(n==0){
//             return 0;
//         }
//         String key=String.valueOf(k)+","+String.valueOf(n);
//         if(map.containsKey(key)){
//             return map.get(key);
//         }
//         int res=Integer.MAX_VALUE;
//         int low=1,high=n;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             int broken=dfs(k-1, mid-1,map);
//             int not_broken=dfs(k, n-mid,map);
//             if(broken>not_broken){
//                 high=mid-1;
//                 res=Integer.min(res, broken+1);
//             }else{
//                 low=mid+1;
//                 res=Integer.min(res, not_broken+1);
//             }
//         }
//         map.put(key, res);
//         return res;
//     }
// }

// class Solution {
//     public int superEggDrop(int k, int n) {
//         Map<Integer,Integer> map=new HashMap<>();
//         return dfs(k, n, map);
//     }
//     int dfs(int k,int n,Map<Integer,Integer> map){
//         if(k==1){
//             return n;
//         }
//         if(n==0){
//             return 0;
//         }
//         Integer key=n*100+k;
//         if(map.containsKey(key)){
//             return map.get(key);
//         }
//         int res=Integer.MAX_VALUE;
//         int low=1,high=n;
//         while(low<=high){
//             int mid=low+(high-low)/2;
//             int broken=dfs(k-1, mid-1,map);
//             int not_broken=dfs(k, n-mid,map);
//             if(broken>not_broken){
//                 high=mid-1;
//                 res=Integer.min(res, broken+1);
//             }else{
//                 low=mid+1;
//                 res=Integer.min(res, not_broken+1);
//             }
//         }
//         map.put(key, res);
//         return res;
//     }
// }

// Solution3:
// ???????   dp[K][m]=N 给你K个鸡蛋，测试m次，最坏情况下最多能测试N层楼
// class Solution {
//     public int superEggDrop(int K, int N) {
//         int[][] dp=new int[K+1][N+1];
//         int m=0;
//         while(dp[K][m]<N){
//             m++;
//             for(int k=1;k<=K;k++){
//                 dp[k][m]=dp[k][m-1]+dp[k-1][m-1]+1;
//             }
//         }
//         return m;
//     }
// }