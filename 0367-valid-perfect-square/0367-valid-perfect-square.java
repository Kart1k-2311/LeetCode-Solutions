class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        if(ans == (int)ans){
            return true;
        } else{
            return false;
        }
    }
}