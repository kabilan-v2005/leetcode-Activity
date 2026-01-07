import java.util.*;

class Solution {
    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        double min = Double.MAX_VALUE;
        int l = 0, r = nums.length - 1;

        while (l < r) {
            double avg = (nums[l] + nums[r]) / 2.0;
            min = Math.min(min, avg);
            l++;
            r--;
        }

        return min;
    }
}
