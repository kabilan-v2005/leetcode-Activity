class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i = 0;
        int maxReach = 0;        
        while (i < n && i <= maxReach) {  
            maxReach = Math.max(maxReach, i + nums[i]);  
            if (maxReach >= n - 1) return true;  
            i++;  
        }
        return false;
    }
}
