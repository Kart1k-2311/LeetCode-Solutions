class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int nums[] = new int[n];
        if (k == 0)
            return nums;

        int start = 0, end = 0, sum = 0;

        if (k > 0) {
            for (int i = 1; i <= k; i++) {
                sum += code[i % n];
            }
            nums[0] = sum;
            for (end = 1; end < n; end++) {
                sum -= code[end % n];
                sum += code[(end + k) % n];
                nums[end] = sum;
            }
        } else {
            k = -k;
            for (int i = 1; i <= k; i++) {
                sum += code[(n - i) % n];
            }
            nums[0] = sum;
            for (end = 1; end < n; end += 1) {
                sum += code[(end - 1 + n) % n];
                sum -= code[(end - (k + 1) + n) % n];
                nums[end] = sum;
            }
        }
        return nums;
    }
}