import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] cur=new int[26];
        int[] cnt=new int[26];
        int m=s.length(),n=p.length();
        List<Integer> res=new LinkedList<>();
        if(m<n){
            return res;
        }
        for(char c:p.toCharArray()){
            cnt[c-'a']++;
        }
        for(int i=0;i<n;i++){
            cur[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(cur, cnt)){
            res.add(0);
        }
        for(int i=n;i<m;i++){
            cur[s.charAt(i)-'a']++;
            cur[s.charAt(i-n)-'a']--;
            if(Arrays.equals(cur, cnt)){
                res.add(i-n+1);
            }
            
        }
        return res;
    }
}
// @lc code=end


// Solution1:
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         int[] cur=new int[26];
//         int[] cnt=new int[26];
//         int m=s.length(),n=p.length();
//         List<Integer> res=new LinkedList<>();
//         if(m<n){
//             return res;
//         }
//         for(char c:p.toCharArray()){
//             cnt[c-'a']++;
//         }
//         for(int i=0;i<n;i++){
//             cur[s.charAt(i)-'a']++;
//         }
//         if(Arrays.equals(cur, cnt)){
//             res.add(0);
//         }
//         for(int i=n;i<m;i++){
//             cur[s.charAt(i)-'a']++;
//             cur[s.charAt(i-n)-'a']--;
//             if(Arrays.equals(cur, cnt)){
//                 res.add(i-n+1);
//             }
            
//         }
//         return res;
//     }
// }