class Solution {
    public int heightChecker(int[] heights) {
        int[] excepted = heights.clone();
        int count=0;
        Arrays.sort(excepted);
        for(int i =0;i<heights.length;i++){
            if(excepted[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}