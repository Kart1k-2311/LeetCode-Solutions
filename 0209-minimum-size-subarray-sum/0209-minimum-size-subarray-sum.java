class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start =0 , sum =0 ,  max = Integer.MAX_VALUE;
        int end;
        int len = Integer.MAX_VALUE; 
        for(end = 0; end<nums.length ; end ++){
            sum += nums[end];
            while(sum>=target){
                max = Math.min(sum , max);
                sum -= nums[start];
                int ans = end - start +1 ;
                len = Math.min(len , ans);
                start +=1;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}