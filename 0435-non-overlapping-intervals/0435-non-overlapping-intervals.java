class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int pre = intervals[0][1] , dlt = 0;

        for(int i = 1 ; i < intervals.length ; i++){
            if(pre > intervals[i][0]){
                dlt += 1;
                pre = Math.min(pre, intervals[i][1]);
            } else{
                pre = intervals[i][1];
            }
        }
        return dlt;
    }
}