import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1640 lang=java
 *
 * [1640] 能否连接形成数组
 */

// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<pieces.length;i++){
            map.put(pieces[i][0], i);
        }    
        for(int i=0;i<arr.length;){
            if(!map.containsKey(arr[i])){
                return false;
            }
            int idx=map.get(arr[i]);
            int j=0;
            for(;j<pieces[idx].length;j++){
                if(arr[i+j]!=pieces[idx][j]){
                    return false;
                }
            }
            i+=j;
        }
        return true;
    }
    
}
// @lc code=end



// Solution1:
// class Solution {
//     public boolean canFormArray(int[] arr, int[][] pieces) {
//         for(int i=0;i<arr.length;i++){
//             int idx=findIndex(arr[i], pieces);
//             if(idx==-1){
//                 return false;
//             }
//             int j=0;
//             for(;j<pieces[idx].length;j++){
//                 if(arr[i+j]!=pieces[idx][j]){
//                     return false;
//                 }
//             }
//             i+=j-1;
//         }
//         return true;
//     }
//     int findIndex(int n,int[][] piececs){
//         for(int i=0;i<piececs.length;i++){
//             if(piececs[i][0]==n){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


// Solution2:
// class Solution {
//     public boolean canFormArray(int[] arr, int[][] pieces) {
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<pieces.length;i++){
//             map.put(pieces[i][0], i);
//         }    
//         for(int i=0;i<arr.length;){
//             if(!map.containsKey(arr[i])){
//                 return false;
//             }
//             int idx=map.get(arr[i]);
//             int j=0;
//             for(;j<pieces[idx].length;j++){
//                 if(arr[i+j]!=pieces[idx][j]){
//                     return false;
//                 }
//             }
//             i+=j;
//         }
//         return true;
//     }
// }