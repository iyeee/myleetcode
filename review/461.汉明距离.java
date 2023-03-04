/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int z=x^y,res=0;
        while(z!=0){
            res+=(z&1);
            z>>=1;
        }
        return res;
    }
}
// @lc code=end


// Solution1
// class Solution {
//     public int hammingDistance(int x, int y) {
//         int z=x^y;
//         String binaryString = Integer.toBinaryString(z);
//         int count=0;
//         for(char c:binaryString.toCharArray()){
//             if(c=='1'){
//                 count++;
//             }
//         }
//         return count;
//     }
// }


// Solution2:
// class Solution {
//     public int hammingDistance(int x, int y) {
//         return Integer.bitCount(x^y);
//     }
// }



// Solution3
// class Solution {
//     public int hammingDistance(int x, int y) {
//         int z=x^y,res=0;
//         while(z!=0){
//             res+=(z&1);
//             z>>=1;
//         }
//         return res;
//     }
// }