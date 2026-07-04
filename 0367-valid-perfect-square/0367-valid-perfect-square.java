// class Solution {
//     public boolean isPerfectSquare(int num) {
//         double ans = Math.sqrt(num);
//         if(ans == (int)ans){
//             return true;
//         } else{
//             return false;
//         }
//     }
// }
class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end=num;
        while(start<=end){
            int mid = start + (end-start) / 2;
            long ans = (long) mid * mid;
            if(num == ans){
                return true;
            } else if(ans>num){
                end = mid-1;
            } else{
                start = mid +1;
            }
        }
        return false;
    }
}