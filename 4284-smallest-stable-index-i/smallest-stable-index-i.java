class Solution {
    public int firstStableIndex(int[] nums, int k) {
        
        boolean b = false;
        int small = Integer.MAX_VALUE;
        int ans = 0;
        for(int i = 0;i < nums.length;i++){
            int max = Integer.MIN_VALUE;
            
            for(int j = 0; j <= i; j++){
                if(nums[j] > max) {
                    max = nums[j];
                }
            }
            int min = Integer.MAX_VALUE;
            for(int j = i;j < nums.length;j++){
                // if(nums[j] > max) max = nums[j];
                if(nums[j] < min){
                    min = nums[j];
                }
            }
            if(max - min <= k){
                return i;
            }

        }
        // if(!b) return -1;
        return -1;
    }
}