class Solution {
    public boolean checkIfExist(int[] nums) {
        for(int i=0;i< nums.length;i++){       
            for(int j = 0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i] == 2* nums[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}