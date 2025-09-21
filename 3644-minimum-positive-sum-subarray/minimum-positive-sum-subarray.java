class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        // check all window lengths from l to r
        for (int len = l; len <= r; len++) {
            if (len > n) break; // skip if length bigger than array

            int windowSum = 0;
            // first window of size len
            for (int i = 0; i < len; i++) {
                windowSum += nums.get(i);
            }
            if (windowSum > 0) {
                minSum = Math.min(minSum, windowSum);
            }

            // slide the window
            for (int i = len; i < n; i++) {
                windowSum += nums.get(i) - nums.get(i - len);
                if (windowSum > 0) {
                    minSum = Math.min(minSum, windowSum);
                }
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}
