class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int sum = 0;
        while(n>0){
            int rev=n%10;
            n=n/10;
            sum = sum*10 + rev;
            
        }
        if(sum==x){
            return true;
        }
        return false;
        
    }
}