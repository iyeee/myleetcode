import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 反转字符串中的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
       s=s.trim();
       List<String> wordList=Arrays.asList(s.split("\\s+"));
       Collections.reverse(wordList);
       return String.join(" ", wordList);
    }
}
// @lc code=end



// Solution1:
// class Solution {
//     public String reverseWords(String s) {
//         s=s.trim();
//        String[] split = s.split("\s++");;
//        for(int i=0,j=split.length-1;i<j;i++,j--){
//             String tmp=split[i];
//             split[i]=split[j];
//             split[j]=tmp;
//         }
//         return String.join(" ", split);
//     }
// }


// Solution1:
// class Solution {
//     public String reverseWords(String s) {
//        s=s.trim();
//        List<String> wordList=Arrays.asList(s.split("\\s+"));
//        Collections.reverse(wordList);
//        return String.join(" ", wordList);
//     }
// }
