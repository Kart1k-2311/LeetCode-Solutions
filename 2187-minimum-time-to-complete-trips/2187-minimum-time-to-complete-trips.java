class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int temp = Integer.MAX_VALUE;
        for (int i : time) {
            temp = Math.min(temp, i);
        }
        long start = 1;
        long end = (long) temp * totalTrips;

        while(start <= end){
            long mid  = start + (end - start)/2;
            if(isValid( time , totalTrips , mid )){
                end = mid -1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
    private boolean isValid(int[] nums , int trip ,long mid ){
        long sum = 0;
        for(int i : nums){
            
            sum += mid / i ;
        
        }
        return sum >= trip;
    }
}