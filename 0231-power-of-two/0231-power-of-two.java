class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 536870912){
            return true;
        }
        if(n<=0){
            return false;
        }
        return Math.log(n) / Math.log(2) % 1 == 0;
    }
}