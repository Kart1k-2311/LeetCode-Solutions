class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        Arrays.sort(nums);
        int mini=0;
        int absolute =nums[1]-nums[0];
        for(int i=1;i<nums.length;i++){
            mini = nums[i]-nums[i-1];
            if(absolute>mini){
                absolute =mini;
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int j = 1;j<nums.length;j++){
            List<Integer> pair = new ArrayList<>();
            if(nums[j]-nums[j-1]==absolute){
                pair.add(nums[j-1]);
                pair.add(nums[j]);
                ans.add(pair);
            }
        }
        return ans;
    }
}