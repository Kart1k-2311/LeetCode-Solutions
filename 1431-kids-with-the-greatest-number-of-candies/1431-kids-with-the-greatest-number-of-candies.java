class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int k) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        List<Boolean> ans = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            ans.add(nums[i] + k >= max);
        }
        return ans;
    }
}