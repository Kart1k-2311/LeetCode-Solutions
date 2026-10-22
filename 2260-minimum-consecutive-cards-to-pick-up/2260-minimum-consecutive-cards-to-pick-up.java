class Solution {
    public int minimumCardPickup(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int start = 0, cnt = Integer.MAX_VALUE;
        int end;
        for (end = 0; end < nums.length; end++) {
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
            while (map.get(nums[end]) >= 2) {
                cnt = Math.min(cnt, end - start + 1);
                map.put(nums[start], map.get(nums[start]) - 1);
                start++;
            }
        }
        return cnt == Integer.MAX_VALUE ? -1 : cnt;
    }
}