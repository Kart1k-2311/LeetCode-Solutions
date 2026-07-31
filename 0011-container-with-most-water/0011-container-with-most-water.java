class Solution {
    public int maxArea(int[] nums) {
        int left =0;
        int right = nums.length-1;
        int f1= 0;
        while(left<right){
            f1 = Math.max(f1, (right-left)* Math.min(nums[left] ,nums[right]));
            if(nums[left]<nums[right]){
                left++;
            } else{
                right--;
            }
        }
        return f1;
    }
}