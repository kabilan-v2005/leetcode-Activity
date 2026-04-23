import java.util.*;

class Solution {
    public long[] distance(int[] nums) {

        int n = nums.length;
        long[] res = new long[n];

        Map<Integer, Long> count = new HashMap<>();
        Map<Integer, Long> sum = new HashMap<>();

        // LEFT PASS
        for (int i = 0; i < n; i++) {
            int val = nums[i];

            long c = count.getOrDefault(val, 0L);
            long s = sum.getOrDefault(val, 0L);

            res[i] += c * i - s;

            count.put(val, c + 1);
            sum.put(val, s + i);
        }

        count.clear();
        sum.clear();

        // RIGHT PASS
        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];

            long c = count.getOrDefault(val, 0L);
            long s = sum.getOrDefault(val, 0L);

            res[i] += s - c * i;

            count.put(val, c + 1);
            sum.put(val, s + i);
        }

        return res;
    }
}