class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> Integer.compare(x[0], y[0]));

        ArrayList<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i  =1 ; i < intervals.length; i++){

             if(intervals[i][0] <= end){
                end = Math.max(end , intervals[i][1]);
            } else{
                result.add(new int[] {start , end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[] {start , end});

        int[][] res = new int[result.size()][2];

        int index = 0;
        for(int[] interval : result){
            res[index++] = interval;
        }
        return res;
    }
}