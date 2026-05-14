class Solution {

    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int n=nums.length;

        // Last number should be n-1
        if (nums[n - 1]!=n - 1) {
            return false;
        }

        // Check 1 to n-2 appear once
        for (int i = 0;i < n - 1; i++) {

            if (nums[i]!=i + 1) {
                return false;
            }
        }

        return nums[n - 1]==nums[n - 2];
    }
}