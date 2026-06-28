class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = n-1;
        long sum = 0;
        while(k>0){
            if(mul>0 && i >= 0){
                sum = sum + (long)nums[i]*mul;
                k--;
                i--;
                if(mul==1){
                    mul=1;
                } else{
                    mul--;
                }
            }
        }
        mul--;
        return sum;
    }
    
}