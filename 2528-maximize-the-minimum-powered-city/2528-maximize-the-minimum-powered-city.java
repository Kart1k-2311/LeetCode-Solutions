class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;

        long[] powerDiff = new long[n + 1];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n - 1, i + r);

            powerDiff[left] += stations[i];
            powerDiff[right + 1] -= stations[i];
        }

        long[] initialPow = new long[n];
        long curPow = 0;
        long minPow = Long.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            curPow += powerDiff[j];
            initialPow[j] = curPow;
            minPow = Math.min(minPow, initialPow[j]);
        }

        long low = minPow;
        long high = minPow + k;
        for (int station : stations) {
            high += station;
        }

        long ans = low;
        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isValid(initialPow, r, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private boolean isValid(long[] initialPow, int r, int k, long mid) {
        int n = initialPow.length;
        long[] addPow = new long[n + 1];
        long actPow = 0;
        long rem = k;

        for (int i = 0; i < n; i++) {
            actPow += addPow[i];
            long currCityPow = initialPow[i] + actPow;

            if (currCityPow < mid) {
                long buildStation = mid - currCityPow;
                if (buildStation > rem) {
                    return false;
                }
                rem -= buildStation;
                actPow += buildStation;

                int buildCity = Math.min(n - 1, i + r);
                int outOfRangeCity = buildCity + r + 1;
                if (outOfRangeCity <= n) {
                    addPow[outOfRangeCity] -= buildStation;
                }
            }
        }

        return true;
    }
}