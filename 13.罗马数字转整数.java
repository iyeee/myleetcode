import java.util.Map;
import java.util.HashMap;
/*
 * @lc app=leetcode.cn id=13 lang=java
 *
 * [13] 罗马数字转整数
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
    
        }};
        int ans=0,len=s.length();
        for(int i=0;i<len;i++){
            int value=map.get(s.charAt(i));
            if(i<len-1&&value<map.get(s.charAt(i+1))){
                ans-=value;
            }else{
                ans+=value;
            }
        }
        return ans;
}
}
// @lc code=end


// solution1:
// class Solution {
//     public int romanToInt(String s) {
//         int ans=0,len=s.length();
//         for(int i=0;i<len;i++){
//             char ch=s.charAt(i);
//             char ch2='\u0000';
//             if(i!=len-1){
//                 ch2=s.charAt(i+1);
//             }
//             if('I'==ch){
//                 if(ch2=='V'){
//                     ans+=4;
//                     i++;
//                 }else if(ch2=='X'){
//                     ans+=9;
//                     i++;
//                 }else{
//                     ans++;
//                 }

//             }else if('X'==ch){
//                 if(ch2=='L'){
//                     ans+=40;
//                     i++;
//                 }else if(ch2=='C'){
//                     ans+=90;
//                     i++;
//                 }else{
//                     ans+=10;
//                 }
//             }else if('C'==ch){
//                 if(ch2=='D'){
//                     ans+=400;
//                     i++;
//                 }else if(ch2=='M'){
//                     ans+=900;
//                     i++;
//                 }else{
//                     ans+=100;
//                 }
//             }else if('V'==ch){
//                 ans+=5;
//             }else if('L'==ch){
//                 ans+=50;
//             }else if('D'==ch){
//                 ans+=500;
//             }else if('M'==ch){
//                 ans+=1000;
//             }else if('C'==ch){
//                 ans+=100;
//             }else if('X'==ch){
//                 ans+=10;
//             }
//         }
//         return ans;
//     }
// }



// Solution2:
// class Solution {
//     public int romanToInt(String s) {
//         Map<Character,Integer> map=new HashMap<>(){{
//             put('I', 1);
//             put('V', 5);
//             put('X', 10);
//             put('L', 50);
//             put('C', 100);
//             put('D', 500);
//             put('M', 1000);
    
//         }};
//         int ans=0,len=s.length();
//         for(int i=0;i<len;i++){
//             int value=map.get(s.charAt(i));
//             if(i<len-1&&value<map.get(s.charAt(i+1))){
//                 ans-=value;
//             }else{
//                 ans+=value;
//             }
//         }
//         return ans;
// }
// }