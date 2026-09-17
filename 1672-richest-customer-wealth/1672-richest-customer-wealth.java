class Solution {
    public int maximumWealth(int[][] nums) {
        int max = 0;
        for(int i = 0;  i< nums.length ;i++){
            int count= 0;
            for(int j = 0; j< nums[0].length;j++){
                count = count + nums[i][j];
            }
            if(max<count){
                max = count;
            }
        }
        return max;
    }
}