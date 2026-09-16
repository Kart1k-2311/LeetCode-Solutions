class Solution {
    public boolean isPowerOfThree(int n) {
        if(n ==1 ){
            return true;
        }
        if(n<=0){
            return false;
        }
        int i = 0;
        while(i<Math.sqrt(n)){
            if(Math.pow(3,i) == n){
                return true;
            } else if(Math.pow(3,i)<n){
                i++;
            } else{
                return false;
            }
        }
        return false;
    }
}