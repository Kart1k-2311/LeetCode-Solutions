class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0, end = 0;
        for (int i : nums) {
            end = end + i;
            start = Math.max(start, i);
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(nums, k, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public boolean isValid(int[] nums, int k, int mid) {
        int nhr = 1, cur = 0;
        for (int i : nums) {
            cur += i;
            if (cur > mid) {
                nhr += 1;
                cur = i;
            }
        }
        return nhr <= k;
    }
}