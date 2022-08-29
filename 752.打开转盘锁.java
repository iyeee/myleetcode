import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=752 lang=java
 *
 * [752] 打开转盘锁
 */

// @lc code=start
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> deads=new HashSet<>();
        for(String s:deadends) deads.add(s);
        Queue<String> q=new LinkedList<>();
        int step=0;
        q.offer("0000");
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                String cur=q.poll();
                if(deads.contains(cur)){
                    continue;
                }
                if(cur.equals(target)){
                    return step;
                }
                for(int j=0;j<4;j++){
                    String up=plusOne(cur, j);
                    if(!deads.contains(up)){
                        q.offer(up);
                    }
                    String down=minusOne(cur, j);
                    if(!deads.contains(down)){
                        q.offer(down);
                    }
                }
                deads.add(cur);
            }

            step++;
        }
        return -1;
    }
    String plusOne(String s,int i){
        char[] ch=s.toCharArray();
        if(ch[i]=='9'){
            ch[i]='0';
        }else{
            ch[i]+=1;
        }
        return new String(ch);
    }
    String minusOne(String s,int i){
        char[] ch=s.toCharArray();
        if(ch[i]=='0'){
            ch[i]='9';
        }else{
            ch[i]-=1;
        }
        return new String(ch);
    }

}
// @lc code=end

// Solution1:
// class Solution {
//     public int openLock(String[] deadends, String target) {
//         Set<String> deads=new HashSet<>();
//         for(String s:deadends) deads.add(s);
//         Set<String> visited=new HashSet<>();
//         Queue<String> q=new LinkedList<>();
//         int step=0;
//         q.offer("0000");
//         visited.add("0000");
//         while(!q.isEmpty()){
//             int sz=q.size();
//             for(int i=0;i<sz;i++){
//                 String cur=q.poll();
//                 if(deads.contains(cur)){
//                     continue;
//                 }
//                 if(cur.equals(target)){
//                     return step;
//                 }
//                 for(int j=0;j<4;j++){
//                     String up=plusOne(cur, j);
//                     if(!visited.contains(up)){
//                         q.offer(up);
//                         visited.add(up);
//                     }
//                     String down=minusOne(cur, j);
//                     if(!visited.contains(down)){
//                         q.offer(down);
//                         visited.add(down);
//                     }
//                 }
//             }
//             step++;
//         }
//         return -1;
//     }
//     String plusOne(String s,int i){
//         char[] ch=s.toCharArray();
//         if(ch[i]=='9'){
//             ch[i]='0';
//         }else{
//             ch[i]+=1;
//         }
//         return new String(ch);
//     }
//     String minusOne(String s,int i){
//         char[] ch=s.toCharArray();
//         if(ch[i]=='0'){
//             ch[i]='9';
//         }else{
//             ch[i]-=1;
//         }
//         return new String(ch);
//     }

// }


// Solution2:
// deads充当visited
// class Solution {
//     public int openLock(String[] deadends, String target) {
//         Set<String> deads=new HashSet<>();
//         for(String s:deadends) deads.add(s);
//         Queue<String> q=new LinkedList<>();
//         int step=0;
//         q.offer("0000");
//         while(!q.isEmpty()){
//             int sz=q.size();
//             for(int i=0;i<sz;i++){
//                 String cur=q.poll();
//                 if(deads.contains(cur)){
//                     continue;
//                 }
//                 if(cur.equals(target)){
//                     return step;
//                 }
//                 for(int j=0;j<4;j++){
//                     String up=plusOne(cur, j);
//                     if(!deads.contains(up)){
//                         q.offer(up);
//                     }
//                     String down=minusOne(cur, j);
//                     if(!deads.contains(down)){
//                         q.offer(down);
//                     }
//                 }
//                 deads.add(cur);
//             }

//             step++;
//         }
//         return -1;
//     }
//     String plusOne(String s,int i){
//         char[] ch=s.toCharArray();
//         if(ch[i]=='9'){
//             ch[i]='0';
//         }else{
//             ch[i]+=1;
//         }
//         return new String(ch);
//     }
//     String minusOne(String s,int i){
//         char[] ch=s.toCharArray();
//         if(ch[i]=='0'){
//             ch[i]='9';
//         }else{
//             ch[i]-=1;
//         }
//         return new String(ch);
//     }

// }