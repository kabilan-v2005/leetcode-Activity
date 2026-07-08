class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0;
        // double avg = 0;
        double sum = 0;
        double max_sum = Integer.MIN_VALUE;

        for(int end = 0; end < nums.length;end++){
            sum += nums[end];

            if( end - start + 1 == k){
                max_sum = Math.max(sum,max_sum);
                sum -= nums[start];
                start++;
            }
        }
        return  max_sum/k;
    }
}