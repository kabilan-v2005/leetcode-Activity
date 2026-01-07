class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = i + 2;

            // Find j such that nums[j] - nums[i] == diff
            while (j < n && nums[j] - nums[i] < diff) j++;

            if (j >= n || nums[j] - nums[i] != diff) continue;

            // Find k such that nums[k] - nums[j] == diff
            while (k < n && nums[k] - nums[j] < diff) k++;

            if (k < n && nums[k] - nums[j] == diff) {
                count++;
            }
        }

        return count;
    }
}
