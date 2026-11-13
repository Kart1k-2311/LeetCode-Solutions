class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0 , sum = 0 , maxlength = 0;
        for(int end = 0 ; end < s.length() ; end++ ){
            sum += Math.abs(s.charAt(end) - t.charAt(end));
            while(sum > maxCost){
                sum -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }
            maxlength = Math.max(maxlength, end - start +1);
        }
        return maxlength;
    }
}