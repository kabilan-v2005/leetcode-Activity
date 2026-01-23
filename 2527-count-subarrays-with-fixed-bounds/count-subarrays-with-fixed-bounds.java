class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        long count = 0;
        int lastMin = -1;
        int lastMax = -1;
        int badIndex = -1;

        for (int i = 0; i < nums.length; i++) {

           
            if (nums[i] < minK || nums[i] > maxK) {
                badIndex = i;
            }

        
            if (nums[i] == minK) lastMin = i;
            if (nums[i] == maxK) lastMax = i;

           
            count += Math.max(0, Math.min(lastMin, lastMax) - badIndex);
        }

        return count;
    }
}
