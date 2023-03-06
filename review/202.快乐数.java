import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        int tmp=n;
        while(tmp!=1&&!set.contains(tmp)){
            set.add(tmp);
            tmp=sum(tmp);
        }
        return tmp==1;
    }
    int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
// @lc code=end

// Solution1:
// class Solution {
//     public boolean isHappy(int n) {
//         Set<Integer> set=new HashSet<>();
//         set.add(n);
//         int sum=n;
//         while(true){
//             sum = sum(sum);
//             if(sum==1){
//                 return true;
//             }
//             if(set.contains(sum)){
//                 return false;
//             }
//             set.add(sum);
//         }
//     }
//     int sum(int n){
//         int sum=0;
//         while(n!=0){
//             sum+=Math.pow(n%10,2);
//             n/=10;
//         }
//         return sum;
//     }
// }


// class Solution {
//     public boolean isHappy(int n) {
//         Set<Integer> set=new HashSet<>();
//         int tmp=n;
//         while(tmp!=1&&!set.contains(tmp)){
//             set.add(tmp);
//             tmp=sum(tmp);
//         }
//         return tmp==1;
//     }
//     int sum(int n){
//         int sum=0;
//         while(n!=0){
//             sum+=Math.pow(n%10,2);
//             n/=10;
//         }
//         return sum;
//     }
// }