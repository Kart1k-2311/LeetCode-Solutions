class Solution {
    public int minDays(int[] nums, int m, int k) {
        if((long)m*k > nums.length){
            return -1;
        }
        int start = Integer.MAX_VALUE , end = Integer.MIN_VALUE;
        for(int i: nums){
            end = Math.max(end , i);
            start = Math.min(start,i);
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValid(nums,k,m,mid)){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
    private boolean isValid(int[] nums , int k , int m , int mid){
        int cnt =0 , flowerCnt = 0;
        for(int i : nums){
            if(i <= mid){
                flowerCnt++;
                if(flowerCnt == k){ //  = 1
                    cnt++;
                    flowerCnt = 0; // 1 ,3 ,10 ,10 ,2   k = 2 ,  m = 2
                }
            } else{
                flowerCnt = 0;
            }
        }
        return cnt >= m;
    }
}