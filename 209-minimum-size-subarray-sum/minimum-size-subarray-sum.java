class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        // int end = 0;
        int size = Integer.MAX_VALUE;
        int sum = 0;

        for(int end = 0; end < nums.length;end++){
            sum += nums[end];

            while(sum >= target){

                size = Math.min(size , end - start +1);
                sum -= nums[start];
                start++;
            }
        }

        return size == Integer.MAX_VALUE ? 0 : size;
    }
}