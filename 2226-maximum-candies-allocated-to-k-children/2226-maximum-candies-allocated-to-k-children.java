class Solution {
    public int maximumCandies(int[] candies, long k) {
        int start = 1, end = 0;
        for(int i : candies){
            end = Math.max(end,i);
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValid(candies, k ,mid)){
                start = mid +1;
            } else{
                end = mid -1;
            }
        }
        return end;
    }
    private boolean isValid(int[] nums , long k , int mid ){
        long nhr = 0;
        for(int i : nums){
            nhr += i/mid;
        }
        return k <= nhr;
    }
}