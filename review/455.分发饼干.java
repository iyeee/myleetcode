import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length&&j<s.length){
            if(g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         g=Arrays.stream(g).boxed().sorted((o1,o2)->o2-o1).mapToInt(int1->int1).toArray();
//         s=Arrays.stream(s).boxed().sorted((o1,o2)->o2-o1).mapToInt(int1->int1).toArray();
//         int res=0;
//         int index=0;
//         for(int n:g){
//             if(index==s.length){
//                 return res;
//             }       
//             if(s[index]>=n){
//                 res++;
//                 index++;
//             }else{
//                 continue;
//             }
//         }
//         return res;
//     }
// }


// Solution2:
// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);
//         Arrays.sort(s);
//         int i=0;
//         int j=0;
//         while(i<g.length&&j<s.length){
//             if(g[i]<=s[j]){
//                 i++;
//             }
//             j++;
//         }
//         return i;
//     }
// }