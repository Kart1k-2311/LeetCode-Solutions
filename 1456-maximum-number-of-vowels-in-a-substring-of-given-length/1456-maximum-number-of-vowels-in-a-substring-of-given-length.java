class Solution {
    public int maxVowels(String s, int k) {
        int start = 0, end = 0, cnt = 0, max = 0;
        for (; end < s.length(); end++) {
            if (isVowels(s.charAt(end))) {
                cnt += 1;
            }
            if (end >= k - 1) {
                max = Math.max(cnt, max);
                if (isVowels(s.charAt(start))) {
                    cnt -= 1;
                }
                start++;
            }
        }
        return max;
    }
    private boolean isVowels(char s ){
        if( s == 'a' || s == 'e' ||s == 'i' ||s == 'o' ||s == 'u' ){
            return true;
        }
        return false;
    }
}