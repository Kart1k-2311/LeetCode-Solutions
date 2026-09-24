class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int min = 0;
        for(int weight : weights){
            max = max+weight;
            min = Math.max(min,weight);
        }
        while(min<=max){
            int mid= min + (max-min)/2;
            if(isValid(weights,days,mid)){
                max = mid-1;
            } else{
                min = mid+1;
            }
        }
        return min;
    }
    boolean isValid(int[] weights,int days,int mid){
        int d =1 , curr = 0;
        for(int weight: weights){
            curr += weight;
            if(curr>mid){
                curr = weight;
                d++;
            }
        }
        return days >= d;
    }
}