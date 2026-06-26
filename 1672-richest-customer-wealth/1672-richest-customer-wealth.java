class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for(int i[]: accounts){
            int sum = 0;
            for(int j : i){
                sum+= j;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}