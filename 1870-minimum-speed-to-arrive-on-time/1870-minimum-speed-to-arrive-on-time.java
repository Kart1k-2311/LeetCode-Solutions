class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int start = 1, end = 10000000;
        while(start<=end){
            int mid = start + (end- start)/2;
            if(isValid(dist, hour , mid)){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return (start == 10000001) ? -1 : start;
    }
    static boolean isValid(int[] nums , double k , int mid){
        double nhr = 0;
        for(int i = 0; i< nums.length-1 ; i++ ){
            nhr += Math.ceil((double)nums[i]/(double)mid);
        }
        nhr += (double)nums[nums.length-1]/(double)mid;
        return nhr <= k;
    }
}