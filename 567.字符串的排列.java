import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=567 lang=java
 *
 * [567] 字符串的排列
 */

// @lc code=start
class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int m=s1.length();
            int n=s2.length();
            if(m>n){
                return false;
            }
            int[] cnt=new int[26];
            int[] cur=new int[26];
            for(char c:s1.toCharArray()){
                cnt[c-'a']++;
            }
            for(int i=0;i<m;i++){
                cur[s2.charAt(i)-'a']++;
            }
            //Arrays.equals(cnt, cur)
            if(check(cur, cnt)){
                return true;
            }
            for(int i=m;i<n;i++){
                cur[s2.charAt(i)-'a']++;
                cur[s2.charAt(i-m)-'a']--;
                if(check(cur, cnt)){
                    return true;
                }
            }
            return false;
        }
         //Arrays.equals(cnt, cur)
        boolean check(int[] cur,int[] cnt){
            for(int i=0;i<26;i++){
                if(cur[i]!=cnt[i]){
                    return false;
                }
            }
            return true;
        }
    }

// @lc code=end

// Solution1:
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         Map<Character,Integer> need=new HashMap<>(); 
//         Map<Character,Integer> window=new HashMap<>();
//         for(Character c:s1.toCharArray()){
//             need.put(c, need.getOrDefault(c, 0)+1);
//         } 
//         int left=0,right=0;
//         int vaild=0;
//         while(right<s2.length()){
//             char c=s2.charAt(right);
//             right++;
//             if(need.containsKey(c)){
//                 window.put(c, window.getOrDefault(c, 0)+1);
//                 if(window.get(c).equals(need.get(c))){
//                     vaild++;
//                 }

//             }
//             if(right-left==s1.length()){
//                 if(vaild==need.size()){
//                     return true;
//                 }
//                 char d=s2.charAt(left);
//                 left++;
//                 if(need.containsKey(d)){
//                     if(need.get(d).equals(window.get(d))){
//                         vaild--;
//                     }
//                     window.put(d, window.get(d)-1);
//                 }
//             }
//         }
//         return false;
//     }

// }



// Solution2:
// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int m=s1.length();
//         int n=s2.length();
//         if(m>n){
//             return false;
//         }
//         int[] cnt=new int[26];
//         int[] cur=new int[26];
//         for(char c:s1.toCharArray()){
//             cnt[c-'a']++;
//         }
//         for(int i=0;i<m;i++){
//             cur[s2.charAt(i)-'a']++;
//         }
//         //Arrays.equals(cnt, cur)
//         if(check(cur, cnt)){
//             return true;
//         }
//         for(int i=m;i<n;i++){
//             cur[s2.charAt(i)-'a']++;
//             cur[s2.charAt(i-m)-'a']--;
//             if(check(cur, cnt)){
//                 return true;
//             }
//         }
//         return false;
//     }
//      //Arrays.equals(cnt, cur)
//     boolean check(int[] cur,int[] cnt){
//         for(int i=0;i<26;i++){
//             if(cur[i]!=cnt[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }