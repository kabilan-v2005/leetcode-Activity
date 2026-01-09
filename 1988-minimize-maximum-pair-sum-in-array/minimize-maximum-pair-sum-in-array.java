import java.util.*;

class Solution {
    public int minPairSum(int[] nums) {

        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;
        int max = 0;

        while (l < r) {
            int sum = nums[l] + nums[r];
            max = Math.max(max, sum);
            l++;
            r--;
        }

        return max;
    }
}
