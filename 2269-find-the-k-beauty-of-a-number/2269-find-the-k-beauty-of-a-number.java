class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int cnt = 0;
        for(int i = 0 ; i <= s.length() -k ; i++){
            int dgt = Integer.parseInt(s.substring(i, i + k));
            if( dgt != 0 && num % dgt ==0){
                cnt++;
            }
        }
        return cnt;
    }
}