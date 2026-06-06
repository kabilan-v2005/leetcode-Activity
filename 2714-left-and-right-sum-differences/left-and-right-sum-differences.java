class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int leftsum = 0;
        int rightsum = 0;
        left[0] = leftsum;
        right[n - 1] = rightsum;

        for(int i = 1;i < n;i++){
            leftsum += nums[i-1];
            left[i] = leftsum;
        }

        for(int i = n - 2;i >= 0;i--){
            rightsum += nums[i+1];
            right[i] = rightsum;
        }
        int result[] = new int[n];
        for(int i = 0;i < n;i++){
            result[i] = Math.abs(left[i] - right[i]);
        }
        return result;
    }
}