class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int max = 0;
        int min = nums[0];
        for(int i = 1; i< nums.length;i++){
            profit = nums[i] - min;
            if(profit>max){
                max=profit;
            }
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return max;
    }
}