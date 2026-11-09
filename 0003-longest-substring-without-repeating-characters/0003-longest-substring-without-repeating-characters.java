class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (; end < s.length(); end++) {

            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {
                char left = s.charAt(start);
                map.put(left, map.get(left) - 1);
                start++;
            }

            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}