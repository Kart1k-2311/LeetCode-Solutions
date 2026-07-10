class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int j = 0;
        int k = s.length();
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                k--;
                j++;
                if (k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}