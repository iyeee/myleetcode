import java.util.Map;
import java.util.HashMap;
/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> need=new HashMap<>(); 
        Map<Character,Integer> window=new HashMap<>();
        for(Character c:t.toCharArray()){
            need.put(c, need.getOrDefault(c, 0)+1);
        } 
        int left=0,right=0;
        int vaild=0;
        int start=0,len=Integer.MAX_VALUE;
        while(right<s.length()){
            char c=s.charAt(right);
            right++;
            if(need.containsKey(c)){
                window.put(c, window.getOrDefault(c, 0)+1);
                if(window.get(c).equals(need.get(c))){
                    vaild++;
                }

            }
            while(vaild==need.size()){
                if(right-left<len){
                    start=left;
                    len=right-left;
                }
                char d=s.charAt(left);
                left++;
                if(need.containsKey(d)){
                    if(window.get(d).equals(need.get(d))){
                        vaild--;
                    }
                    window.put(d, window.get(d)-1);
                }
            }
          
        }
        return len==Integer.MAX_VALUE?"":s.substring(start,start+len);

    }
}
// @lc code=end



// Solution1：
// 滑动窗口
// Integer比较大小用equals

// class Solution {
//     public String minWindow(String s, String t) {
//         Map<Character,Integer> need=new HashMap<>(); 
//         Map<Character,Integer> window=new HashMap<>();
//         for(Character c:t.toCharArray()){
//             need.put(c, need.getOrDefault(c, 0)+1);
//         } 
//         int left=0,right=0;
//         int vaild=0;
//         int start=0,len=Integer.MAX_VALUE;
//         while(right<s.length()){
//             char c=s.charAt(right);
//             right++;
//             if(need.containsKey(c)){
//                 window.put(c, window.getOrDefault(c, 0)+1);
//                 if(window.get(c).equals(need.get(c))){
//                     vaild++;
//                 }

//             }
//             while(vaild==need.size()){
//                 if(right-left<len){
//                     start=left;
//                     len=right-left;
//                 }
//                 char d=s.charAt(left);
//                 left++;
//                 if(need.containsKey(d)){
//                     if(window.get(d).equals(need.get(d))){
//                         vaild--;
//                     }
//                     window.put(d, window.get(d)-1);
//                 }
//             }
          
//         }
//         return len==Integer.MAX_VALUE?"":s.substring(start,start+len);

//     }
// }