/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start

class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        return n > 0 ? quick(x, n) : 1 / quick(x, -n);
    }

    double quick(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double y = quick(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}
// @lc code=end
// @lc code=end
// Solution1:
// class Solution {
//     public double myPow(double x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         return n > 0 ? quick(x, n) : 1 / quick(x, -n);
//     }

//     double quick(double x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         double y = quick(x, n / 2);
//         return n % 2 == 0 ? y * y : y * y * x;
//     }
// }


// Solution2:
// class Solution {
//     public double myPow(double x, int n) {
//         if (x == 0) {
//             return 0;
//         }
//         return n > 0 ? quick(x, (long)n) : 1 / quick(x, -(long)n);
//     }

//     double quick(double x, long n) {
//         double ans=1.0;
//         double contribute=x;
//         while(n>0){
//             if(n%2==1){
//                 ans*=contribute;
//             }
//             contribute*=contribute; 
//             n/=2;   
//         }
//         return ans;
//     }
// }