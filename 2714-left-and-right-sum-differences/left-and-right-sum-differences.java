class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        // int left[] = new int[n];
        // int right[] = new int[n];
        int leftSum = 0;
        int rightSum = 0;
        // left[0] = leftsum;
        // right[n - 1] = rightsum;

        // for(int i = 1;i < n;i++){
        //     leftsum += nums[i-1];
        //     left[i] = leftsum;
        // }

        // for(int i = n - 2;i >= 0;i--){
        //     rightsum += nums[i+1];
        //     right[i] = rightsum;
        // }
        for(int num : nums) rightSum += num;
        for(int i = 0; i < n; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
        return nums; 
        
    }
}