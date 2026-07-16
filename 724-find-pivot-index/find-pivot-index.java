class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum+=nums[i];
        }

        int leftsum[] = new int[nums.length + 1];
        leftsum[0] = 0;
        for(int i = 0;i <= nums.length - 1 ;i++){
            leftsum[i+1] = leftsum[i] + nums[i];
        }

        for(int i = 0 ;i < nums.length;i++){
            int rightsum = sum - leftsum[i] - nums[i];
            if(rightsum == leftsum[i]){
                return i;
            }
        }
        return -1;
    }
}