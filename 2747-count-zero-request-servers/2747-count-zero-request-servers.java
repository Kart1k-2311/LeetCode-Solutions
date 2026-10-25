class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = logs.length;
        int q = queries.length;

        // Sort logs by timestamp
        Arrays.sort(logs, (a, b) ->
            Integer.compare(a[1], b[1]));

        // Store query time and original index
        int[][] sortedQueries = new int[q][2];

        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }

        // Sort queries by time
        Arrays.sort(sortedQueries, (a, b) ->
            Integer.compare(a[0], b[0]));

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int windowStart = 0;
        int windowEnd = 0;

        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            int time = sortedQueries[i][0];
            int index = sortedQueries[i][1];
            int startTime = time - x;

            // Add logs up to the current query time
            while (windowEnd < m &&
                   logs[windowEnd][1] <= time) {

                int serverId = logs[windowEnd][0];

                freqMap.put(
                    serverId,
                    freqMap.getOrDefault(serverId, 0) + 1
                );

                windowEnd++;
            }

            // Remove logs outside the time window
            while (windowStart < windowEnd &&
                   logs[windowStart][1] < startTime) {

                int serverId = logs[windowStart][0];

                freqMap.put(
                    serverId,
                    freqMap.get(serverId) - 1
                );

                if (freqMap.get(serverId) == 0) {
                    freqMap.remove(serverId);
                }

                windowStart++;
            }

            // Count servers with zero requests
            result[index] = n - freqMap.size();
        }

        return result;
    }
}