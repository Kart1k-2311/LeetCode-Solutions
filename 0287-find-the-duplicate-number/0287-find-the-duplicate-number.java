class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        int right = 0;
        while(i < nums.length){
            right = nums[i] - 1;
            if(nums[right]!=nums[i]){
                swapp(nums, right, i);
            } else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j]!=j+1){
               return nums[j];
            }
        }
        return -1;
    }
    void swapp(int[] nums, int first,int last){
        int temp = nums[first];
        nums[first]=nums[last];
        nums[last] = temp;
    }    
    
}