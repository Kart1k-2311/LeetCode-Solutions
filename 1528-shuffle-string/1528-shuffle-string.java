class Solution {
    public String restoreString(String s, int[] nums) {
        int n = s.length();
        char[] ans = new char[n];
        for(int i=0;i<n;i++){
            ans[nums[i]]= s.charAt(i);
        }
        return new String(ans);
    }
}