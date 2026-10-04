class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // Sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int count = 0;

        int previousEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // Overlap
            if (currentStart < previousEnd) {

                count++;

                // Keep the interval ending earlier
                previousEnd = Math.min(previousEnd, currentEnd);

            } else {

                // No overlap
                previousEnd = currentEnd;
            }
        }

        return count;
    }
}